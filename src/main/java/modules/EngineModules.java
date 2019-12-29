package modules;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import widgets.Engine;
import widgets.GasEngine;

@Module
public class EngineModules {
//    @Provides
//    public Engine provideModules() {
//        Engine engine = new GasEngine();
//        engine.start();
//        return engine;
//    }

    @Provides
    public Engine provideEngine(GasEngine engine) {
        engine.start();
        return engine;
    }
}
