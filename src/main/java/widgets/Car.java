package widgets;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Car {
    private static final String TAG = "car";

    /* Field injection: Run.Runner has to do werid "carComponent.inject(this);" is because
    field injection would not be triggered if there's no constructor injection. What we did
    in Run.Runner can be thought of we do injection manually.
    Injection order: constructor -> field -> method
     */
    @Inject
    Engine engine;

    private Wheel wheel;

    @Inject
    public Car(Wheel wheel) {
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
        this.engine.start();
        System.out.println("Driving..");
    }
}
