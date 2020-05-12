package aquality.appium.mobile.template.cucumber.hooks;

import aquality.appium.mobile.template.utilities.IScreenshotProvider;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;

import javax.inject.Inject;

public class ScreenshotHooks {

    private final IScreenshotProvider screenshotProvider;

    @Inject
    public ScreenshotHooks(IScreenshotProvider screenshotProvider) {
        this.screenshotProvider = screenshotProvider;
    }

    @After(order = 1)
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.embed(screenshotProvider.takeScreenshot(), "image/png");
        }
    }
}
