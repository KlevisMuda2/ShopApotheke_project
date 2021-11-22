package com.ShopApotheke.pages;

import com.ShopApotheke.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login-email")
    public WebElement email;

    @FindBy(id = "login-password")
    public WebElement password;

    @FindBy(id = "btn-login")
    public WebElement loginButton;

    @FindBy(xpath = "//a[.='Ok']")
    public WebElement okButton;

    @FindBy(xpath = "//h3[@class='a-h3 u-margin-xx-small--bottom']")
    public WebElement loginText;

    @FindBy(id = "messages-error")
    public WebElement errorMessage;

    @FindBy(xpath = "(//span[@class='error-msg'])[1]")
    public WebElement blankUsernameErrorMessage;

    @FindBy(xpath = "(//span[@class='error-msg'])[2]")
    public WebElement blankPasswordErrorMessage;

    @FindBy(xpath = "//a[@data-qa-id='login-registration-password-reveal']")
    public WebElement forgotPassword;

    @FindBy(xpath = "(//p)[3]")
    public WebElement forgotPasswordMessage;

    @FindBy(id = "pw-email")
    public WebElement forgotPasswordEmailField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement forgotPasswordEmailSend;

    /** Method for login functionality
     * It runs by clicking on the login button or Pres Enter key from keyboard.
     * @param username
     * @param passwords
     */
    public void loginFunctionality(String username, String passwords){

        email.sendKeys(username);
        password.sendKeys(passwords);
        password.sendKeys(Keys.ENTER);
       // loginButton.click();
    }
}
