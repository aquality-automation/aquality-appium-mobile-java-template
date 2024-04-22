package aquality.appium.mobile.template.testng.steps;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.template.screens.Alert;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import io.qameta.allure.model.Parameter;

import javax.inject.Inject;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CommonSteps {

    @Inject
    private Alert alert;

    @Step("Allure test name has been updated by the platform parameter")
    public void updateAllureTestName() {
        Allure.getLifecycle().updateTestCase(testResult -> {
            List<Parameter> oldParameters = testResult.getParameters();
            Parameter parameter = new Parameter();
            parameter.setName("platform");
            parameter.setValue(AqualityServices.getApplicationProfile().getPlatformName().toString());
            oldParameters.add(parameter);
            testResult.setHistoryId(testResult.getHistoryId() + parameter.getValue());
            String oldName = testResult.getFullName();
            testResult.setFullName(String.format("%s: %s", oldName, parameter.getValue()));
        });
    }

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
