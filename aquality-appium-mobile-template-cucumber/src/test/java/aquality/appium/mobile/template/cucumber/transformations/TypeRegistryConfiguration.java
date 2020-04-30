package aquality.appium.mobile.template.cucumber.transformations;

import aquality.appium.mobile.template.cucumber.transformations.datatables.LoginTransformer;
import aquality.appium.mobile.template.models.LoginModel;
import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;

import java.util.Locale;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(new DataTableType(LoginModel.class, new LoginTransformer()));
    }
}
