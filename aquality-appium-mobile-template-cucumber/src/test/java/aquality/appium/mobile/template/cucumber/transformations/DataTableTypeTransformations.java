package aquality.appium.mobile.template.cucumber.transformations;

import aquality.appium.mobile.template.models.LoginModel;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableTypeTransformations {

    @DataTableType
    public LoginModel getLoginModel(Map<String, String> entry) {
        LoginModel model = new LoginModel();
        model.setUsername(entry.get("Username"));
        model.setPassword(entry.get("Password"));
        return model;
    }
}
