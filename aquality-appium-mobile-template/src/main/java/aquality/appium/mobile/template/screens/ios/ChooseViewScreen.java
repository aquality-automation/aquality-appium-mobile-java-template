package aquality.appium.mobile.template.screens.ios;

import aquality.appium.mobile.application.PlatformName;
import aquality.appium.mobile.screens.screenfactory.ScreenType;

import static io.appium.java_client.MobileBy.iOSNsPredicateString;

@ScreenType(platform = PlatformName.IOS)
public class ChooseViewScreen extends aquality.appium.mobile.template.screens.abstractions.ChooseViewScreen {

    public ChooseViewScreen() {
        super(iOSNsPredicateString("name == 'Choose An Awesome View'"));
    }
}
