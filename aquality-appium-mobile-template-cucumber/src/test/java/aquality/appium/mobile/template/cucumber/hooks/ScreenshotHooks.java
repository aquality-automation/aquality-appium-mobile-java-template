package aquality.appium.mobile.template.cucumber.hooks;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.template.utilities.IScreenshotProvider;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import javax.inject.Inject;

public class ScreenshotHooks {

    private final IScreenshotProvider screenshotProvider;

    @Inject
    public ScreenshotHooks(IScreenshotProvider screenshotProvider) {
        this.screenshotProvider = screenshotProvider;
    }

    @After(order = 1)
    public void takeScreenshot(Scenario scenario) {
        if (AqualityServices.isApplicationStarted()) {
            scenario.attach(screenshotProvider.takeScreenshot(), "image/png", "screenshot.png");
        }
    }
}
