package aquality.appium.mobile.template.cucumber.transformations.datatables;

import aquality.appium.mobile.template.models.LoginModel;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.TableTransformer;

import java.util.Map;

public class LoginTransformer implements TableTransformer<LoginModel> {

    @Override
    public LoginModel transform(DataTable dataTable) {
        Map<String, String> entry = dataTable.asMaps().get(0);
        LoginModel contactUsInfoModel = new LoginModel();
        contactUsInfoModel.setUsername(entry.get("Username"));
        contactUsInfoModel.setPassword(entry.get("Password"));
        return contactUsInfoModel;
    }
}
