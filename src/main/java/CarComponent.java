import dagger.Component;

import javax.inject.Inject;

@Component
public interface CarComponent {

    Car getCar();

    void inject(Runner runner);
}