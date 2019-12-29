package dagger.modules;

import dagger.Binds;
import dagger.Module;
import widgets.DieselEngine;
import widgets.Engine;
import widgets.GasEngine;

/**
 * Inject interface: need to have the method and class abstract.
 *
 * Once a class is abstract, methods inside can only be either abstract method for @Binds,
 * or static @Provides methods
 *
 */
@Module
public abstract class EngineModules {
//    @Provides
//    public Engine provideEngine() {
//        Engine engine = new GasEngine();
//        engine.start();
//        return engine;
//    }

//    @Provides
//    public Engine provideEngine(GasEngine engine) {
//        engine.start();
//        return engine;
//    }

    /**
     * Using @Binds is more clear. However, it only accepts one param that is assignable to the return type.
     * Besides, it's not easy to do preparation work (e.g: engine.start()) like what we did in the @Provides method above
     *
     */
    @Binds
    public abstract Engine bindEngine(DieselEngine engine);
}
