package aquality.appium.mobile.template.screens.abstractions;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ITextBox;
import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

public abstract class LoginScreen extends Screen {

    private final ITextBox usernameTxb;
    private final ITextBox passwordTxb;
    private final IButton loginBtn;

    protected LoginScreen(By locator) {
        super(locator, "Login");
        usernameTxb = getElementFactory().getTextBox(getUsernameTxbLoc(), "Username");
        passwordTxb = getElementFactory().getTextBox(getPasswordTxbLoc(), "Password");
        loginBtn = getElementFactory().getButton(getLoginBtnLoc(), "Login");
    }

    protected abstract By getUsernameTxbLoc();

    protected abstract By getPasswordTxbLoc();

    protected abstract By getLoginBtnLoc();

    public aquality.appium.mobile.template.screens.abstractions.LoginScreen setUsername(final String username) {
        usernameTxb.sendKeys(username);
        return this;
    }

    public aquality.appium.mobile.template.screens.abstractions.LoginScreen setPassword(final String password) {
        passwordTxb.typeSecret(password);
        return this;
    }

    public void tapLogin() {
        loginBtn.click();
    }
}
