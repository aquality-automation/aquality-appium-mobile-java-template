package aquality.appium.mobile.template.cucumber.objectfactory;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.screens.screenfactory.IScreenFactory;
import aquality.appium.mobile.template.utilities.ScreenshotProvider;
import com.google.inject.AbstractModule;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(IScreenFactory.class).toInstance(AqualityServices.getScreenFactory());
        bind(ScreenshotProvider.class).toInstance(new ScreenshotProvider());
    }
}
