import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import javax.inject.Inject;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Car {
    private static final String TAG = "car";

    private Engine engine;
    private Wheel wheel;

    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public void dirve() {
        System.out.println("Driving..");
    }
}
