package aquality.appium.mobile.template.cucumber.stepdefinitions;

import aquality.appium.mobile.screens.screenfactory.IScreenFactory;
import aquality.appium.mobile.template.screens.interfaces.IChooseViewScreen;
import io.cucumber.java.en.Given;

import javax.inject.Inject;

public class ChooseViewSteps {

    private final IChooseViewScreen chooseViewScreen;

    @Inject
    public ChooseViewSteps(IScreenFactory screenFactory) {
        chooseViewScreen = screenFactory.getScreen(IChooseViewScreen.class);
    }

    @Given("I open '{}' view")
    public void iOpenView(String viewName) {
        chooseViewScreen.openView(viewName);
    }
}
