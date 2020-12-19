package gmibank.stepdefinitions;

import gmibank.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class CountryApiStepDef {
    Response responseAll;


    @Given("user sets the response using api end point {string} and creates country using {string} and {string}")
    public void user_sets_the_response_using_api_end_point_and_creates_country_using_and(String endpoint, String type, String country) {
       /* Response response=given().headers(
                             "Authorization",
                             "Bearer " + ConfigurationReader.getProperty("token"),
                             "Content-Type",
                              ContentType.JSON,
                            "Accept",
                             ContentType.JSON)
                .when().body("{\""+type+"\":\""+country+"\"}")
                            .post(endpoint)
                            .then()
                            .contentType(ContentType.JSON)
                            .extract()
                            .response();
        response.prettyPrint();*/
    }


    @Given("user sets the countries to response using {string}")
    public void user_sets_the_countries_to_response_using(String endpoint) {
       responseAll= given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        responseAll.prettyPrint();
    }

    @Given("user saves the countries to correspondent files")
    public void user_saves_the_countries_to_correspondent_files() {
        JsonPath jsonPath=responseAll.jsonPath();

        String id=jsonPath.getString("id");

        Assert.assertTrue("not verify",id.contains("18940"));
    }

    @Then("user validates the countries")
    public void user_validates_the_countries() {

    }

    @Given("user deletes a country using endpoint {string} and its extension {string}")
    public void user_deletes_a_country_using_endpoint_and_its_extension(String endpoint, String id) {
        Response response =given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .delete(endpoint+id)
                .then()
                .extract()
                .response();

        responseAll=given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(endpoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        JsonPath jsonPath=responseAll.jsonPath();

        String idAll=jsonPath.getString("id");


        Assert.assertFalse("not verify",idAll.contains(id));


    }

}
