package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement computersTxt;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
    WebElement desktopsLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']")
    WebElement notebooksLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Software']")
    WebElement softwareLink;


    public String verifyComputersText() {
        log.info("Get text from computer: " + computersTxt.toString());
        clickOnElement(computersTxt);
        return getTextFromElement(computersTxt);

    }

    public void selectFromSublist(String subList) {
        switch (subList) {
            case "Desktops":
                clickOnElement(desktopsLink);
                break;
            case "Notebooks":
                clickOnElement(notebooksLink);
                break;
            case "Software":
                clickOnElement(softwareLink);
                break;
            default:
                break;
        }
    }


















}
