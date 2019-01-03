$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DomainZ.feature");
formatter.feature({
  "line": 1,
  "name": "DomainZ",
  "description": "",
  "id": "domainz",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20047798878,
  "status": "passed"
});
formatter.scenario({
  "line": 1245,
  "name": "Domainz - View existing saved credit card",
  "description": "",
  "id": "domainz;domainz---view-existing-saved-credit-card;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1230,
      "name": "@BetaClientMN"
    }
  ]
});
formatter.step({
  "line": 1232,
  "name": "Enter Admin UserName fnurani",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 1233,
  "name": "Enter Admin Password comein45",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 1234,
  "name": "Click Submit Button",
  "keyword": "Then "
});
formatter.step({
  "line": 1235,
  "name": "Set Search Workflow Id 12809354",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 1236,
  "name": "Click on Get Workflow Button",
  "keyword": "Then "
});
formatter.step({
  "line": 1237,
  "name": "Click On Get Workflow id Number",
  "keyword": "Then "
});
formatter.step({
  "line": 1238,
  "name": "Click On Execute Button",
  "keyword": "Then "
});
formatter.step({
  "line": 1239,
  "name": "click On Execute Action",
  "keyword": "Then "
});
formatter.step({
  "line": 1240,
  "name": "set Admin Domain Name automationtester123.com",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 1241,
  "name": "click On Admin Search Button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "fnurani",
      "offset": 21
    }
  ],
  "location": "DomainZ.Enter_Admin_UserName(String)"
});
formatter.result({
  "duration": 9048835092,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "comein45",
      "offset": 21
    }
  ],
  "location": "DomainZ.Enter_Admin_Password(String)"
});
formatter.result({
  "duration": 153508916,
  "status": "passed"
});
formatter.match({
  "location": "DomainZ.Clear_Submit_Button()"
});
formatter.result({
  "duration": 1419163152,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12809354",
      "offset": 23
    }
  ],
  "location": "DomainZ.Set_Search_Workflow_Id(String)"
});
formatter.result({
  "duration": 60158334669,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@name\u003d\u0027domain\u0027]\"}\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 30.03 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Machine-102\u0027, ip: \u0027192.168.5.102\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91), userDataDir\u003dC:\\Users\\user\\AppData\\Local\\Temp\\scoped_dir9016_19629}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d71.0.3578.98, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: f6b9c7c06175e2f010983687f71a0f9f\n*** Element info: {Using\u003dxpath, value\u003d//input[@name\u003d\u0027domain\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat core.generic.WrapperFunctions.setText(WrapperFunctions.java:168)\r\n\tat com.face.pageFactory.DomainZpage.setWorkflowId(DomainZpage.java:688)\r\n\tat com.face.stepDefinitions.DomainZ.Set_Search_Workflow_Id(DomainZ.java:665)\r\n\tat ✽.Then Set Search Workflow Id 12809354(DomainZ.feature:1235)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DomainZ.Click_on_Get_Workflow_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DomainZ.Click_On_Get_Workflow_Id_Number()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DomainZ.click_On_Execute_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DomainZ.click_On_Execute_Action()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "automationtester123.com",
      "offset": 22
    }
  ],
  "location": "DomainZ.set_Admin_Domain_Name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DomainZ.click_On_Admin_Search_Button()"
});
formatter.result({
  "status": "skipped"
});
});