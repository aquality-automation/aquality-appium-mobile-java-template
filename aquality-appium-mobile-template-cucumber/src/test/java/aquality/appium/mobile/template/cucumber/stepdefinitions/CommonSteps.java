package aquality.appium.mobile.template.cucumber.stepdefinitions;

import aquality.appium.mobile.screens.screenfactory.IScreenFactory;
import aquality.appium.mobile.template.screens.abstractions.Alert;
import io.cucumber.java.en.Then;

import javax.inject.Inject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CommonSteps {

    private final Alert alert;

    @Inject
    public CommonSteps(IScreenFactory screenFactory) {
        alert = screenFactory.getScreen(Alert.class);
    }

    @Then("'{}' alert appears")
    public void alertAppears(String alertMessage) {
        assertTrue(alert.state().waitForDisplayed(), "Alert appeared");
        assertEquals(alert.getMessage(), alertMessage, "Alert message is correct");
    }
}
