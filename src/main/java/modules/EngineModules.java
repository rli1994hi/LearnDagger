package modules;

import dagger.Module;
import dagger.Provides;
import widgets.Engine;
import widgets.GasEngine;

@Module
public class EngineModules {
    @Provides
    public Engine provideModules() {
        Engine engine = new GasEngine();
        engine.start();
        return engine;
    }
}
