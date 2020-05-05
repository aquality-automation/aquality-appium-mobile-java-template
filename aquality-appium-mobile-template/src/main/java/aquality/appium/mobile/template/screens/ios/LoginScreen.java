package aquality.appium.mobile.template.screens.ios;

import aquality.appium.mobile.screens.IOSScreen;
import aquality.appium.mobile.template.screens.interfaces.ILoginScreen;
import org.apache.commons.lang3.NotImplementedException;

import static io.appium.java_client.MobileBy.AccessibilityId;

public class LoginScreen extends IOSScreen implements ILoginScreen {

    public LoginScreen() {
        super(AccessibilityId("not_implemented"), "Login");
    }

    @Override
    public ILoginScreen setUsername(final String username) {
        throw new NotImplementedException("iOS screens are not implemented");
    }

    @Override
    public ILoginScreen setPassword(final String password) {
        throw new NotImplementedException("iOS screens are not implemented");
    }

    @Override
    public void tapLogin() {
        throw new NotImplementedException("iOS screens are not implemented");
    }
}
