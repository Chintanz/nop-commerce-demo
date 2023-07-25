package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Build your own computer']")
    WebElement buildYourOwnComputerTxt;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDown;
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ramDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement hdd320GB;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hdd400GB;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement vistaHome50;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement vistaPremium60;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommander;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement theProductHasBeenAddedToYourMessage;


    public void selectProcessor(String processor) {
                selectByVisibleTextFromDropDown(processorDropDown, processor);
        log.info("Select Processor: " + processorDropDown.toString());
    }
    public void selectRam(String ram) {
                selectByVisibleTextFromDropDown(ramDropDown, ram);
        log.info("Select ram: " + ramDropDown.toString());
    }

    public void selectHDDRadios(String hddRadio) {
                switch (hddRadio) {
            case "320 GB":
                clickOnElement(hdd320GB);
                break;
            case "400 GB [+$100.00]":
                clickOnElement(hdd400GB);
                break;
            default:
                break;
        }
    }

    public void selectOSRadioButton(String osRadio) {
                switch (osRadio) {
            case "Vista Home [+$50.00]":
                clickOnElement(vistaHome50);
                break;
            case "Vista Premium [+$60.00]":
                clickOnElement(vistaPremium60);
                break;
            default:
                break;
        }
    }
    public void selectTotalCommander() {
                clickOnElement(totalCommander);
        log.info("Click on total commander: " + totalCommander.toString());
    }
    public void clickOnAddToCartButton() {
                clickOnElement(addToCartButton);
        log.info("Click on add to cart: " + addToCartButton.toString());
    }
    public String verifyProductHasBeenAddedText() {
        log.info("Verify message: " + theProductHasBeenAddedToYourMessage.toString());
                return getTextFromElement(theProductHasBeenAddedToYourMessage);

    }

       }
