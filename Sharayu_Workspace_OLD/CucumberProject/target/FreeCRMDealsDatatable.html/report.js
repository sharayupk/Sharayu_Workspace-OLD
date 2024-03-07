$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/Features/FreeCRMDealsDatatable.feature");
formatter.feature({
  "line": 1,
  "name": "Create Deals of Free CRM Application",
  "description": "",
  "id": "create-deals-of-free-crm-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create Deals of Free CRM Application Scenario",
  "description": "",
  "id": "create-deals-of-free-crm-application;create-deals-of-free-crm-application-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "sudipadas1988@yahoo.in",
        "Sudipa@12"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validates title of home page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "clicks on deals link and add new button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enters title and probability and amount",
  "rows": [
    {
      "cells": [
        "deals title",
        "20",
        "20"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "save button is clicked",
  "keyword": "Then "
});
formatter.match({
  "location": "FreeCRMDealsDatatableStepDef.launch_browser()"
});
formatter.result({
  "duration": 46281240600,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMDealsDatatableStepDef.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 372008708,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMDealsDatatableStepDef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 98403411,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMDealsDatatableStepDef.validates_title_of_home_page()"
});
formatter.result({
  "duration": 8527000,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMDealsDatatableStepDef.clicks_on_deals_link_and_add_new_button()"
});
formatter.result({
  "duration": 3683005255,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMDealsDatatableStepDef.enters_title_and_probability_and_amount(DataTable)"
});
formatter.result({
  "duration": 385556739,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMDealsDatatableStepDef.save_button_is_clicked()"
});
formatter.result({
  "duration": 127770628,
  "status": "passed"
});
});