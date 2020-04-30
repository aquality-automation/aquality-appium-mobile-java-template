package aquality.appium.mobile.template.screens.interfaces;

public interface ILoginScreen extends IScreen {

    ILoginScreen setUsername(final String username);

    ILoginScreen setPassword(final String password);

    void tapLogin();
}
