package aquality.appium.mobile.template.screens.ios;

import aquality.appium.mobile.screens.IOSScreen;
import aquality.appium.mobile.template.screens.interfaces.IChooseViewScreen;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static io.appium.java_client.MobileBy.AccessibilityId;

public class ChooseViewScreen extends IOSScreen implements IChooseViewScreen {

    private static final String SCREEN_NAME = "Choose An Awesome View";

    public ChooseViewScreen() {
        super(AccessibilityId("not_implemented"), SCREEN_NAME);
    }

    @Override
    public void openView(final String viewName) {
        throw new NotImplementedException();
    }
}
