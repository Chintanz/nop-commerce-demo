package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-logo']")
    WebElement nopcommerceLogo;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'My account')]")
    WebElement myAccountLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;



    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Click on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Click on register link : " + registerLink.toString());
    }

    public boolean nopCommerceLogoIsDisplayed() {
        log.info("Click on logo : " + nopcommerceLogo.toString());
        return nopcommerceLogo.isDisplayed();
    }

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
        log.info("Click on my account link : " + myAccountLink.toString());
    }
    public String verifyLoginLinkIsDisplayed() {
        log.info("Clicking on login link : " + logout.toString());
        return getTextFromElement(logout);
    }















}
