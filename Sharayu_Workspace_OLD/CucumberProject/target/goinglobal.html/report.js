$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/Features/GoinGlobalReg.feature");
formatter.feature({
  "line": 1,
  "name": "GoinGlobal Registration Form",
  "description": "",
  "id": "goinglobal-registration-form",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Register user on GoinGlobal Site",
  "description": "",
  "id": "goinglobal-registration-form;register-user-on-goinglobal-site",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "browser is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "register form is opened",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enters name as \"\u003cname\u003e\" and phone as\"\u003cphone\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enters organization as\"\u003corganization\u003e\" and department as \"\u003cdepartment\u003e\" and title as \"\u003ctitle\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I enters email as \"\u003cemail\u003e\" and comments as \"\u003ccomments\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I clicks on notrobot box and submit button",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "goinglobal-registration-form;register-user-on-goinglobal-site;",
  "rows": [
    {
      "cells": [
        "name",
        "phone",
        "organization",
        "department",
        "title",
        "email",
        "comments"
      ],
      "line": 12,
      "id": "goinglobal-registration-form;register-user-on-goinglobal-site;;1"
    },
    {
      "cells": [
        "Raj",
        "7865497657",
        "J.S.P.M",
        "IT",
        "Master",
        "raj@gmail.com",
        "Good"
      ],
      "line": 13,
      "id": "goinglobal-registration-form;register-user-on-goinglobal-site;;2"
    },
    {
      "cells": [
        "Sneha",
        "8365445766",
        "D.Y Patil",
        "CS",
        "Bachelor",
        "sneha@gmail.com",
        "Good"
      ],
      "line": 14,
      "id": "goinglobal-registration-form;register-user-on-goinglobal-site;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Register user on GoinGlobal Site",
  "description": "",
  "id": "goinglobal-registration-form;register-user-on-goinglobal-site;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "browser is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "register form is opened",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enters name as \"Raj\" and phone as\"7865497657\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enters organization as\"J.S.P.M\" and department as \"IT\" and title as \"Master\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I enters email as \"raj@gmail.com\" and comments as \"Good\"",
  "matchedColumns": [
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I clicks on notrobot box and submit button",
  "keyword": "And "
});
formatter.match({
  "location": "GoinGlobalRegStepDef.browser_is_launched()"
});
formatter.result({
  "duration": 4377397924,
  "status": "passed"
});
formatter.match({
  "location": "GoinGlobalRegStepDef.register_form_is_sopened()"
});
formatter.result({
  "duration": 4662954005,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Raj",
      "offset": 18
    },
    {
      "val": "7865497657",
      "offset": 36
    }
  ],
  "location": "GoinGlobalRegStepDef.i_enters_name_as_and_phone_as(String,String)"
});
formatter.result({
  "duration": 489182532,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "J.S.P.M",
      "offset": 25
    },
    {
      "val": "IT",
      "offset": 53
    },
    {
      "val": "Master",
      "offset": 71
    }
  ],
  "location": "GoinGlobalRegStepDef.i_enters_organization_as_and_department_as_and_title_as(String,String,String)"
});
formatter.result({
  "duration": 443559734,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "raj@gmail.com",
      "offset": 19
    },
    {
      "val": "Good",
      "offset": 51
    }
  ],
  "location": "GoinGlobalRegStepDef.i_enters_email_as_and_comments_as(String,String)"
});
formatter.result({
  "duration": 284254287,
  "status": "passed"
});
formatter.match({
  "location": "GoinGlobalRegStepDef.i_clicks_on_notrobot_box_and_submit_button()"
});
formatter.result({
  "duration": 3438390361,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Register user on GoinGlobal Site",
  "description": "",
  "id": "goinglobal-registration-form;register-user-on-goinglobal-site;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "browser is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "register form is opened",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enters name as \"Sneha\" and phone as\"8365445766\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enters organization as\"D.Y Patil\" and department as \"CS\" and title as \"Bachelor\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I enters email as \"sneha@gmail.com\" and comments as \"Good\"",
  "matchedColumns": [
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I clicks on notrobot box and submit button",
  "keyword": "And "
});
formatter.match({
  "location": "GoinGlobalRegStepDef.browser_is_launched()"
});
formatter.result({
  "duration": 3927783695,
  "status": "passed"
});
formatter.match({
  "location": "GoinGlobalRegStepDef.register_form_is_sopened()"
});
formatter.result({
  "duration": 5035811674,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sneha",
      "offset": 18
    },
    {
      "val": "8365445766",
      "offset": 38
    }
  ],
  "location": "GoinGlobalRegStepDef.i_enters_name_as_and_phone_as(String,String)"
});
formatter.result({
  "duration": 304864799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "D.Y Patil",
      "offset": 25
    },
    {
      "val": "CS",
      "offset": 55
    },
    {
      "val": "Bachelor",
      "offset": 73
    }
  ],
  "location": "GoinGlobalRegStepDef.i_enters_organization_as_and_department_as_and_title_as(String,String,String)"
});
formatter.result({
  "duration": 359148557,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sneha@gmail.com",
      "offset": 19
    },
    {
      "val": "Good",
      "offset": 53
    }
  ],
  "location": "GoinGlobalRegStepDef.i_enters_email_as_and_comments_as(String,String)"
});
formatter.result({
  "duration": 251533143,
  "status": "passed"
});
formatter.match({
  "location": "GoinGlobalRegStepDef.i_clicks_on_notrobot_box_and_submit_button()"
});
formatter.result({
  "duration": 3252792201,
  "status": "passed"
});
});