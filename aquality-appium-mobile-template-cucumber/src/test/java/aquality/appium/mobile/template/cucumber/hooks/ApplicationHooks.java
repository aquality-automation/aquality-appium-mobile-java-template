package aquality.appium.mobile.template.cucumber.hooks;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.template.cucumber.objectfactory.CustomMobileModule;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {

    @Before(order = 0)
    public void reinitializeAqualityServices() {
        AqualityServices.initInjector(new CustomMobileModule(AqualityServices::getApplication));
    }

    @After(order = 0)
    public void closeApplication() {
        if (AqualityServices.isApplicationStarted()) {
            AqualityServices.getApplication().quit();
        }
    }
}
