
  Feature: Search functionality
    As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.

    Scenario: User navigates saucedemo page and complete the item purchas

      Given I am on saucedemo page
      When  I enter  "standard_user" valid username
      And   I enter "secret_sauce" valid password
      And   I click on login button
      And   I select cheapest product from the products and added to cart
      And   I select costliest product from the products and added to cart
      And   I click on shopping cart button
      And   I click on checkout button
      And   I enter the firstname "saurabh" in the fistname field
      And   I enter the lastname "patel" in the lastname field
      And   I enter the zipcode "665085" in the postcode field
      And   I click on continue button
      And   I click on finish button
      Then  I can see the message "THANK YOU FOR YOUR ORDER" on the page