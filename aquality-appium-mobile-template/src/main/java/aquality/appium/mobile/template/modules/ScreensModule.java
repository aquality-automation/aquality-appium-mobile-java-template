package aquality.appium.mobile.template.modules;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.screens.screenfactory.IScreenFactory;
import aquality.appium.mobile.template.screens.Alert;
import aquality.appium.mobile.template.screens.chooseview.ChooseViewScreen;
import aquality.appium.mobile.template.screens.login.LoginScreen;
import com.google.inject.AbstractModule;

public class ScreensModule extends AbstractModule {
    private static final IScreenFactory screenFactory = AqualityServices.getScreenFactory();
    @Override
    protected void configure() {
        bind(Alert.class).toInstance(screenFactory.getScreen(Alert.class));
        bind(ChooseViewScreen.class).toInstance(screenFactory.getScreen(ChooseViewScreen.class));
        bind(LoginScreen.class).toInstance(screenFactory.getScreen(LoginScreen.class));
    }
}
