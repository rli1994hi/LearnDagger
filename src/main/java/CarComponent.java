import dagger.Component;
import modules.CarModule;
import modules.EngineModules;
import widgets.Car;

/* Remember to add EngineModules here */
@Component(modules = {EngineModules.class, CarModule.class})
public interface CarComponent {

    Car getCar();

    void inject(Runner runner);
}
