package modules;

import dagger.Module;
import dagger.Provides;
import widgets.Rims;
import widgets.Tires;
import widgets.Wheel;

/**
 * Modules are classes that contribute to the object graph. (Generate objects)
 *
 * Module won't be used as an instance by Dagger, so we can mark methods inside as static to improve (a bit) performance
 * IF methods do not depend on instance variable of the module
 */
@Module
public class CarModule {

    @Provides
    Rims provideRims() {
        return new Rims();
    }

    @Provides
    Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    /**
     * 1. Rims and Tires here will be generated from this module by dagger. That being said,
     * rims and tires will be prepared. (Tires will be inflated as in provideTires method)
     *
     * 2. No @Inject annotation is needed in this method
     *
     * @  param rims
     * @param tires
     * @return
     */
    @Provides
    Wheel provideWheels(Rims rims, Tires tires) {
        Wheel wheel = new Wheel(rims, tires);
        wheel.prepare();
        return wheel;
    }
}
