package aquality.appium.mobile.template.screens.android;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ILabel;
import aquality.appium.mobile.screens.AndroidScreen;
import aquality.appium.mobile.template.screens.interfaces.IAlert;

import static org.openqa.selenium.By.id;

public class Alert extends AndroidScreen implements IAlert {

    private final ILabel messageLbl = getElementFactory().getLabel(id("android:id/message"), "Message");
    private final IButton okBtn = getElementFactory().getButton(id("android:id/button1"), "OK");

    public Alert() {
        super(id("android:id/alertTitle"), "Alert");
    }

    @Override
    public String getMessage() {
        return messageLbl.getText();
    }

    @Override
    public void tapOk() {
        okBtn.click();
    }
}
