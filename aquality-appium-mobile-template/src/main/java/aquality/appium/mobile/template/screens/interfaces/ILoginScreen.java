package aquality.appium.mobile.template.screens.interfaces;

import aquality.appium.mobile.screens.IScreen;

public interface ILoginScreen extends IScreen {

    ILoginScreen setUsername(final String username);

    ILoginScreen setPassword(final String password);

    void tapLogin();
}
