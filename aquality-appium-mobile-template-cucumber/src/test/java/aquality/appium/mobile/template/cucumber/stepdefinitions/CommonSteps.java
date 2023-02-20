package aquality.appium.mobile.template.cucumber.stepdefinitions;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.screens.screenfactory.IScreenFactory;
import aquality.appium.mobile.template.screens.Alert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Parameter;

import javax.inject.Inject;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CommonSteps {

    private final Alert alert;

    @Inject
    public CommonSteps(IScreenFactory screenFactory) {
        alert = screenFactory.getScreen(Alert.class);
    }

    @Given("Allure test name has been updated by the platform parameter")
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

    @Then("'{}' alert appears")
    public void alertAppears(String alertMessage) {
        assertTrue(alert.state().waitForDisplayed(), "Alert appeared");
        assertEquals(alert.getMessage(), alertMessage, "Alert message is correct");
    }
}
