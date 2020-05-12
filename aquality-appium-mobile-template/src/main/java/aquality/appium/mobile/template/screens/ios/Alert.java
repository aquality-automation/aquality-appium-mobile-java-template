package aquality.appium.mobile.template.screens.ios;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ILabel;
import aquality.appium.mobile.screens.IOSScreen;
import aquality.appium.mobile.template.screens.interfaces.IAlert;

import static io.appium.java_client.MobileBy.*;

public class Alert extends IOSScreen implements IAlert {

    private final ILabel messageLbl = getElementFactory()
            .getLabel(iOSClassChain("**/XCUIElementTypeOther[$name == 'Alert'$]/XCUIElementTypeStaticText[2]"), "Message");
    private final IButton okBtn = getElementFactory().getButton(AccessibilityId("OK"), "OK");

    public Alert() {
        super(iOSNsPredicateString("type == 'XCUIElementTypeAlert' AND name == 'Alert'"), "Alert");
    }

    @Override
    public String getMessage() {
        return messageLbl.getText();
    }

    @Override
    public void tapOk() {
        okBtn.click();
    }
}