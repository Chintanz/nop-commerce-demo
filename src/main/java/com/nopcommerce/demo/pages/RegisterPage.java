package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
@CacheLookup
    @FindBy(xpath = "//a[text()='Register']")
    WebElement registerTxt;
    @CacheLookup
            @FindBy(xpath = "//input[@id='gender-male']")
            WebElement genderSelect;
    @CacheLookup
            @FindBy(xpath = "//input[@id='FirstName']")
            WebElement firstName;
    @CacheLookup
            @FindBy(xpath = "//input[@id='LastName']")
            WebElement lastName;
    @CacheLookup
            @FindBy(xpath = "//select[@name='DateOfBirthDay']")
            WebElement dateOfBirthDay;
    @CacheLookup
            @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
            WebElement dateOfBirthMonth;
    @CacheLookup
            @FindBy(xpath = "//select[@name='DateOfBirthYear']")
            WebElement dateOfBirthYear;
    @CacheLookup
            @FindBy(xpath = "//input[@name='Email']")
            WebElement emailField;
   @CacheLookup
           @FindBy(xpath = "//input[@name='Password']")
           WebElement passwordField;
   @CacheLookup
           @FindBy(xpath = "//input[@name='ConfirmPassword']")
           WebElement confirmPasswordField;
    @CacheLookup
            @FindBy(xpath = "//button[@name='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameRequired;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameRequired;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailRequired;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordRequired;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmedPasswordRequired;

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-body']//div[text()='Your registration completed']")
    WebElement registrationComplete;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueTab;




    public String verifyRegisterText() {
        log.info("Verify the register text : " + registerTxt.toString());
        return getTextFromElement(registerTxt);
    }

    public void selectGender(String maleOrFemale) {

        switch (maleOrFemale) {
            case "Male":
                clickOnElement(genderSelect);
                break;
            case "Female":
                clickOnElement(genderSelect);
                break;
            default:
                break;
        }
    }

    public void enterFirstName(String firstNameField) {
        log.info("Enter first name : " + firstName.toString());
        sendTextToElement(firstName,firstNameField);
    }

    public void enterLastName(String lastNameField) {
        log.info("Enter last name : " + lastName.toString());
        sendTextToElement(lastName, lastNameField);
    }

    public void dateOfBirthDay(String day) {
        log.info("Enter birth day : " + dateOfBirthDay.toString());
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
    }

    public void dateOfBirthMonth(String month) {
        log.info("Enter birth month : " + dateOfBirthMonth.toString());
        selectByVisibleTextFromDropDown(dateOfBirthMonth, month);
    }

    public void dateOfBirthYear(String year) {
        log.info("Enter birth year: " + dateOfBirthYear.toString());
        selectByVisibleTextFromDropDown(dateOfBirthYear, year);
    }
    public void enterEmail(String email) {
        log.info("Enter email : " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        log.info("Enter password : " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        log.info("Enter confirm password : " + confirmPasswordField.toString());
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickOnRegisterButton() {
        log.info("Click on register button : " + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String verifyFirstNameError() {
        log.info("First name required : " + firstNameRequired.toString());
        return getTextFromElement(firstNameRequired);
    }
    public String verifyLastNameError() {
        log.info("Last name required : " + lastNameRequired.toString());
        return getTextFromElement(lastNameRequired);
    }
    public String verifyEmailError() {
        log.info("Email required : " + emailRequired.toString());
        return getTextFromElement(emailRequired);
    }
    public String verifyPasswordError() {
        log.info("Password required : " + passwordRequired.toString());
        return getTextFromElement(passwordRequired);
    }
    public String verifyConfirmPasswordError() {
        log.info("Confirm password required : " + confirmedPasswordRequired.toString());
        return getTextFromElement(confirmedPasswordRequired);
    }
    public String verifyRegistrationCompleteMessage() {
                return getTextFromElement(registrationComplete);
    }
    public void clickOnContinueTab() {
                clickOnElement(continueTab);
    }

}
