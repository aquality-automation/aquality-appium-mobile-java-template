package aquality.appium.mobile.template.cucumber.objectfactory;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.screens.screenfactory.IScreenFactory;
import aquality.appium.mobile.template.utilities.IScreenshotProvider;
import aquality.appium.mobile.template.utilities.ScreenshotProvider;
import com.google.inject.AbstractModule;

final class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        this.bind(IScreenFactory.class).toInstance(AqualityServices.getScreenFactory());
        this.bind(IScreenshotProvider.class).toInstance(new ScreenshotProvider());
    }
}
