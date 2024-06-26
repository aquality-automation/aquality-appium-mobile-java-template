package aquality.appium.mobile.template.screens.chooseview;

import aquality.appium.mobile.elements.interfaces.ILabel;
import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

import static io.appium.java_client.AppiumBy.accessibilityId;
import static java.lang.String.format;

public abstract class ChooseViewScreen extends Screen {

    protected ChooseViewScreen(By locator) {
        super(locator, "Choose An Awesome View");
    }

    public void openView(final String viewName) {
        getChooseViewLabel(viewName).click();
    }

    protected ILabel getChooseViewLabel(final String viewName) {
        return getElementFactory().getLabel(accessibilityId(viewName), format("Choose %s view", viewName));
    }
}
