package widgets;

import javax.inject.Inject;

public class GasEngine implements Engine {

    private int horsePower;

    @Inject
    public GasEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    public void start() {
        System.out.println("Gas Engine starting. Horse power: " + horsePower);
    }
}
