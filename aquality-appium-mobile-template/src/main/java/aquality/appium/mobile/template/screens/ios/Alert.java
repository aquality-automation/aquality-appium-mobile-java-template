package aquality.appium.mobile.template.screens.ios;

import aquality.appium.mobile.screens.IOSScreen;
import aquality.appium.mobile.template.screens.interfaces.IAlert;

import static io.appium.java_client.MobileBy.*;

public class Alert extends IOSScreen implements IAlert {

    public Alert() {
        super(iOSNsPredicateString("type == 'XCUIElementTypeAlert' AND name == 'Alert'"), "Alert");
    }

    @Override
    public String getMessage() {
        return getElementFactory()
                .getLabel(iOSClassChain("**/XCUIElementTypeOther[$name == 'Alert'$]/XCUIElementTypeStaticText[2]"), "Message")
                .getText();
    }

    @Override
    public void tapOk() {
        getElementFactory().getButton(AccessibilityId("OK"), "OK").click();
    }
}