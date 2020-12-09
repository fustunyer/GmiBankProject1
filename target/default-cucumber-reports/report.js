$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/api.feature");
formatter.feature({
  "name": "Gmi Bank All Customer Info",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AllCustomerApi"
    }
  ]
});
formatter.scenario({
  "name": "Read and validate all customer data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AllCustomerApi"
    }
  ]
});
formatter.step({
  "name": "user read all customer and sets response using to api end point \"https://www.gmibank.com/api/tp-customers\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CustomerApiStepDef.user_read_all_customer_and_sets_response_using_to_api_end_point(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user deserialization customer data json to java pojo",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CustomerApiStepDef.user_deserialization_customer_data_json_to_java_pojo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates all data",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CustomerApiStepDef.user_validates_all_data()"
});
formatter.result({
  "status": "passed"
});
});