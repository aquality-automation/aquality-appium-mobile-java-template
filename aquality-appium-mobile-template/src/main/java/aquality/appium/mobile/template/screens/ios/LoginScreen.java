package aquality.appium.mobile.template.screens.ios;

import aquality.appium.mobile.screens.IOSScreen;
import aquality.appium.mobile.template.screens.interfaces.ILoginScreen;

import static io.appium.java_client.MobileBy.*;

public class LoginScreen extends IOSScreen implements ILoginScreen {

    public LoginScreen() {
        super(AccessibilityId("Login"), "Login");
    }

    @Override
    public ILoginScreen setUsername(final String username) {
        getElementFactory()
                .getTextBox(iOSNsPredicateString("type == 'XCUIElementTypeTextField' AND name == 'username'"), "Username")
                .sendKeys(username);
        return this;
    }

    @Override
    public ILoginScreen setPassword(final String password) {
        getElementFactory()
                .getTextBox(iOSNsPredicateString("type == 'XCUIElementTypeSecureTextField' AND name == 'password'"), "Password")
                .typeSecret(password);
        return this;
    }

    @Override
    public void tapLogin() {
        getElementFactory().getButton(iOSClassChain("**/XCUIElementTypeOther[`name == 'loginBtn'`][2]"), "Login").click();
    }
}
