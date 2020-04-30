package aquality.appium.mobile.template.screens.android;

import aquality.appium.mobile.screens.AndroidScreen;
import aquality.appium.mobile.template.screens.interfaces.IChooseViewScreen;

import static io.appium.java_client.MobileBy.AccessibilityId;
import static java.lang.String.format;
import static org.openqa.selenium.By.xpath;

public class ChooseViewScreen extends AndroidScreen implements IChooseViewScreen {

    private static final String SCREEN_NAME = "Choose An Awesome View";

    public ChooseViewScreen() {
        super(xpath(format("//android.widget.TextView[@text='%s']", SCREEN_NAME)), SCREEN_NAME);
    }

    @Override
    public void openView(final String viewName) {
        getElementFactory().getLabel(AccessibilityId(viewName), format("Choose %s view", viewName)).click();
    }
}
