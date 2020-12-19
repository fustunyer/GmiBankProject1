package gmibank.stepdefinitions;

import gmibank.utilities.DatabaseUtility;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.util.List;

public class DatabseStepDefinitions {
    @Given("user connect database and print all data")
    public void user_connect_database_and_print_all_data() {
        DatabaseUtility.createConnection();

        String query = "SELECT * FROM public.tp_customer";
        List<Object> list = DatabaseUtility.getColumnData(query, "ID");
        List<String> list2=DatabaseUtility.getColumnNames(query);

        for(String w : list2){
            System.out.println(w.toString());
        }


         }




}
