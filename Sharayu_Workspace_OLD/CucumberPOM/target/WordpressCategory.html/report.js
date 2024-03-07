$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/Features/WordpressCategory.feature");
formatter.feature({
  "line": 1,
  "name": "Wordpress Application",
  "description": "",
  "id": "wordpress-application",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Without Examples Keyword and DataTables"
    }
  ],
  "line": 4,
  "name": "Validate Wordpress Application",
  "description": "",
  "id": "wordpress-application;validate-wordpress-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user get browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "validate login page title",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user set \"admin\" and \"demo123\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "login button is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify that user is logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "all posts tab is clicked",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on categories link",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "name and category and description is entered",
  "rows": [
    {
      "cells": [
        "Category",
        "Uncategorised",
        "Add Category"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click add new category button",
  "keyword": "And "
});
formatter.match({
  "location": "WordpressCategoryStepDef.user_get_browser()"
});
formatter.result({
  "duration": 11753062241,
  "status": "passed"
});
formatter.match({
  "location": "WordpressCategoryStepDef.validate_login_page_title()"
});
formatter.result({
  "duration": 15408493,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 10
    },
    {
      "val": "demo123",
      "offset": 22
    }
  ],
  "location": "WordpressCategoryStepDef.user_set_and(String,String)"
});
formatter.result({
  "duration": 199047252,
  "status": "passed"
});
formatter.match({
  "location": "WordpressCategoryStepDef.login_button_is_clicked()"
});
formatter.result({
  "duration": 1430677192,
  "status": "passed"
});
formatter.match({
  "location": "WordpressCategoryStepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 2019055775,
  "status": "passed"
});
formatter.match({
  "location": "WordpressCategoryStepDef.verify_that_user_is_logged_in()"
});
formatter.result({
  "duration": 7961479,
  "status": "passed"
});
formatter.match({
  "location": "WordpressCategoryStepDef.all_posts_tab_is_clicked()"
});
formatter.result({
  "duration": 20067181735,
  "error_message": "org.openqa.selenium.json.JsonException: java.lang.reflect.InvocationTargetException\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027USER-PC\u0027, ip: \u0027192.168.0.6\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.json.JsonOutput.convertUsingMethod(JsonOutput.java:315)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$14(JsonOutput.java:152)\r\n\tat org.openqa.selenium.json.JsonOutput$SafeBiConsumer.accept(JsonOutput.java:407)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:261)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$null$19(JsonOutput.java:165)\r\n\tat java.util.LinkedHashMap$LinkedValues.forEach(Unknown Source)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$20(JsonOutput.java:165)\r\n\tat org.openqa.selenium.json.JsonOutput$SafeBiConsumer.accept(JsonOutput.java:407)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:261)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$null$21(JsonOutput.java:174)\r\n\tat com.google.common.collect.SingletonImmutableBiMap.forEach(SingletonImmutableBiMap.java:65)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$22(JsonOutput.java:173)\r\n\tat org.openqa.selenium.json.JsonOutput$SafeBiConsumer.accept(JsonOutput.java:407)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:261)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:252)\r\n\tat org.openqa.selenium.json.Json.toJson(Json.java:42)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:227)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:117)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:152)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:614)\r\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:640)\r\n\tat Pages.WordpressCategoryPage.mouseHoverOnPostsTab(WordpressCategoryPage.java:37)\r\n\tat StepDefinition.WordpressCategoryStepDef.all_posts_tab_is_clicked(WordpressCategoryStepDef.java:76)\r\n\tat ✽.When all posts tab is clicked(./src/test/java/Features/WordpressCategory.feature:11)\r\n\tSuppressed: org.openqa.selenium.json.JsonException: Attempting to close incomplete json stream\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027USER-PC\u0027, ip: \u0027192.168.0.6\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\t\tat org.openqa.selenium.json.JsonOutput.close(JsonOutput.java:276)\r\n\t\tat org.openqa.selenium.json.Json.toJson(Json.java:44)\r\n\t\tat org.openqa.selenium.remote.http.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:227)\r\n\t\tat org.openqa.selenium.remote.http.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:117)\r\n\t\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:152)\r\n\t\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\t\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\t\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:614)\r\n\t\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:640)\r\n\t\tat Pages.WordpressCategoryPage.mouseHoverOnPostsTab(WordpressCategoryPage.java:37)\r\n\t\tat StepDefinition.WordpressCategoryStepDef.all_posts_tab_is_clicked(WordpressCategoryStepDef.java:76)\r\n\t\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\t\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\t\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\t\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\t\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\t\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\t\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\t\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\t\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\t\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\t\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\t\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\t\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\t\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\t\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\t\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\t\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\t\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\t\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\t\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\t\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\t\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\t\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\t\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\t\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\t\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\t\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\t\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\t\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\t\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\t\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\t\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\t\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\t\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\t\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\t\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\t\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\t\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.json.JsonOutput.convertUsingMethod(JsonOutput.java:311)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$14(JsonOutput.java:152)\r\n\tat org.openqa.selenium.json.JsonOutput$SafeBiConsumer.accept(JsonOutput.java:407)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:261)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$null$19(JsonOutput.java:165)\r\n\tat java.util.LinkedHashMap$LinkedValues.forEach(Unknown Source)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$20(JsonOutput.java:165)\r\n\tat org.openqa.selenium.json.JsonOutput$SafeBiConsumer.accept(JsonOutput.java:407)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:261)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$null$21(JsonOutput.java:174)\r\n\tat com.google.common.collect.SingletonImmutableBiMap.forEach(SingletonImmutableBiMap.java:65)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$22(JsonOutput.java:173)\r\n\tat org.openqa.selenium.json.JsonOutput$SafeBiConsumer.accept(JsonOutput.java:407)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:261)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:252)\r\n\tat org.openqa.selenium.json.Json.toJson(Json.java:42)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:227)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:117)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:152)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:614)\r\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:640)\r\n\tat Pages.WordpressCategoryPage.mouseHoverOnPostsTab(WordpressCategoryPage.java:37)\r\n\tat StepDefinition.WordpressCategoryStepDef.all_posts_tab_is_clicked(WordpressCategoryStepDef.java:76)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#\\/\\/div\\[text\\(\\)\\\u003d\\\u0027Posts\\\u0027\\]\"}\n  (Session info: chrome\u003d83.0.4103.61)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027USER-PC\u0027, ip: \u0027192.168.0.6\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.61, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\User\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:55164}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 70a2ab1f8c72e76193c99c574b43c7fd\n*** Element info: {Using\u003did, value\u003d//div[text()\u003d\u0027Posts\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.interactions.PointerInput$Origin.asArg(PointerInput.java:204)\r\n\tat org.openqa.selenium.interactions.PointerInput$Move.encode(PointerInput.java:155)\r\n\tat org.openqa.selenium.interactions.Sequence.encode(Sequence.java:75)\r\n\tat org.openqa.selenium.interactions.Sequence.toJson(Sequence.java:84)\r\n\t... 67 more\r\n",
  "status": "failed"
});
formatter.match({
  "location": "WordpressCategoryStepDef.click_on_categories_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WordpressCategoryStepDef.name_and_category_and_description_is_entered(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WordpressCategoryStepDef.click_add_new_category_button()"
});
formatter.result({
  "status": "skipped"
});
});