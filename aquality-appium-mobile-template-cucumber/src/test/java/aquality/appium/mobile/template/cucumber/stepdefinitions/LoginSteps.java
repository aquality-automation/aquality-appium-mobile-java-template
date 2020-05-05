package aquality.appium.mobile.template.cucumber.stepdefinitions;

import aquality.appium.mobile.screens.screenfactory.IScreenFactory;
import aquality.appium.mobile.template.models.LoginModel;
import aquality.appium.mobile.template.screens.interfaces.ILoginScreen;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import javax.inject.Inject;

public class LoginSteps {

    private final ILoginScreen loginScreen;

    @Inject
    public LoginSteps(IScreenFactory screenFactory) {
        loginScreen = screenFactory.getScreen(ILoginScreen.class);
    }

    @When("I log in with data:")
    public void iFillInLoginForm(LoginModel loginModel) {
        loginScreen.setUsername(loginModel.getUsername())
                .setPassword(loginModel.getPassword())
                .tapLogin();
    }

    @Then("Login Screen is opened")
    public void loginScreenIsOpened() {
        Assert.assertTrue(loginScreen.state().waitForDisplayed(), "Login Screen is opened");
    }
}
