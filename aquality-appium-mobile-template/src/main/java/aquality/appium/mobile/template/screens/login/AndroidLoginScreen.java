package aquality.appium.mobile.template.screens.login;

import aquality.appium.mobile.application.PlatformName;
import aquality.appium.mobile.screens.screenfactory.ScreenType;
import org.openqa.selenium.By;

import static io.appium.java_client.AppiumBy.accessibilityId;
import static org.openqa.selenium.By.xpath;

@ScreenType(platform = PlatformName.ANDROID)
public class AndroidLoginScreen extends LoginScreen {

    public AndroidLoginScreen() {
        super(xpath("//android.widget.TextView[@text='Login']"));
    }

    @Override
    protected By getUsernameTxbLoc() {
        return accessibilityId("username");
    }

    @Override
    protected By getPasswordTxbLoc() {
        return accessibilityId("password");
    }

    @Override
    protected By getLoginBtnLoc() {
        return accessibilityId("loginBtn");
    }
}
