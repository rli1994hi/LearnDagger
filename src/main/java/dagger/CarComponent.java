package dagger;

import Run.Runner;
import dagger.modules.CarModule;
import dagger.modules.DieselEngineModule;
import dagger.modules.EngineModules;
import widgets.Car;

/* Remember to add EngineModules here */
@Component(modules = {DieselEngineModule.class, CarModule.class})
public interface CarComponent {

    Car getCar();

    void inject(Runner runner);
}
