package aquality.appium.mobile.template.screens;

import aquality.appium.mobile.application.PlatformName;
import aquality.appium.mobile.screens.screenfactory.ScreenType;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.id;

@ScreenType(platform = PlatformName.ANDROID)
public class AndroidAlert extends Alert {

    public AndroidAlert() {
        super(id("android:id/alertTitle"));
    }

    @Override
    protected By getMessageLblLoc() {
        return id("android:id/message");
    }

    @Override
    protected By getOkBtnLoc() {
        return id("android:id/button1");
    }
}
