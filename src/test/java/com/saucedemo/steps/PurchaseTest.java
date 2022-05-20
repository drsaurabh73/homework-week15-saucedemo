package com.saucedemo.steps;

import com.saucedemo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PurchaseTest {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I enter  \"([^\"]*)\" valid username$")
    public void iEnterValidUsername(String username)  {
        new HomePage().setUsername(username);

    }

    @And("^I enter \"([^\"]*)\" valid password$")
    public void iEnterValidPassword(String password)  {
        new HomePage().setPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLogin();
    }

    @And("^I select cheapest product from the products and added to cart$")
    public void iSelectCheapestProductFromTheProductsAndAddedToCart() {
        new ProductPage().setCheapestadd();
    }

    @And("^I select costliest product from the products and added to cart$")
    public void iSelectCostliestProductFromTheProductsAndAddedToCart() {
        new ProductPage().setHighestadd();
    }

    @And("^I click on shopping cart button$")
    public void iClickOnShoppingCartButton() {
        new ProductPage().setShoppingcart();
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() {
        new YourCart().setCheckout();
    }

    @And("^I enter the firstname \"([^\"]*)\" in the fistname field$")
    public void iEnterTheFirstnameInTheFistnameField(String firstname)  {
        new CheckOutPage().setFirstname(firstname);

    }

    @And("^I enter the lastname \"([^\"]*)\" in the lastname field$")
    public void iEnterTheLastnameInTheLastnameField(String lastname)  {
        new CheckOutPage().setLastname(lastname);
    }

    @And("^I enter the zipcode \"([^\"]*)\" in the postcode field$")
    public void iEnterTheZipcodeInThePostcodeField(String postcode)  {
        new CheckOutPage().setZipcode(postcode);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutPage().setContinuebutton();

    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckOutOverview().setFinish();
    }

    @Then("^I can see the message \"([^\"]*)\" on the page$")
    public void iCanSeeTheMessageOnThePage(String verify)  {

        Assert.assertEquals("order not received",verify,new CheckOutOverview().setThankyoufororder());
    }
}
