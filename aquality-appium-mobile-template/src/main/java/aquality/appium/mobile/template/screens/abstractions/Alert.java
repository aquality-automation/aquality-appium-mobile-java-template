package aquality.appium.mobile.template.screens.abstractions;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ILabel;
import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

public abstract class Alert extends Screen {

    private final ILabel messageLbl;
    private final IButton okBtn;

    protected Alert(By locator) {
        super(locator, "Alert");
        messageLbl = getElementFactory().getLabel(getMessageLblLoc(), "Message");
        okBtn = getElementFactory().getButton(getOkBtnLoc(), "OK");
    }

    protected abstract By getMessageLblLoc();

    protected abstract By getOkBtnLoc();

    public String getMessage() {
        return messageLbl.getText();
    }

    public void tapOk() {
        okBtn.click();
    }
}
