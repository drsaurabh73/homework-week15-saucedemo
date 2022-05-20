package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, "this");
    }

    @FindBy(xpath = "//input[@id='user-name']")
    WebElement username;


    @FindBy(xpath = "//input[@id='password']")
    WebElement password;


    @FindBy(xpath = "//input[@name='login-button']")
    WebElement login;

    public void setUsername(String text) {
        sendTextToElement(username, text);
        log.info("getting username text " + username.toString());
    }

    public void setPassword(String text) {
        sendTextToElement(password, text);
        log.info("getting password text " + password.toString());
    }
    public void clickOnLogin() {
        clickOnElement(login);
        log.info("Clicking on login " + login.toString() );
    }

}
