package aquality.appium.mobile.template.testng.utilities;

import aquality.appium.mobile.application.AqualityServices;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class TestNameListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        ITestNGMethod testngMethod = result.getMethod();
        String platformName = AqualityServices.getApplicationProfile().getPlatformName().toString();
        String oldName = testngMethod.getDescription();
        testngMethod.setDescription(String.format("%s: %s", oldName, platformName));
    }
}
