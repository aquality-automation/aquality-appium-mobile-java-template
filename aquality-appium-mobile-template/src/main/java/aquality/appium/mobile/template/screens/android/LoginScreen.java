package aquality.appium.mobile.template.screens.android;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ITextBox;
import aquality.appium.mobile.screens.AndroidScreen;
import aquality.appium.mobile.template.screens.interfaces.ILoginScreen;

import static io.appium.java_client.MobileBy.AccessibilityId;
import static org.openqa.selenium.By.xpath;

public class LoginScreen extends AndroidScreen implements ILoginScreen {

    private final ITextBox usernameTxb = getElementFactory().getTextBox(AccessibilityId("username"), "Username");
    private final ITextBox passwordTxb = getElementFactory().getTextBox(AccessibilityId("password"), "Password");
    private final IButton loginBtn = getElementFactory().getButton(AccessibilityId("loginBtn"), "Login");

    public LoginScreen() {
        super(xpath("//android.widget.TextView[@text='Login']"), "Login");
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
