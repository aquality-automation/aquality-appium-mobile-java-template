package aquality.appium.mobile.template.cucumber.stepdefinitions;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.screens.screenfactory.IScreenFactory;
import aquality.appium.mobile.template.screens.chooseview.ChooseViewScreen;
import io.cucumber.java.en.Given;
import io.qameta.allure.Allure;

import javax.inject.Inject;

public class ChooseViewSteps {

    private final ChooseViewScreen chooseViewScreen;

    @Inject
    public ChooseViewSteps(IScreenFactory screenFactory) {
        chooseViewScreen = screenFactory.getScreen(ChooseViewScreen.class);
    }

    @Given("I open '{}' view")
    public void iOpenView(String viewName) {
        updateAllureTestName();
        chooseViewScreen.openView(viewName);
    }

    private void updateAllureTestName() {
        Allure.getLifecycle().updateTestCase(testResult -> {
            String oldName = testResult.getName();
            testResult.setName(String.format("%s: %s", oldName, AqualityServices.getApplicationProfile().getPlatformName()));
        });
    }
}
