package aquality.appium.mobile.template.modules;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.application.MobileModule;
import aquality.appium.mobile.template.utilities.AllureBasedLocalizedLogger;
import aquality.selenium.core.localization.ILocalizedLogger;

public class CustomMobileModule extends MobileModule {
    public CustomMobileModule() {
        super(AqualityServices::getApplication);
    }

    @Override
    public Class<? extends ILocalizedLogger> getLocalizedLoggerImplementation() {
        return AllureBasedLocalizedLogger.class;
    }
}
