$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/Features/MercuryDataTable.feature");
formatter.feature({
  "line": 1,
  "name": "User Registration in Mercury Tours Site",
  "description": "",
  "id": "user-registration-in-mercury-tours-site",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#DataTable for User Registration using raw()"
    }
  ],
  "line": 4,
  "name": "Single User Registration",
  "description": "",
  "id": "user-registration-in-mercury-tours-site;single-user-registration",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have valid set of data and access to Registration Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Registration Page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter valid data on page",
  "rows": [
    {
      "cells": [
        "FirstName",
        "Aditya"
      ],
      "line": 8
    },
    {
      "cells": [
        "LastName",
        "Roy"
      ],
      "line": 9
    },
    {
      "cells": [
        "Phone",
        "9789087654"
      ],
      "line": 10
    },
    {
      "cells": [
        "Email",
        "aditya@gmail.com"
      ],
      "line": 11
    },
    {
      "cells": [
        "UserName",
        "aditya12"
      ],
      "line": 12
    },
    {
      "cells": [
        "Password",
        "aditya@123"
      ],
      "line": 13
    },
    {
      "cells": [
        "ConfirmPass",
        "aditya@123"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Thank you for Registering: should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "click on signoff",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "MercuryDataTableStepDef.i_have_valid_set_of_data_and_access_to_Registration_Page()"
});
formatter.result({
  "duration": 2663321054,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 80\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027USER-PC\u0027, ip: \u0027192.168.0.3\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x00EE0C83+1707139]\n\tOrdinal0 [0x00E468F1+1075441]\n\tOrdinal0 [0x00DBDFC9+516041]\n\tOrdinal0 [0x00D50554+66900]\n\tOrdinal0 [0x00D4CCE2+52450]\n\tOrdinal0 [0x00D6BFD7+180183]\n\tOrdinal0 [0x00D6BDDD+179677]\n\tOrdinal0 [0x00D69D4B+171339]\n\tOrdinal0 [0x00D51D4A+73034]\n\tOrdinal0 [0x00D52DC0+77248]\n\tOrdinal0 [0x00D52D59+77145]\n\tOrdinal0 [0x00E5BB67+1162087]\n\tGetHandleVerifier [0x00F7A966+508998]\n\tGetHandleVerifier [0x00F7A6A4+508292]\n\tGetHandleVerifier [0x00F8F7B7+594583]\n\tGetHandleVerifier [0x00F7B1D6+511158]\n\tOrdinal0 [0x00E5402C+1130540]\n\tOrdinal0 [0x00E5D4CB+1168587]\n\tOrdinal0 [0x00E5D633+1168947]\n\tOrdinal0 [0x00E75B35+1268533]\n\tBaseThreadInitThunk [0x77123677+18]\n\tRtlInitializeExceptionChain [0x779C9D72+99]\n\tRtlInitializeExceptionChain [0x779C9D45+54]\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$new$0(W3CHandshakeResponse.java:57)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$getResponseFunction$2(W3CHandshakeResponse.java:104)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:122)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyInto(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.evaluate(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.findFirst(Unknown Source)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:125)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:73)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:212)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:130)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat StepDefinition.MercuryDataTableStepDef.i_have_valid_set_of_data_and_access_to_Registration_Page(MercuryDataTableStepDef.java:22)\r\n\tat ✽.Given I have valid set of data and access to Registration Page(./src/test/java/Features/MercuryDataTable.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MercuryDataTableStepDef.registration_Page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MercuryDataTableStepDef.i_enter_valid_data_on_page(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MercuryDataTableStepDef.click_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MercuryDataTableStepDef.thank_you_for_Registering_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MercuryDataTableStepDef.click_on_signoff()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MercuryDataTableStepDef.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});