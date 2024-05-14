package aquality.appium.mobile.template.screens.chooseview;

import aquality.appium.mobile.application.PlatformName;
import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.screens.screenfactory.ScreenType;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

@ScreenType(platform = PlatformName.ANDROID)
public class AndroidChooseViewScreen extends ChooseViewScreen {
    private final IButton waitBtn = getElementFactory().getButton(By.id("android:id/aerr_wait"), "Wait");

    public AndroidChooseViewScreen() {
        super(xpath("//android.widget.TextView[@text='Choose An Awesome View']"));
    }

    @Override
    public void openView(String viewName) {
        if (!getChooseViewLabel(viewName).state().waitForDisplayed() && waitBtn.state().isDisplayed()) {
            waitBtn.click();
            waitBtn.state().waitForNotDisplayed();
        }
        super.openView(viewName);
    }
}
