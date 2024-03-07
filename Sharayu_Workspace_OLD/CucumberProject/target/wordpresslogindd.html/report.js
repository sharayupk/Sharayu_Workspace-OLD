$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/Features/WordpressLoginDD.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Wordpress Application",
  "description": "",
  "id": "login-to-wordpress-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to Wordpress Application with valid credentials",
  "description": "",
  "id": "login-to-wordpress-application;login-to-wordpress-application-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is Log In ‹ Wordpress Demo Site at Demo.Center — WordPress",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters \"admin\" and \"demo123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "WordpressLoginDDStepDef.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 8994391354,
  "status": "passed"
});
formatter.match({
  "location": "WordpressLoginDDStepDef.title_of_login_page_is_Log_In_Wordpress_Demo_Site_at_Demo_Center_WordPress()"
});
formatter.result({
  "duration": 11700945,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 13
    },
    {
      "val": "demo123",
      "offset": 25
    }
  ],
  "location": "WordpressLoginDDStepDef.user_enters_and(String,String)"
});
formatter.result({
  "duration": 349169367,
  "status": "passed"
});
formatter.match({
  "location": "WordpressLoginDDStepDef.clicks_on_login_button()"
});
formatter.result({
  "duration": 1662072170,
  "status": "passed"
});
formatter.match({
  "location": "WordpressLoginDDStepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 9795921,
  "status": "passed"
});
});