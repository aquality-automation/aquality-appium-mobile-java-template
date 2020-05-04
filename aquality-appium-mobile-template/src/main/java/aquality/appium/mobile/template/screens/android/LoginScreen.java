package aquality.appium.mobile.template.screens.android;

import aquality.appium.mobile.screens.AndroidScreen;
import aquality.appium.mobile.template.screens.interfaces.ILoginScreen;

import static io.appium.java_client.MobileBy.AccessibilityId;
import static org.openqa.selenium.By.xpath;

public class LoginScreen extends AndroidScreen implements ILoginScreen {

    public LoginScreen() {
        super(xpath("//android.widget.TextView[@text='Login']"), "Login");
    }

    @Override
    public ILoginScreen setUsername(final String username) {
        getElementFactory().getTextBox(AccessibilityId("username"), "Username").sendKeys(username);
        return this;
    }

    @Override
    public ILoginScreen setPassword(final String password) {
        getElementFactory().getTextBox(AccessibilityId("password"), "Password").typeSecret(password);
        return this;
    }

    @Override
    public void tapLogin() {
        getElementFactory().getButton(AccessibilityId("loginBtn"), "Login").click();
    }
}