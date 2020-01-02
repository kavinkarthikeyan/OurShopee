$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/login.feature");
formatter.feature({
  "name": "To validate login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Successlly with user credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The OurShopee page should be launched",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.the_OurShopee_page_should_be_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the signUp button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_signUp_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The page should be navigate to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_page_should_be_navigate_to_homepage()"
});
formatter.result({
  "status": "passed"
});
});