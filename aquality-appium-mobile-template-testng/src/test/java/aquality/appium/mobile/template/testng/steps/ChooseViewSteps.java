package aquality.appium.mobile.template.testng.steps;

import aquality.appium.mobile.template.screens.chooseview.ChooseViewScreen;
import io.qameta.allure.Step;

import javax.inject.Inject;

public class ChooseViewSteps {

    @Inject
    private ChooseViewScreen chooseViewScreen;

    @Step("I open '{viewName}' view")
    public void openView(String viewName) {
        chooseViewScreen.openView(viewName);
    }
}
