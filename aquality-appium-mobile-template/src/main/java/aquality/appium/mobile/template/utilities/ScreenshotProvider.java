package aquality.appium.mobile.template.utilities;

import aquality.appium.mobile.application.AqualityServices;
import org.openqa.selenium.OutputType;

public class ScreenshotProvider implements IScreenshotProvider {

    @Override
    public byte[] takeScreenshot() {
        return AqualityServices.getApplication().getDriver().getScreenshotAs(OutputType.BYTES);
    }
}
