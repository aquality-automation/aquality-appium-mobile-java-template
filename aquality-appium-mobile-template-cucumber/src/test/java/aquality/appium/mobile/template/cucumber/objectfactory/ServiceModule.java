package aquality.appium.mobile.template.cucumber.objectfactory;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.screens.screenfactory.IScreenFactory;
import com.google.inject.AbstractModule;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(IScreenFactory.class).to(AqualityServices.getScreenFactory().getClass());
    }
}
