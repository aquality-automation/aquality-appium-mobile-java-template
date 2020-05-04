package aquality.appium.mobile.template.cucumber.stepdefinitions;

import aquality.appium.mobile.screens.screenfactory.IScreenFactory;
import aquality.appium.mobile.template.screens.interfaces.IAlert;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import javax.inject.Inject;

public class CommonSteps {

    private final IAlert alert;

    @Inject
    public CommonSteps(IScreenFactory screenFactory) {
        alert = screenFactory.getScreen(IAlert.class);
    }

    @Then("'{}' alert appears")
    public void alertAppears(String alertMessage) {
        Assert.assertTrue(alert.state().waitForDisplayed(), "Alert appeared");
        Assert.assertEquals(alertMessage, alert.getMessage(), "Alert message is correct");
    }
}
