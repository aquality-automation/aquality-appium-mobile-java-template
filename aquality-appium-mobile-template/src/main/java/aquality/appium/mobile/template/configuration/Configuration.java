package aquality.appium.mobile.template.configuration;

public class Configuration {

    private Configuration() {
    }

    public static String getConfigurationValue() {
        return Environment.getCurrentEnvironment().getValue("/configurationValue").toString();
    }
}