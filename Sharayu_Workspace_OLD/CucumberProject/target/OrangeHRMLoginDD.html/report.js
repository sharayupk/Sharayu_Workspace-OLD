$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/Features/OrangeHRMLoginDD.feature");
formatter.feature({
  "line": 1,
  "name": "Login To OrangeHRM",
  "description": "",
  "id": "login-to-orangehrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Login Functionality of OrangeHRM application",
  "description": "",
  "id": "login-to-orangehrm;validate-login-functionality-of-orangehrm-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "browser launch",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "verify title of login page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "enters \"Admin\" and \"admin123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "login button is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMLoginStepDef.browse_launched()"
});
formatter.result({
  "duration": 9570836555,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMLoginStepDef.verify_title_of_login_page()"
});
formatter.result({
  "duration": 7728962,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 8
    },
    {
      "val": "admin123",
      "offset": 20
    }
  ],
  "location": "OrangeHRMLoginStepDef.enters_and(String,String)"
});
formatter.result({
  "duration": 185927775,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMLoginStepDef.login_button_is_clicked()"
});
formatter.result({
  "duration": 10710268519,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d81.0.4044.138)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027USER-PC\u0027, ip: \u0027192.168.0.6\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.138, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\User\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:57579}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: a01ed68d72b937464940b7b133bde012\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat StepDefinition.OrangeHRMLoginStepDef.login_button_is_clicked(OrangeHRMLoginStepDef.java:45)\r\n\tat ✽.And login button is clicked(./src/test/java/Features/OrangeHRMLoginDD.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "OrangeHRMLoginStepDef.validate_home_page_title()"
});
formatter.result({
  "status": "skipped"
});
});