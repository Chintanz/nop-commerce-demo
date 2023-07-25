package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

@CacheLookup
    @FindBy(xpath = "//h1[text()='Desktops']")
    WebElement desktopsTxt;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByList;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement display;
    @CacheLookup
    @FindBy(xpath = "//a[@class='viewmode-icon list']")
    WebElement selectProductList;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[text()='Build your own computer']")
    WebElement buildYourOwnComputer;


    public String verifyDesktopsText() {
        log.info("Get desktop text: " + desktopsTxt.toString());
                return getTextFromElement(desktopsTxt);
    }

    public void selectBySortBySortByDropDown(String sortBy) {
                selectByVisibleTextFromDropDown(sortByList, sortBy);
        log.info("Select sort by: " + sortByList.toString());
    }

    public void selectByDisplayDropDown(String displaynumb) {
                selectByVisibleTextFromDropDown(display, displaynumb);
        log.info("Select display numbers: " + display.toString());
    }

    public void selectByProductList() {
                clickOnElement(selectProductList);
        log.info("Click on list: " + selectProductList.toString());
    }

    public void clickOnBuildYourOwnComputer() {
                clickOnElement(buildYourOwnComputer);
        log.info("Click on build your own computer: " + buildYourOwnComputer.toString());
    }


















}
