package aquality.appium.mobile.template.screens.android;

import aquality.appium.mobile.application.PlatformName;
import aquality.appium.mobile.screens.screenfactory.ScreenType;

import static org.openqa.selenium.By.xpath;

@ScreenType(platform = PlatformName.ANDROID)
public class ChooseViewScreen extends aquality.appium.mobile.template.screens.abstractions.ChooseViewScreen {

    public ChooseViewScreen() {
        super(xpath("//android.widget.TextView[@text='Choose An Awesome View']"));
    }
}
