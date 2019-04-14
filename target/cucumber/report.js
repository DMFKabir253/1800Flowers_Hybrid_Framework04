$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Account.feature");
formatter.feature({
  "line": 1,
  "name": "Account Page Functionality",
  "description": "",
  "id": "account-page-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5807766920,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "A validated user",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User browse to the site",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User navigates to the footer",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User clicks on sign-in to account",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User should be taken to the sign-in page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User clicks on account tab",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User should land on account page",
  "keyword": "Then "
});
formatter.match({
  "location": "Account.a_validated_user()"
});
formatter.result({
  "duration": 3285118335,
  "status": "passed"
});
formatter.match({
  "location": "Account.user_browse_to_the_site()"
});
