package aquality.appium.mobile.template.cucumber.stepdefinitions;

import aquality.appium.mobile.screens.screenfactory.IScreenFactory;
import aquality.appium.mobile.template.screens.abstractions.ChooseViewScreen;
import io.cucumber.java.en.Given;

import javax.inject.Inject;

public class ChooseViewSteps {

    private final ChooseViewScreen chooseViewScreen;

    @Inject
    public ChooseViewSteps(IScreenFactory screenFactory) {
        chooseViewScreen = screenFactory.getScreen(ChooseViewScreen.class);
    }

    @Given("I open '{}' view")
    public void iOpenView(String viewName) {
        chooseViewScreen.openView(viewName);
    }
}
