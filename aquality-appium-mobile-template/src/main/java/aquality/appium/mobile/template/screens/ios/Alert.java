package aquality.appium.mobile.template.screens.ios;

import aquality.appium.mobile.application.PlatformName;
import aquality.appium.mobile.screens.screenfactory.ScreenType;
import org.openqa.selenium.By;

import static io.appium.java_client.MobileBy.*;

@ScreenType(platform = PlatformName.IOS)
public class Alert extends aquality.appium.mobile.template.screens.abstractions.Alert {

    public Alert() {
        super(iOSNsPredicateString("type == 'XCUIElementTypeAlert' AND name == 'Alert'"));
    }

    @Override
    protected By getMessageLblLoc() {
        return iOSClassChain("**/XCUIElementTypeOther[$name == 'Alert'$]/XCUIElementTypeStaticText[2]");
    }

    @Override
    protected By getOkBtnLoc() {
        return AccessibilityId("OK");
    }
}