package aquality.appium.mobile.template.screens;

import aquality.appium.mobile.application.PlatformName;
import aquality.appium.mobile.screens.screenfactory.ScreenType;
import org.openqa.selenium.By;

import static io.appium.java_client.MobileBy.*;

@ScreenType(platform = PlatformName.IOS)
public class IOSAlert extends Alert {

    public IOSAlert() {
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