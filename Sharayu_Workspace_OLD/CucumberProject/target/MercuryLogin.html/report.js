$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/Features/MercuryLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login To Mercury Tours Application",
  "description": "",
  "id": "login-to-mercury-tours-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Without Examples Keyword"
    },
    {
      "line": 4,
      "value": "#Scenario: Validate Login Functionality of Mercury Tours Application"
    },
    {
      "line": 5,
      "value": "#Given user is on login page"
    },
    {
      "line": 6,
      "value": "#Then validate login page title"
    },
    {
      "line": 7,
      "value": "#When user set \"mercury\" and \"mercury\""
    },
    {
      "line": 8,
      "value": "#And clicks on signin button"
    },
    {
      "line": 9,
      "value": "#Then verifies home page title"
    },
    {
      "line": 12,
      "value": "#Without Examples Keyword"
    }
  ],
  "line": 13,
  "name": "Validate Login Functionality of Mercury Tours Application",
  "description": "",
  "id": "login-to-mercury-tours-application;validate-login-functionality-of-mercury-tours-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "validate login page title",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user set \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "verifies home page title",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "login-to-mercury-tours-application;validate-login-functionality-of-mercury-tours-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 21,
      "id": "login-to-mercury-tours-application;validate-login-functionality-of-mercury-tours-application;;1"
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ],
      "line": 22,
      "id": "login-to-mercury-tours-application;validate-login-functionality-of-mercury-tours-application;;2"
    },
    {
      "cells": [
        "mer",
        "mer"
      ],
      "line": 23,
      "id": "login-to-mercury-tours-application;validate-login-functionality-of-mercury-tours-application;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": "Validate Login Functionality of Mercury Tours Application",
  "description": "",
  "id": "login-to-mercury-tours-application;validate-login-functionality-of-mercury-tours-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "validate login page title",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user set \"mercury\" and \"mercury\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "verifies home page title",
  "keyword": "Then "
});
formatter.match({
  "location": "MercuryLoginStepDef.user_is_on_login_page()"
});
formatter.result({
  "duration": 13176989852,
  "status": "passed"
});
formatter.match({
  "location": "MercuryLoginStepDef.validate_login_page_title()"
});
formatter.result({
  "duration": 17831262,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mercury",
      "offset": 10
    },
    {
      "val": "mercury",
      "offset": 24
    }
  ],
  "location": "MercuryLoginStepDef.user_set_and(String,String)"
});
formatter.result({
  "duration": 245747030,
  "status": "passed"
});
formatter.match({
  "location": "MercuryLoginStepDef.clicks_on_signin_button()"
});
formatter.result({
  "duration": 8049570686,
  "status": "passed"
});
formatter.match({
  "location": "MercuryLoginStepDef.verifies_home_page_title()"
});
formatter.result({
  "duration": 17230901,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Validate Login Functionality of Mercury Tours Application",
  "description": "",
  "id": "login-to-mercury-tours-application;validate-login-functionality-of-mercury-tours-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "validate login page title",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user set \"mer\" and \"mer\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "verifies home page title",
  "keyword": "Then "
});
formatter.match({
  "location": "MercuryLoginStepDef.user_is_on_login_page()"
});
formatter.result({
  "duration": 13526880854,
  "status": "passed"
});
formatter.match({
  "location": "MercuryLoginStepDef.validate_login_page_title()"
});
formatter.result({
  "duration": 8820091,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mer",
      "offset": 10
    },
    {
      "val": "mer",
      "offset": 20
    }
  ],
  "location": "MercuryLoginStepDef.user_set_and(String,String)"
});
formatter.result({
  "duration": 203270962,
  "status": "passed"
});
formatter.match({
  "location": "MercuryLoginStepDef.clicks_on_signin_button()"
});
formatter.result({
  "duration": 4440789633,
  "status": "passed"
});
formatter.match({
  "location": "MercuryLoginStepDef.verifies_home_page_title()"
});
formatter.result({
  "duration": 15815675,
  "status": "passed"
});
});