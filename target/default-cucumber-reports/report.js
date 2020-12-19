$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/apicountries.feature");
formatter.feature({
  "name": "Read countries",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CountryReader"
    }
  ]
});
formatter.scenarioOutline({
  "name": "create a country",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreateCountry"
    }
  ]
});
formatter.step({
  "name": "user sets the response using api end point \"https://www.gmibank.com/api/tp-countries\" and creates country using \"\u003cidJson\u003e\" and \"\u003cnameJson\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "name": "create country",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "idJson",
        "nameJson"
      ]
    },
    {
      "cells": [
        "name",
        "France"
      ]
    }
  ]
});
formatter.scenario({
  "name": "create a country",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CountryReader"
    },
    {
      "name": "@CreateCountry"
    }
  ]
});
formatter.step({
  "name": "user sets the response using api end point \"https://www.gmibank.com/api/tp-countries\" and creates country using \"name\" and \"France\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CountryApiStepDef.user_sets_the_response_using_api_end_point_and_creates_country_using_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "read all countries",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CountryReader"
    }
  ]
});
formatter.step({
  "name": "user sets the countries to response using \"https://www.gmibank.com/api/tp-countries\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CountryApiStepDef.user_sets_the_countries_to_response_using(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user saves the countries to correspondent files",
  "keyword": "And "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CountryApiStepDef.user_saves_the_countries_to_correspondent_files()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the countries",
  "keyword": "Then "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CountryApiStepDef.user_validates_the_countries()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "delete countries",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user deletes a country using endpoint \"\u003cendPoint\u003e\" and its extension \"\u003cid\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "name": "multiple countries",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "endPoint",
        "id"
      ]
    },
    {
      "cells": [
        "https://www.gmibank.com/api/tp-countries",
        "/57080"
      ]
    }
  ]
});
formatter.scenario({
  "name": "delete countries",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CountryReader"
    }
  ]
});
formatter.step({
  "name": "user deletes a country using endpoint \"https://www.gmibank.com/api/tp-countries\" and its extension \"/57080\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.CountryApiStepDef.user_deletes_a_country_using_endpoint_and_its_extension(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});