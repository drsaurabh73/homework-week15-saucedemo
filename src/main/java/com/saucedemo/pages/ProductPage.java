package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, "this");
    }


    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement sortby;


    @FindBy(xpath = "//select[@class='product_sort_container']//option[@value='hilo']")
    WebElement hightolow;


    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement cheapestadd;


    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement highestadd;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement shoppingcart;







    public void setSortby() {
        clickOnElement(sortby);
        log.info("Clicking on sortby " + sortby.toString() );
    }
    public void setHightolow() {
        clickOnElement(hightolow);
        log.info("Clicking on hightolow " + hightolow.toString() );
    }

    public void setCheapestadd() {
        clickOnElement(cheapestadd);
        log.info("Clicking on cheapest product " + cheapestadd.toString() );
    }
    public void setHighestadd() {
        clickOnElement(highestadd);
        log.info("Clicking on most expensive product " + highestadd.toString() );
    }

    public void setShoppingcart() {
        clickOnElement(shoppingcart);
        log.info("Clicking on shopping cart " + shoppingcart.toString() );
    }














}
