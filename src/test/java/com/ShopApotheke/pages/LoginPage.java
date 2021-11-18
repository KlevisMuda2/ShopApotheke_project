package com.ShopApotheke.pages;

import com.ShopApotheke.utilities.Driver;
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

    //Method for login functionality
    public void loginFunctionality(String username, String passwords){

        email.sendKeys(username);
        password.sendKeys(passwords);
        okButton.click();
        loginButton.click();
    }
}
