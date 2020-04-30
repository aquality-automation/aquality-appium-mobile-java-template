package aquality.appium.mobile.template.cucumber.hooks;

import aquality.appium.mobile.template.utilities.ScreenshotProvider;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;

public class ScreenshotHooks {

    @After(order = 1)
    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenshotProvider screenshotProvider = new ScreenshotProvider();
            scenario.embed(screenshotProvider.takeScreenshot(), "image/png");
        }
    }
}
