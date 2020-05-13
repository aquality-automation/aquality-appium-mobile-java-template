package aquality.appium.mobile.template.cucumber.runners;

import aquality.appium.mobile.template.cucumber.objectfactory.CustomObjectFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/java/aquality/appium/mobile/template/cucumber/features"},
        glue = {
                "aquality.appium.mobile.template.cucumber.hooks",
                "aquality.appium.mobile.template.cucumber.transformations",
                "aquality.appium.mobile.template.cucumber.stepdefinitions"
        },
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        strict = true,
        objectFactory = CustomObjectFactory.class
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider()
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
