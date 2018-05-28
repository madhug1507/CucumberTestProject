$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Bikes.feature");
formatter.feature({
  "line": 1,
  "name": "Verifying bikes based on filter",
  "description": "As a user, assuming I have access to a modern web browser (Chrome) with an internet connection and I am visiting the page",
  "id": "verifying-bikes-based-on-filter",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4410705700,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Open the browser and I am visiting the page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I would like to see a list or grid of bikes",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioOneStepDef.Open_the_browser_and_I_am_visiting_the_page()"
});
formatter.result({
  "duration": 7613474500,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioOneStepDef.I_would_like_to_see_a_list_grid_of_bikes()"
});
formatter.result({
  "duration": 34325800,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d66.0.3359.181)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.2\u0027, revision: \u002710229a9\u0027, time: \u00272017-08-21T17:29:55.15Z\u0027\nSystem info: host: \u0027DESKTOP-37L4HDO\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_65\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb), userDataDir\u003dC:\\Users\\Maddy\\AppData\\Local\\Temp\\scoped_dir17200_16730}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d66.0.3359.181, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 30523d84800cf7c0cb89704d1ba3b57f\n*** Element info: {Using\u003dxpath, value\u003d//div[@ng-repeat\u003d\u0027p in filteredProducts\u0027 and @class\u003d\u0027col-sm-4 ng-scope\u0027 ]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:414)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:513)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:406)\r\n\tat com.cucumber.CommonFunctions.DriverCommon.isElementDisplayed(DriverCommon.java:45)\r\n\tat com.cucumber.TestSuite.ScenarioOneStepDef.I_would_like_to_see_a_list_grid_of_bikes(ScenarioOneStepDef.java:53)\r\n\tat ✽.Then I would like to see a list or grid of bikes(Bikes.feature:6)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 8,
  "name": "I would like to see a list or grid of bikes",
  "description": "",
  "id": "verifying-bikes-based-on-filter;i-would-like-to-see-a-list-or-grid-of-bikes",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.after({
  "duration": 580353700,
  "status": "passed"
});
formatter.before({
  "duration": 3453026400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Open the browser and I am visiting the page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I would like to see a list or grid of bikes",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioOneStepDef.Open_the_browser_and_I_am_visiting_the_page()"
});
formatter.result({
  "duration": 3087625800,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioOneStepDef.I_would_like_to_see_a_list_grid_of_bikes()"
});
formatter.result({
  "duration": 784070200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "I would like to see a name, an image, a description and the class for each bike",
  "description": "",
  "id": "verifying-bikes-based-on-filter;i-would-like-to-see-a-name,-an-image,-a-description-and-the-class-for-each-bike",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I would like to see the name an image a description and the class name for each  bike",
  "keyword": "And "
});
formatter.match({
  "location": "ScenarioOneStepDef.I_would_like_to_see_the_name_an_image_a_description_and_the_class_name_for_each_bike()"
});
formatter.result({
  "duration": 1301550700,
  "status": "passed"
});
formatter.after({
  "duration": 687590000,
  "status": "passed"
});
formatter.before({
  "duration": 2598428100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Open the browser and I am visiting the page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I would like to see a list or grid of bikes",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioOneStepDef.Open_the_browser_and_I_am_visiting_the_page()"
});
formatter.result({
  "duration": 2304853300,
  "status": "passed"
});
formatter.match({
  "location": "ScenarioOneStepDef.I_would_like_to_see_a_list_grid_of_bikes()"
});
formatter.result({
  "duration": 713036800,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "I would like to be able to sort the bikes into a custom order based on class",
  "description": "",
  "id": "verifying-bikes-based-on-filter;i-would-like-to-be-able-to-sort-the-bikes-into-a-custom-order-based-on-class",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I filter by the class bikes should be able to sort into custom order",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioOneStepDef.I_would_like_to_be_able_to_sort_the_bikes_into_a_custom_order_based_onclass()"
});
formatter.result({
  "duration": 7516250600,
  "status": "passed"
});
formatter.after({
  "duration": 640335100,
  "status": "passed"
});
});