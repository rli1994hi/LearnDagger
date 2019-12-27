package widgets;

import javax.inject.Inject;

/**
 * Pretend we do not own this class. @Inject would not be available for the constructor
 */
public class Wheel {
    private Rims rims;
    private Tires tires;

//    @Inject
    public Wheel(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }

    public void prepare() {
        System.out.println("Preparing wheels...");
    }
}
