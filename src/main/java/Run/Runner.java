package Run;

import dagger.CarComponent;
import dagger.DaggerCarComponent;
import widgets.Car;

import javax.inject.Inject;

public class Runner {
    @Inject
    Car car; // widgets.Car cannot be private - it should be visible to Dagger
  
    @Inject
    Car car2;

    public void demo() {
        /* DaggerCarComponent cannot be used any more. It's only available if none of the module in the component
        * requires param. In our case the DieselEngineModule requires a param - This is how we can pass a run time
        * param */
//        CarComponent carComponent = DaggerCarComponent.create();

        CarComponent carComponent = DaggerCarComponent.builder()
                .horsePower(321)
                .engineCapacity(100)
                .build();

//        widgets.Car car = carComponent.getCar();
        carComponent.inject(this);
        car.dirve();
        /* This time, since the Car and the component having the car are both marked as @Singleton
        *  car will be the same object as car2
        *
        * Think about Singleton as a scope. We mark Car as singleton, and it's in the scope of CarComponent
        */
        System.out.println(System.identityHashCode(car));
        System.out.println(System.identityHashCode(car2));

        /* Some notes for singleton: Only works if the we get objects from the same component. So if we do: */
        CarComponent carComponent2 = DaggerCarComponent.builder()
                .horsePower(321)
                .engineCapacity(100)
                .build();
        Car car3 = carComponent2.getCar();

        /* The first two will print the same value, the third line will be different */
        System.out.println(System.identityHashCode(car));
        System.out.println(System.identityHashCode(car2));
        System.out.println(System.identityHashCode(car3));
    }
}
