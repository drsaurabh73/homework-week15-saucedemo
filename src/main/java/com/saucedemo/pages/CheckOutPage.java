package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public CheckOutPage() {
        PageFactory.initElements(driver,"this");
    }


    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstname;

    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastname;

    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement zipcode;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement continuebutton;

    public void setFirstname(String name) {
        sendTextToElement(firstname,name);
        log.info("getting firstname text " + firstname.toString() );
    }
    public void setLastname(String lname){
        sendTextToElement(lastname,lname);
        log.info("getting lastname text " + lastname.toString() );
    }
    public void setZipcode(String text)  {
        sendTextToElement(zipcode, text);
        log.info("getting zipcode text " + zipcode.toString() );
    }
    public void setContinuebutton() {
        clickOnElement(continuebutton);
        log.info("Clicking on continue " + continuebutton.toString());
    }


}
