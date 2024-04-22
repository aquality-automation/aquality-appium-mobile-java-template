package aquality.appium.mobile.template.testng.steps;

import aquality.appium.mobile.template.screens.Alert;
import io.qameta.allure.Step;

import javax.inject.Inject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlertSteps {

    @Inject
    private Alert alert;

    @Step("'{alertMessage}' alert appears")
    public void checkAlertAppears(String alertMessage) {
        assertTrue(alert.state().waitForDisplayed(), "Alert appeared");
        assertEquals(alert.getMessage(), alertMessage, "Alert message is correct");
    }

    @Step("I accept the alert")
    public void acceptAlert() {
        alert.tapOk();
    }
}
