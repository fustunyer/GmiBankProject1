$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/GmiBank.feature");
formatter.feature({
  "name": "Go To Home Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@gmibankhomepage"
    }
  ]
});
formatter.scenario({
  "name": "User go to GmiBank home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@gmibankhomepage"
    }
  ]
});
formatter.step({
  "name": "user go to \"http://www.gmibank.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.GmibankStepDefinitions.user_go_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});