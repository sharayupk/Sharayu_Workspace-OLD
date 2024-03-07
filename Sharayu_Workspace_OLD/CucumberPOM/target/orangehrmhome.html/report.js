$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/Features/OrangeHRMHome.feature");
formatter.feature({
  "line": 1,
  "name": "Home Page Test of OrangeHRM Application",
  "description": "",
  "id": "home-page-test-of-orangehrm-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validate Home Page Test",
  "description": "",
  "id": "home-page-test-of-orangehrm-application;validate-home-page-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "verify loginpage title",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "\"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "check admin text",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate the url of home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "mouse hover on admin and user mgmt link",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on user link and add button",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "home-page-test-of-orangehrm-application;validate-home-page-test;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "home-page-test-of-orangehrm-application;validate-home-page-test;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 14,
      "id": "home-page-test-of-orangehrm-application;validate-home-page-test;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Validate Home Page Test",
  "description": "",
  "id": "home-page-test-of-orangehrm-application;validate-home-page-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "verify loginpage title",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "\"Admin\" and \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "check admin text",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate the url of home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "mouse hover on admin and user mgmt link",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on user link and add button",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRMHomePageTest.launch_browser()"
});
formatter.result({
  "duration": 9759245372,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMHomePageTest.verify_loginpage_title()"
});
formatter.result({
  "duration": 14797279,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 1
    },
    {
      "val": "admin123",
      "offset": 13
    }
  ],
  "location": "OrangeHRMHomePageTest.username_and_password(String,String)"
});
formatter.result({
  "duration": 2364435658,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMHomePageTest.check_admin_text()"
});
formatter.result({
  "duration": 84545141,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMHomePageTest.validate_the_url_of_home_page()"
});
formatter.result({
  "duration": 10944587,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMHomePageTest.mouse_hover_on_admin_and_user_mgmt_link()"
});
formatter.result({
  "duration": 3370818323,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMHomePageTest.click_on_user_link_and_add_button()"
});
formatter.result({
  "duration": 4405456803,
  "status": "passed"
});
});