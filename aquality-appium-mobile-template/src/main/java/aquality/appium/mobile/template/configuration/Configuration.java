package aquality.appium.mobile.template.configuration;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.application.PlatformName;
import aquality.selenium.core.utilities.ISettingsFile;

public class Configuration {

    private Configuration() {
    }

    public static String getConfigurationValue() {
        return Environment.getCurrentEnvironment().getValue("/configurationValue").toString();
    }

    public static String getBundleId() {
        String key = AqualityServices.getApplicationProfile().getPlatformName() == PlatformName.ANDROID
                ? "/driverSettings/android/capabilities/appPackage"
                : "/driverSettings/ios/capabilities/bundleId";
        return AqualityServices.get(ISettingsFile.class).getValue(key).toString();
    }
}