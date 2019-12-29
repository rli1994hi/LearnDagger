package widgets;

import javax.inject.Inject;
import javax.inject.Named;

public class GasEngine implements Engine {

    private int horsePower;
    private int engineCapacity;

    public static final String HORSE_POWER_NAME = "horsePower";
    public static final String ENGINE_CAPACITY_NAME = "engineCapacity";

    @Inject
    public GasEngine(@Named(HORSE_POWER_NAME) int horsePower,
                     @Named(ENGINE_CAPACITY_NAME) int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    public void start() {
        System.out.println("Gas Engine starting. Horse power: " + horsePower + " and engine capacity: " + engineCapacity);
    }
}
