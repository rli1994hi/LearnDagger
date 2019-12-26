import dagger.Component;
import widgets.Car;

@Component
public interface CarComponent {

    Car getCar();

    void inject(Runner runner);
}
