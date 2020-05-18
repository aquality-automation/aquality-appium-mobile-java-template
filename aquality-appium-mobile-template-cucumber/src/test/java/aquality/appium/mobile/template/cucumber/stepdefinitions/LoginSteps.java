package aquality.appium.mobile.template.cucumber.stepdefinitions;

import aquality.appium.mobile.screens.screenfactory.IScreenFactory;
import aquality.appium.mobile.template.models.LoginModel;
import aquality.appium.mobile.template.screens.login.LoginScreen;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.inject.Inject;

import static org.testng.Assert.assertTrue;

public class LoginSteps {

    private final LoginScreen loginScreen;

    @Inject
    public LoginSteps(IScreenFactory screenFactory) {
        loginScreen = screenFactory.getScreen(LoginScreen.class);
    }

    @When("I log in with data:")
    public void iFillInLoginForm(@Transpose LoginModel loginModel) {
        loginScreen.setUsername(loginModel.getUsername())
                .setPassword(loginModel.getPassword())
                .tapLogin();
    }

    @Then("Login Screen is opened")
    public void loginScreenIsOpened() {
        assertTrue(loginScreen.state().waitForDisplayed(), "Login Screen is opened");
    }
}
