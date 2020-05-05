package aquality.appium.mobile.template.cucumber.hooks;

import aquality.appium.mobile.application.AqualityServices;
import io.cucumber.java.After;

public class ApplicationHooks {

    @After(order = 0)
    public void closeApplication() {
        if (AqualityServices.isApplicationStarted()) {
            AqualityServices.getApplication().quit();
        }
    }
}
