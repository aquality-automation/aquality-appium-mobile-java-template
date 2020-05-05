package aquality.appium.mobile.template.cucumber.runners;

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
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
