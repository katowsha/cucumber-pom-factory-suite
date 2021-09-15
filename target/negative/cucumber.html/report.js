$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Amazon/AmazonSiteValidation.feature");
formatter.feature({
  "line": 1,
  "name": "Microsoft site test validation",
  "description": "",
  "id": "microsoft-site-test-validation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1594939400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Amazon flow validation with fake api data",
  "description": "",
  "id": "microsoft-site-test-validation;amazon-flow-validation-with-fake-api-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@AmazonTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate to amazon site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Im on landing page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I navigate to new customer form",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I get fake data from api response",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I fill the name and email fields",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I navigate to condition of use link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I search for \"Echo\" on search bar",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should navigate to Echo Support",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Validate the elements on support section",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonHomePageSteps.i_navigate_to_amazon_site()"
});
formatter.result({
  "duration": 985576100,
  "status": "passed"
});
formatter.match({
  "location": "MicrosoftHomePageSteps.im_on_landing_page()"
});
formatter.result({
  "duration": 908000,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePageSteps.i_navigate_to_new_customer_form()"
});
formatter.result({
  "duration": 3760787700,
  "status": "passed"
});
formatter.match({
  "location": "AmazonHomePageSteps.i_get_fake_data_from_api_response()"
});
formatter.result({
  "duration": 3071623100,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.i_fill_the_name_and_email_fields()"
});
formatter.result({
  "duration": 177048000,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.i_navigate_to_condition_of_use_link()"
});
formatter.result({
  "duration": 1071898400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Echo",
      "offset": 14
    }
  ],
  "location": "TermsOfUsePageSteps.i_search_for_on_search_bar(String)"
});
formatter.result({
  "duration": 1477851000,
  "status": "passed"
});
formatter.match({
  "location": "TermsOfUsePageSteps.i_should_navigate_to()"
});
formatter.result({
  "duration": 1491328000,
  "status": "passed"
});
formatter.match({
  "location": "EchoSupportPageSteps.validate_the_elements_on_support_section()"
});
formatter.result({
  "duration": 913525200,
  "status": "passed"
});
formatter.after({
  "duration": 4712810300,
  "status": "passed"
});
});