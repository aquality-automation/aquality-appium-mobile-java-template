package aquality.appium.mobile.template.screens.login;

import aquality.appium.mobile.application.PlatformName;
import aquality.appium.mobile.screens.screenfactory.ScreenType;
import org.openqa.selenium.By;

import static io.appium.java_client.MobileBy.*;

@ScreenType(platform = PlatformName.IOS)
public class IOSLoginScreen extends LoginScreen {

    public IOSLoginScreen() {
        super(AccessibilityId("Login"));
    }

    @Override
    protected By getUsernameTxbLoc() {
        return iOSNsPredicateString("type == 'XCUIElementTypeTextField' AND name == 'username'");
    }

    @Override
    protected By getPasswordTxbLoc() {
        return iOSNsPredicateString("type == 'XCUIElementTypeSecureTextField' AND name == 'password'");
    }

    @Override
    protected By getLoginBtnLoc() {
        return iOSClassChain("**/XCUIElementTypeOther[`name == 'loginBtn'`][2]");
    }
}
