package com.ShopApotheke.step_definitions;

import com.ShopApotheke.pages.LoginPage;
import com.ShopApotheke.utilities.ConfigurationReader;
import com.ShopApotheke.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginStep_defs {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("Customer is on the Login Page")
    public void customer_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }
    @When("Customer login with valid credentials: Username {string} and Password {string}")
    public void customer_login_with_valid_credentials_username_and_password(String username, String password) {

        loginPage.loginFunctionality(username, password);

    }

    @Then("Customer should see dashboard with text that contains {string}")
    public void customerShouldSeeDashboardWithTextThatContains(String expectedResult) {

        wait.until(ExpectedConditions.visibilityOf(loginPage.loginText));
        String actualResult = loginPage.loginText.getText();

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @When("Customer login with invalid credentials: Username {string} and Password {string}")
    public void customerLoginWithInvalidCredentialsUsernameAndPassword(String username, String password) {

        loginPage.loginFunctionality(username, password);
    }


    @Then("Customer should see error message {string}")
    public void customerShouldSeeErrorMessage(String expectedResult) {

       // wait.until(ExpectedConditions.visibilityOf(loginPage.errorMessage));
        String actualResult = loginPage.errorMessage.getText();
        System.out.println("actualResult = " + actualResult);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
