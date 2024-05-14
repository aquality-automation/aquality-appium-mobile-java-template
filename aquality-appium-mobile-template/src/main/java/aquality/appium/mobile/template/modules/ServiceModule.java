package aquality.appium.mobile.template.modules;

import aquality.appium.mobile.template.utilities.IScreenshotProvider;
import aquality.appium.mobile.template.utilities.ScreenshotProvider;
import com.google.inject.AbstractModule;

public final class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        this.bind(IScreenshotProvider.class).toInstance(new ScreenshotProvider());
    }
}
