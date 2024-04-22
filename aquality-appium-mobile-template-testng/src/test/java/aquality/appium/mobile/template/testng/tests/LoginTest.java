package aquality.appium.mobile.template.testng.tests;

import aquality.appium.mobile.template.models.LoginModel;
import aquality.appium.mobile.template.testng.constants.AlertMessages;
import aquality.appium.mobile.template.testng.constants.ViewNames;
import aquality.appium.mobile.template.testng.steps.ChooseViewSteps;
import aquality.appium.mobile.template.testng.steps.LoginSteps;
import aquality.appium.mobile.template.testng.utilities.JsonDataProvider;
import org.testng.annotations.Test;

import javax.inject.Inject;

public class LoginTest extends BaseTest {

    @Inject
    LoginSteps loginSteps;

    @Inject
    ChooseViewSteps chooseViewSteps;

    @Test(description = "Login with invalid credentials is impossible",
            dataProvider = "getLoginData", dataProviderClass = JsonDataProvider.class)
    public void testLoginWithInvalidCredentials(LoginModel loginModel) {
        chooseViewSteps.openView(ViewNames.LOGIN_SCREEN);
        loginSteps.checkLoginScreenIsOpened();
        loginSteps.saveLoginScreenDump();
        loginSteps.fillInLoginForm(loginModel);
        commonSteps.checkAlertAppears(AlertMessages.INVALID_CREDENTIALS);
        commonSteps.acceptAlert();
        loginSteps.checkLoginScreenDumpIsDifferent();
    }
}
