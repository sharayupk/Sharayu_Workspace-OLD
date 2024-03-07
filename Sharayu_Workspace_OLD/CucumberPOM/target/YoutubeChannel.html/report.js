$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/Features/YoutubeChannel.feature");
formatter.feature({
  "line": 1,
  "name": "Validation of Youtube Channel",
  "description": "",
  "id": "validation-of-youtube-channel",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Youtube Channel Validation",
  "description": "",
  "id": "validation-of-youtube-channel;youtube-channel-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "open chrome browser with url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "search selenium tutorial",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click on channel name",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "validate channel name",
  "keyword": "Then "
});
formatter.match({
  "location": "YoutubeChannelStepDef.open_chrome_browser_with_url()"
});
formatter.result({
  "duration": 11829261267,
  "status": "passed"
});
formatter.match({
  "location": "YoutubeChannelStepDef.search_selenium_tutorial()"
});
formatter.result({
  "duration": 2119501745,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\r\n\tat Pages.YoutubeSearchPage.navigateToResultsPage(YoutubeSearchPage.java:31)\r\n\tat StepDefinition.YoutubeChannelStepDef.search_selenium_tutorial(YoutubeChannelStepDef.java:34)\r\n\tat ✽.When search selenium tutorial(./src/test/java/Features/YoutubeChannel.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "YoutubeChannelStepDef.click_on_channel_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "YoutubeChannelStepDef.validate_channel_name()"
});
formatter.result({
  "status": "skipped"
});
});