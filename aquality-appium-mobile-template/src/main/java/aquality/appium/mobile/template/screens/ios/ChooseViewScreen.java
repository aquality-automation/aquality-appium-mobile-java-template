package aquality.appium.mobile.template.screens.ios;

import aquality.appium.mobile.screens.IOSScreen;
import aquality.appium.mobile.template.screens.interfaces.IChooseViewScreen;

import static io.appium.java_client.MobileBy.AccessibilityId;
import static io.appium.java_client.MobileBy.iOSNsPredicateString;
import static java.lang.String.format;

public class ChooseViewScreen extends IOSScreen implements IChooseViewScreen {

    private static final String SCREEN_NAME = "Choose An Awesome View";

    public ChooseViewScreen() {
        super(iOSNsPredicateString(format("name == '%s'", SCREEN_NAME)), SCREEN_NAME);
    }

    @Override
    public void openView(final String viewName) {
        getElementFactory().getLabel(AccessibilityId(viewName), format("Choose %s view", viewName)).click();
    }
}
