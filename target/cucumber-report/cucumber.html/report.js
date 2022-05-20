$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 2,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7741828500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User navigates saucedemo page and complete the item purchas",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter  \"standard_user\" valid username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter \"secret_sauce\" valid password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select cheapest product from the products and added to cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select costliest product from the products and added to cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on shopping cart button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter the firstname \"saurabh\" in the fistname field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter the lastname \"patel\" in the lastname field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter the zipcode \"665085\" in the postcode field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I can see the message \"THANK YOU FOR YOUR ORDER\" on the page",
  "keyword": "Then "
});
formatter.match({
  "location": "PurchaseTest.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 755970200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 10
    }
  ],
  "location": "PurchaseTest.iEnterValidUsername(String)"
});
formatter.result({
  "duration": 291459700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 9
    }
  ],
  "location": "PurchaseTest.iEnterValidPassword(String)"
});
formatter.result({
  "duration": 103318600,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iClickOnLoginButton()"
});
formatter.result({
  "duration": 20383972300,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iSelectCheapestProductFromTheProductsAndAddedToCart()"
});
formatter.result({
  "duration": 20268447000,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iSelectCostliestProductFromTheProductsAndAddedToCart()"
});
formatter.result({
  "duration": 20263580500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iClickOnShoppingCartButton()"
});
formatter.result({
  "duration": 249139100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iClickOnCheckoutButton()"
});
formatter.result({
  "duration": 20259476800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "saurabh",
      "offset": 23
    }
  ],
  "location": "PurchaseTest.iEnterTheFirstnameInTheFistnameField(String)"
});
formatter.result({
  "duration": 64223300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "patel",
      "offset": 22
    }
  ],
  "location": "PurchaseTest.iEnterTheLastnameInTheLastnameField(String)"
});
formatter.result({
  "duration": 39081100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "665085",
      "offset": 21
    }
  ],
  "location": "PurchaseTest.iEnterTheZipcodeInThePostcodeField(String)"
});
formatter.result({
  "duration": 56261800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iClickOnContinueButton()"
});
formatter.result({
  "duration": 20265610500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseTest.iClickOnFinishButton()"
});
formatter.result({
  "duration": 20253935000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THANK YOU FOR YOUR ORDER",
      "offset": 23
    }
  ],
  "location": "PurchaseTest.iCanSeeTheMessageOnThePage(String)"
});
formatter.result({
  "duration": 36069000,
  "status": "passed"
});
formatter.after({
  "duration": 1438606300,
  "status": "passed"
});
});