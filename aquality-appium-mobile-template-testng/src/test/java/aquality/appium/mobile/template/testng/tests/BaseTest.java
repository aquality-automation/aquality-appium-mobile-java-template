package aquality.appium.mobile.template.testng.tests;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.application.IMobileApplication;
import aquality.appium.mobile.template.modules.CustomMobileModule;
import aquality.appium.mobile.template.testng.utilities.ModuleFactory;
import aquality.appium.mobile.template.utilities.IScreenshotProvider;
import aquality.selenium.core.localization.ILocalizedLogger;
import com.google.inject.Inject;
import io.qameta.allure.Allure;
import org.assertj.core.api.Assertions;
import org.assertj.core.description.Description;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Guice;

import java.io.ByteArrayInputStream;
import java.util.function.Consumer;

@Guice(moduleFactory = ModuleFactory.class)
public class BaseTest {
    @Inject
    IScreenshotProvider screenshotProvider;
    @Inject
    ILocalizedLogger localizedLogger;
    @Inject
    CustomMobileModule customBrowserModule;

    private IMobileApplication application;

    @BeforeTest
    public void beforeTest() {
        Consumer<Description> descriptionConsumer = description -> localizedLogger.info("Assertion: %s", description.value());
        Assertions.setDescriptionConsumer(descriptionConsumer);
    }

    @BeforeMethod
    public void setup() {
        AqualityServices.initInjector(customBrowserModule);
        application = AqualityServices.getApplication();
    }

    @AfterMethod
    public void cleanUp(ITestContext context) {
        if (AqualityServices.isApplicationStarted()) {
            Allure.addAttachment("page source", "text/html",
                    application.getDriver().getPageSource(), "html");
            Allure.addAttachment("screenshot", "image/png",
                    new ByteArrayInputStream(screenshotProvider.takeScreenshot()), "png");
            application.terminate();
            application.quit();
        }
    }
}
