package aquality.appium.mobile.template.cucumber.objectfactory;

import aquality.appium.mobile.application.Application;
import aquality.appium.mobile.application.MobileModule;
import aquality.appium.mobile.template.cucumber.utilities.AllureBasedLocalizedLogger;
import aquality.selenium.core.localization.ILocalizedLogger;
import com.google.inject.Provider;

public class CustomMobileModule extends MobileModule {
    public CustomMobileModule(Provider<Application> applicationProvider) {
        super(applicationProvider);
    }

    @Override
    public Class<? extends ILocalizedLogger> getLocalizedLoggerImplementation() {
        return AllureBasedLocalizedLogger.class;
    }
}
