package aquality.appium.mobile.template.screens.ios;

import aquality.appium.mobile.screens.IOSScreen;
import aquality.appium.mobile.template.screens.interfaces.ILoginScreen;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static io.appium.java_client.MobileBy.AccessibilityId;

public class LoginScreen extends IOSScreen implements ILoginScreen {

    public LoginScreen() {
        super(AccessibilityId("not_implemented"), "Login");
    }

    @Override
    public ILoginScreen setUsername(final String username) {
        throw new NotImplementedException();
    }

    @Override
    public ILoginScreen setPassword(final String password) {
        throw new NotImplementedException();
    }

    @Override
    public void tapLogin() {
        throw new NotImplementedException();
    }
}
