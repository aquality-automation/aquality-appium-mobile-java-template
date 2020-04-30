package aquality.appium.mobile.template.screens.android;

import aquality.appium.mobile.screens.AndroidScreen;
import aquality.appium.mobile.template.screens.interfaces.IAlert;

import static org.openqa.selenium.By.id;

public class Alert extends AndroidScreen implements IAlert {

    public Alert() {
        super(id("android:id/alertTitle"), "Alert");
    }

    @Override
    public String getMessage() {
        return getElementFactory().getLabel(id("android:id/message"), "Message").getText();
    }

    @Override
    public void tapOk() {
        getElementFactory().getButton(id("android:id/button1"), "OK").click();
    }
}
