package aquality.appium.mobile.template.utilities;

import aquality.appium.mobile.application.AqualityServices;
import io.qameta.allure.listener.TestLifecycleListener;
import io.qameta.allure.model.Parameter;
import io.qameta.allure.model.TestResult;

import java.util.List;

public class AllureListener implements TestLifecycleListener {

    public void afterTestStart(TestResult result) {
        List<Parameter> oldParameters = result.getParameters();
        Parameter parameter = new Parameter();
        parameter.setName("platform");
        parameter.setValue(AqualityServices.getApplicationProfile().getPlatformName().toString());
        oldParameters.add(parameter);
        result.setHistoryId(result.getHistoryId() + parameter.getValue());
        String oldName = result.getFullName();
        result.setFullName(String.format("%s: %s", oldName, parameter.getValue()));
    }
}
