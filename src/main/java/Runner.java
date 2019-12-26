import javax.inject.Inject;

public class Runner {
    @Inject
    Car car; // Car cannot be private - it should be visible to Dagger

    public void demo() {
        CarComponent carComponent = DaggerCarComponent.create();
//        Car car = carComponent.getCar();
        carComponent.inject(this);
        car.dirve();
    }
}
