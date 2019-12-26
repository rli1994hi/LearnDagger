package widgets;

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

    /**
     * A demo method for method injection. Method injection is rarely used. We only use it when
     * we need to pass injected object(Car) into the args(Remote)
     * @param remote
     */
    @Inject
    public void setRemote(Remote remote) {
        remote.setListener(this);
    }

    public void dirve() {
        System.out.println("Driving..");
    }
}
