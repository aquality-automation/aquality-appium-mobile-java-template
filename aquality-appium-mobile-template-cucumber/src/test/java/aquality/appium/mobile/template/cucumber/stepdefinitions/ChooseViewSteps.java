package aquality.appium.mobile.template.cucumber.stepdefinitions;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.template.screens.interfaces.IChooseViewScreen;
import io.cucumber.java.en.Given;

public class ChooseViewSteps {

    private final IChooseViewScreen chooseViewScreen;

    public ChooseViewSteps() {
        chooseViewScreen = AqualityServices.getScreenFactory().getScreen(IChooseViewScreen.class);
    }

    @Given("I open '{}' view")
    public void iOpenView(String viewName) {
        chooseViewScreen.openView(viewName);
    }
}
