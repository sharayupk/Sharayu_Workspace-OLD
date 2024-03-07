$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/Features/FreeCRMContacts.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Contacts Page Test",
  "description": "",
  "id": "free-crm-contacts-page-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validate Contacts Page Test",
  "description": "",
  "id": "free-crm-contacts-page-test;validate-contacts-page-test",
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
  "name": "user validates login page title",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicked on contacts link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "clicks on new button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "enters \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "\"\u003cemail\u003e\" is entered",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "clicks on save button",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "free-crm-contacts-page-test;validate-contacts-page-test;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "email"
      ],
      "line": 14,
      "id": "free-crm-contacts-page-test;validate-contacts-page-test;;1"
    },
    {
      "cells": [
        "sudipadas1988@yahoo.in",
        "Sudipa@12",
        "Neha",
        "Sharma",
        "neha@gmail.com"
      ],
      "line": 15,
      "id": "free-crm-contacts-page-test;validate-contacts-page-test;;2"
    },
    {
      "cells": [
        "sudipadas1988@yahoo.in",
        "Sudipa@12",
        "Radha",
        "Shah",
        "radha@gmail.com"
      ],
      "line": 16,
      "id": "free-crm-contacts-page-test;validate-contacts-page-test;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Validate Contacts Page Test",
  "description": "",
  "id": "free-crm-contacts-page-test;validate-contacts-page-test;;2",
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
  "name": "user validates login page title",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enters \"sudipadas1988@yahoo.in\" and \"Sudipa@12\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicked on contacts link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "clicks on new button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "enters \"Neha\" and \"Sharma\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "\"neha@gmail.com\" is entered",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "clicks on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "FreeCRMContactsPageTest.browser_is_launched()"
});
formatter.result({
  "duration": 12793551420,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMContactsPageTest.user_validates_login_page_title()"
});
formatter.result({
  "duration": 84138981,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sudipadas1988@yahoo.in",
      "offset": 13
    },
    {
      "val": "Sudipa@12",
      "offset": 42
    }
  ],
  "location": "FreeCRMContactsPageTest.user_enters_and(String,String)"
});
formatter.result({
  "duration": 544955482,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMContactsPageTest.user_clicked_on_contacts_link()"
});
formatter.result({
  "duration": 3201911777,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMContactsPageTest.clicks_on_new_button()"
});
formatter.result({
  "duration": 5227042732,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Neha",
      "offset": 8
    },
    {
      "val": "Sharma",
      "offset": 19
    }
  ],
  "location": "FreeCRMContactsPageTest.enters_firstname_and_lastname(String,String)"
});
formatter.result({
  "duration": 22090506367,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"*[name\u003d\u0027first_name\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.149)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027USER-PC\u0027, ip: \u0027192.168.0.5\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\User\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:62539}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: f6d7b967f6cc1997b177463cc3735326\n*** Element info: {Using\u003dname, value\u003dfirst_name}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:400)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\r\n\tat Pages.FreeCRMContactsPage.setFirstLastName(FreeCRMContactsPage.java:41)\r\n\tat StepDefinition.FreeCRMContactsPageTest.enters_firstname_and_lastname(FreeCRMContactsPageTest.java:70)\r\n\tat ✽.Then enters \"Neha\" and \"Sharma\"(./src/test/java/Features/FreeCRMContacts.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "neha@gmail.com",
      "offset": 1
    }
  ],
  "location": "FreeCRMContactsPageTest.email_is_entered(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCRMContactsPageTest.clicks_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 16,
  "name": "Validate Contacts Page Test",
  "description": "",
  "id": "free-crm-contacts-page-test;validate-contacts-page-test;;3",
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
  "name": "user validates login page title",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enters \"sudipadas1988@yahoo.in\" and \"Sudipa@12\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicked on contacts link",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "clicks on new button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "enters \"Radha\" and \"Shah\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "\"radha@gmail.com\" is entered",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "clicks on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "FreeCRMContactsPageTest.browser_is_launched()"
});
formatter.result({
  "duration": 15208482149,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMContactsPageTest.user_validates_login_page_title()"
});
formatter.result({
  "duration": 6276575,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sudipadas1988@yahoo.in",
      "offset": 13
    },
    {
      "val": "Sudipa@12",
      "offset": 42
    }
  ],
  "location": "FreeCRMContactsPageTest.user_enters_and(String,String)"
});
formatter.result({
  "duration": 496347465,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMContactsPageTest.user_clicked_on_contacts_link()"
});
formatter.result({
  "duration": 2169869809,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMContactsPageTest.clicks_on_new_button()"
});
formatter.result({
  "duration": 5246256655,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Radha",
      "offset": 8
    },
    {
      "val": "Shah",
      "offset": 20
    }
  ],
  "location": "FreeCRMContactsPageTest.enters_firstname_and_lastname(String,String)"
});
formatter.result({
  "duration": 7137856604,
  "error_message": "java.lang.NullPointerException\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\r\n\tat Pages.FreeCRMContactsPage.setFirstLastName(FreeCRMContactsPage.java:41)\r\n\tat StepDefinition.FreeCRMContactsPageTest.enters_firstname_and_lastname(FreeCRMContactsPageTest.java:70)\r\n\tat ✽.Then enters \"Radha\" and \"Shah\"(./src/test/java/Features/FreeCRMContacts.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "radha@gmail.com",
      "offset": 1
    }
  ],
  "location": "FreeCRMContactsPageTest.email_is_entered(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "FreeCRMContactsPageTest.clicks_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
});