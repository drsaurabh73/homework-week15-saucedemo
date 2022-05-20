package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverview extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public CheckOutOverview() {
        PageFactory.initElements(driver,"this");
    }

    @FindBy(xpath = "//button[@id='finish']")
    WebElement finish;

    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement thankyoufororder;



    public void setFinish() {
        clickOnElement(finish);
        log.info("Clicking on finish button " + finish.toString() );
    }
    public String setThankyoufororder() {
        log.info("getting Thank you for your order text  " + thankyoufororder.toString() );
        return getTextFromElement(thankyoufororder);
    }

}
