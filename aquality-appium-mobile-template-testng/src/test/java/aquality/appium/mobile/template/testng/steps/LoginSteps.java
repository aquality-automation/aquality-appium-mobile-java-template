package aquality.appium.mobile.template.testng.steps;

import aquality.appium.mobile.template.models.LoginModel;
import aquality.appium.mobile.template.screens.login.LoginScreen;
import io.qameta.allure.Step;

import javax.inject.Inject;

import static org.testng.Assert.assertTrue;

public class LoginSteps {

    @Inject
    private LoginScreen loginScreen;

    @Step("I log in with data:")
    public void fillInLoginForm(LoginModel loginModel) {
        loginScreen.setUsername(loginModel.getUsername())
                .setPassword(loginModel.getPassword())
                .tapLogin();
    }

    @Step("Login Screen is opened")
    public void checkLoginScreenIsOpened() {
        assertTrue(loginScreen.state().waitForDisplayed(), "Login Screen is opened");
    }

    @Step("I save Login Screen dump")
    public void saveLoginScreenDump() {
        loginScreen.dump().save();
    }

    @Step("Login Screen dump is different")
    public void checkLoginScreenDumpIsDifferent() {
        assertTrue(loginScreen.dump().compare() > 0, "The form dump should differ");
    }
}
