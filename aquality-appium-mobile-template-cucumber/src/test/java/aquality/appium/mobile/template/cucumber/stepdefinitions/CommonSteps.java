package aquality.appium.mobile.template.cucumber.stepdefinitions;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.template.screens.interfaces.IAlert;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CommonSteps {

    private final IAlert alert;

    public CommonSteps() {
        alert = AqualityServices.getScreenFactory().getScreen(IAlert.class);
    }

    @Then("'{}' alert appears")
    public void alertAppears(String alertMessage) {
        Assert.assertTrue(alert.state().waitForDisplayed(), "Alert appeared");
        Assert.assertEquals(alertMessage, alert.getMessage(), "Alert message is correct");
    }
}
