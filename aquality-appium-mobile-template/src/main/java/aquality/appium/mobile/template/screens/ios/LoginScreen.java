package aquality.appium.mobile.template.screens.ios;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ITextBox;
import aquality.appium.mobile.screens.IOSScreen;
import aquality.appium.mobile.template.screens.interfaces.ILoginScreen;

import static io.appium.java_client.MobileBy.*;

public class LoginScreen extends IOSScreen implements ILoginScreen {

    private final ITextBox usernameTxb = getElementFactory()
            .getTextBox(iOSNsPredicateString("type == 'XCUIElementTypeTextField' AND name == 'username'"), "Username");
    private final ITextBox passwordTxb = getElementFactory()
            .getTextBox(iOSNsPredicateString("type == 'XCUIElementTypeSecureTextField' AND name == 'password'"), "Password");
    private final IButton loginBtn = getElementFactory().getButton(iOSClassChain("**/XCUIElementTypeOther[`name == 'loginBtn'`][2]"), "Login");

    public LoginScreen() {
        super(AccessibilityId("Login"), "Login");
    }

    @Override
    public ILoginScreen setUsername(final String username) {
        usernameTxb.sendKeys(username);
        return this;
    }

    @Override
    public ILoginScreen setPassword(final String password) {
        passwordTxb.typeSecret(password);
        return this;
    }

    @Override
    public void tapLogin() {
        loginBtn.click();
    }
}
