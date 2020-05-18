package aquality.appium.mobile.template.screens.chooseview;

import aquality.appium.mobile.application.PlatformName;
import aquality.appium.mobile.screens.screenfactory.ScreenType;

import static org.openqa.selenium.By.xpath;

@ScreenType(platform = PlatformName.ANDROID)
public class AndroidChooseViewScreen extends ChooseViewScreen {

    public AndroidChooseViewScreen() {
        super(xpath("//android.widget.TextView[@text='Choose An Awesome View']"));
    }
}
