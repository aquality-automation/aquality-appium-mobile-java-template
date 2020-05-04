package aquality.appium.mobile.template.cucumber.hooks;

import aquality.appium.mobile.template.utilities.ScreenshotProvider;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;

import javax.inject.Inject;

public class ScreenshotHooks {

    private final ScreenshotProvider screenshotProvider;

    @Inject
    public ScreenshotHooks(ScreenshotProvider screenshotProvider) {
        this.screenshotProvider = screenshotProvider;
    }

    @After(order = 1)
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.embed(screenshotProvider.takeScreenshot(), "image/png");
        }
    }
}
