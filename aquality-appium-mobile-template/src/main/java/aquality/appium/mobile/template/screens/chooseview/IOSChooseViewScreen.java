package aquality.appium.mobile.template.screens.chooseview;

import aquality.appium.mobile.application.PlatformName;
import aquality.appium.mobile.screens.screenfactory.ScreenType;

import static io.appium.java_client.AppiumBy.iOSNsPredicateString;

@ScreenType(platform = PlatformName.IOS)
public class IOSChooseViewScreen extends ChooseViewScreen {

    public IOSChooseViewScreen() {
        super(iOSNsPredicateString("name == 'Choose An Awesome View'"));
    }
}
