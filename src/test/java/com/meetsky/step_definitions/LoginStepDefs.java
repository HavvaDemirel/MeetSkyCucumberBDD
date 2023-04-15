package com.meetsky.step_definitions;

import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("user logged in successfully")
    public void user_is_on_the_dashboard_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("meetsky.url"));

        loginPage.usernameInputBox.sendKeys(ConfigurationReader.getProperty("meetsky.username.yasemin"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("meetsky.password"));
        loginPage.loginButton.click();
        Assert.assertEquals(Driver.getDriver().getTitle(),ConfigurationReader.getProperty("expected.title"));

    }
}
