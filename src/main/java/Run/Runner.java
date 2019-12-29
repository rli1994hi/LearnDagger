package Run;

import dagger.CarComponent;
import dagger.DaggerCarComponent;
import dagger.modules.DieselEngineModule;
import widgets.Car;

import javax.inject.Inject;

public class Runner {
    @Inject
    Car car; // widgets.Car cannot be private - it should be visible to Dagger

    public void demo() {
        /* DaggerCarComponent cannot be used any more. It's only available if none of the module in the component
        * requires param. In our case the DieselEngineModule requires a param - This is how we can pass a run time
        * param */
//        CarComponent carComponent = DaggerCarComponent.create();

        CarComponent carComponent = DaggerCarComponent.builder()
                .horsePower(321)
                .build();

//        widgets.Car car = carComponent.getCar();
        carComponent.inject(this);
        car.dirve();
    }
}
