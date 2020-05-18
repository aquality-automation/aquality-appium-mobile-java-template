package aquality.appium.mobile.template.screens.chooseview;

import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

import static io.appium.java_client.MobileBy.AccessibilityId;
import static java.lang.String.format;

public abstract class ChooseViewScreen extends Screen {

    protected ChooseViewScreen(By locator) {
        super(locator, "Choose An Awesome View");
    }

    public void openView(final String viewName) {
        getElementFactory().getLabel(AccessibilityId(viewName), format("Choose %s view", viewName)).click();
    }
}
