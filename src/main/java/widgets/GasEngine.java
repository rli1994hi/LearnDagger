package widgets;

import javax.inject.Inject;

public class GasEngine implements Engine {

    @Inject
    public GasEngine() {

    }

    public void start() {
        System.out.println("Gas Engine starting");
    }
}
