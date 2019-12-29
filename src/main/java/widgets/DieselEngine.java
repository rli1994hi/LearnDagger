package widgets;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    private int horsePower;

    // Here, we do not annotate @Inject as horsePower will be a run time param. Dagger doesn't know how to
    // generate it during compile time.
    // We construct a param, and delegate the construct work to the module.
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    public void start() {
        System.out.println("Diesel Engine starting. The horse power is: " + horsePower);
    }
}
