package aquality.appium.mobile.template.testng.utilities;

import aquality.appium.mobile.template.modules.CustomMobileModule;
import aquality.appium.mobile.template.modules.ScreensModule;
import aquality.appium.mobile.template.modules.ServiceModule;
import com.google.inject.Module;
import com.google.inject.util.Modules;
import org.testng.IModuleFactory;
import org.testng.ITestContext;

public class ModuleFactory implements IModuleFactory {
    @Override
    public Module createModule(ITestContext iTestContext, Class<?> aClass) {
        return Modules.combine(new CustomMobileModule(), new ServiceModule(), new ScreensModule());
    }
}
