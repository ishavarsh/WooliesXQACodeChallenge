$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Smoke.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Application Smoke Test",
  "description": "",
  "id": "application-smoke-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 22,
  "name": "Verify AddToCart functionality",
  "description": "",
  "id": "application-smoke-test;verify-addtocart-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "Initialise the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Navigate to \"http://automationpractice.com/index.php\" site",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I add to cart first item",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Item is added to cart successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.initialise_the_browser_with_chrome()"
});
formatter.result({
  "duration": 2783319000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 13
    }
  ],
  "location": "stepDefinition.navigate_to_site(String)"
});
formatter.result({
  "duration": 7050054600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_add_to_cart_first_item()"
});
formatter.result({
  "duration": 248447800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.item_is_added_to_cart_successfully()"
});
formatter.result({
  "duration": 1227676300,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Verify shopping cart summary",
  "description": "",
  "id": "application-smoke-test;verify-shopping-cart-summary",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "Second item is also added successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I click on cart link",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "Shopping cart summary tab is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "It shows shopping cart contains \"2 products\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.second_item_is_also_added_successfully()"
});
formatter.result({
  "duration": 1403464200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_click_on_cart_link()"
});
formatter.result({
  "duration": 2411563100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.shopping_cart_summary_tab_is_displayed()"
});
formatter.result({
  "duration": 34314800,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 34,
  "name": "Verify authentication step",
  "description": "",
  "id": "application-smoke-test;verify-authentication-step",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "Shopping cart summary tab is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "Proceed to checkout is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I input registered email \"isha3.varshney@gmail.com\" and \"Welcome1\"",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "I click on sign In",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Address tab is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.shopping_cart_summary_tab_is_displayed()"
});
formatter.result({
  "duration": 17383500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.proceed_to_checkout_is_clicked()"
});
formatter.result({
  "duration": 2764330000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "isha3.varshney@gmail.com",
      "offset": 26
    },
    {
      "val": "Welcome1",
      "offset": 57
    }
  ],
  "location": "stepDefinition.i_input_registered_email_and(String,String)"
});
formatter.result({
  "duration": 163441900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_click_on_sign_in()"
});
formatter.result({
  "duration": 3557176800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.address_tab_is_displayed()"
});
formatter.result({
  "duration": 29555400,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Proceed from address step to shipping step",
  "description": "",
  "id": "application-smoke-test;proceed-from-address-step-to-shipping-step",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "Address tab is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "I click on proceed to checkout button",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "Shipping tab is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.address_tab_is_displayed()"
});
formatter.result({
  "duration": 17192700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_click_on_proceed_to_checkout_button()"
});
formatter.result({
  "duration": 1785103500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.shipping_tab_is_displayed()"
});
formatter.result({
  "duration": 30866500,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Proceed from shipping step to payment step",
  "description": "",
  "id": "application-smoke-test;proceed-from-shipping-step-to-payment-step",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 47,
  "name": "I accept terms of service",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "I click on proceed to checkout on shipping",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "Payment tab is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.i_accept_terms_of_service()"
});
formatter.result({
  "duration": 59236900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_click_on_proceed_to_checkout_on_shipping()"
});
formatter.result({
  "duration": 1419678400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.payment_tab_is_displayed()"
});
formatter.result({
  "duration": 27434600,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "Verify order payment by Pay by bank wire method",
  "description": "",
  "id": "application-smoke-test;verify-order-payment-by-pay-by-bank-wire-method",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 52,
  "name": "Payment tab is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 53,
  "name": "I click on Pay by bank wire",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "Order summary is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.payment_tab_is_displayed()"
});
formatter.result({
  "duration": 17600700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_click_on_pay_by_bank_wire()"
});
formatter.result({
  "duration": 934897400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.order_summary_is_displayed()"
});
formatter.result({
  "duration": 28441100,
  "status": "passed"
});
formatter.scenario({
  "line": 56,
  "name": "Verify order cofirmation",
  "description": "",
  "id": "application-smoke-test;verify-order-cofirmation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 57,
  "name": "Order summary is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 58,
  "name": "I click on confirm my order",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "Order confirmation \"Your order on My Store is complete.\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.order_summary_is_displayed()"
});
formatter.result({
  "duration": 16870500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_click_on_confirm_my_order()"
});
formatter.result({
  "duration": 2525408400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your order on My Store is complete.",
      "offset": 20
    }
  ],
  "location": "stepDefinition.order_confirmation_something_is_displayed(String)"
});
formatter.result({
  "duration": 1264583100,
  "status": "passed"
});
});