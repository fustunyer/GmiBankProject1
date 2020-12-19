package gmibank.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmibank.pojos.Customer;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.DatabaseUtility;
import gmibank.utilities.ReadTxt;
import gmibank.utilities.WriteToTxt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.Response.*;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.io.IOException;
import java.util.*;

import static io.restassured.RestAssured.given;


public class CustomerApiStepDef {
    Response response;
    Customer []  customers;

    @Given("user read all customer and sets response using to api end point {string}")
    public void user_read_all_customer_and_sets_response_using_to_api_end_point(String api_endpoint) {
        response=given().headers(
                            "Authorization",
                             "Bearer " + ConfigurationReader.getProperty("token"),
                             "Content-Type",
                             ContentType.JSON,
                            "Accept",
                            ContentType.JSON)
                            .when()
                            .get(api_endpoint)
                            .then()
                            .contentType(ContentType.JSON)
                            .statusCode(200)
                            .extract()
                            .response();
       // response.prettyPrint();

        }
    List<String> allSsn=new ArrayList<>();
    @Given("user deserialization customer data json to java pojo")
    public void user_deserialization_customer_data_json_to_java_pojo() throws Exception {
        ObjectMapper objectMapper=new ObjectMapper();
        customers=objectMapper.readValue(response.asString(),Customer[].class);
        for (int i=0; i< customers.length;i++) {
            allSsn.add(customers[i].getSsn());
        }
        System.out.println(allSsn);

        WriteToTxt.saveDataInFile("allCustomerSsn1.txt",customers);
        List<String> customerSNNList=ReadTxt.returnCustomerSNNList("allCustomerSsn1.txt");

        Assert.assertEquals("not verify",allSsn,customerSNNList);

    }

    @Then("user validates all data")
    public void user_validates_all_data() throws Exception {


    }


}
