package aquality.appium.mobile.template.screens.ios;

import aquality.appium.mobile.screens.IOSScreen;
import aquality.appium.mobile.template.screens.interfaces.IAlert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static io.appium.java_client.MobileBy.AccessibilityId;

public class Alert extends IOSScreen implements IAlert {

    public Alert() {
        super(AccessibilityId("not_implemented"), "Alert");
    }

    @Override
    public String getMessage() {
        throw new NotImplementedException();
    }

    @Override
    public void tapOk() {
        throw new NotImplementedException();
    }
}
