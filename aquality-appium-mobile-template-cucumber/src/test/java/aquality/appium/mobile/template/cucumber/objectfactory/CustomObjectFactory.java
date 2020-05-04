package aquality.appium.mobile.template.cucumber.objectfactory;

import com.google.inject.Guice;
import com.google.inject.Injector;
import cucumber.api.guice.CucumberModules;
import cucumber.runtime.java.guice.ScenarioScope;
import io.cucumber.core.backend.ObjectFactory;

public class CustomObjectFactory implements ObjectFactory {

    private Injector injector;

    public CustomObjectFactory() {
        this.injector = Guice.createInjector(CucumberModules.createScenarioModule(), new ServiceModule());
    }

    @Override
    public void start() {
        this.injector.getInstance(ScenarioScope.class).enterScope();
    }

    @Override
    public void stop() {
        this.injector.getInstance(ScenarioScope.class).exitScope();
    }

    @Override
    public boolean addClass(Class<?> aClass) {
        return true;
    }

    @Override
    public <T> T getInstance(Class<T> aClass) {
        return this.injector.getInstance(aClass);
    }
}
