import dagger.Component;
import modules.CarModule;
import widgets.Car;

@Component(modules = CarModule.class)
public interface CarComponent {

    Car getCar();

    void inject(Runner runner);
}
