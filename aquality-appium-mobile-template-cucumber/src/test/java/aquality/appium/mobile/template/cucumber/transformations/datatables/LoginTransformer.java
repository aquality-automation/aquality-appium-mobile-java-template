package aquality.appium.mobile.template.cucumber.transformations.datatables;

import aquality.appium.mobile.template.models.LoginModel;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.TableTransformer;

public class LoginTransformer implements TableTransformer<LoginModel> {

    @Override
    public LoginModel transform(DataTable dataTable) {
        LoginModel contactUsInfoModel = new LoginModel();
        contactUsInfoModel.setUsername(getValue(dataTable, "Username"));
        contactUsInfoModel.setPassword(getValue(dataTable, "Password"));
        return contactUsInfoModel;
    }

    private String getValue(final DataTable dataTable, final String key) {
        return dataTable.cells().stream()
                .filter(cell -> cell.get(0).equals(key))
                .map(cell -> cell.get(1))
                .findFirst().orElse("");
    }
}
