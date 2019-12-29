package dagger;

import Run.Runner;
import dagger.modules.CarModule;
import dagger.modules.GasEngineModule;
import widgets.Car;

/* Remember to add EngineModules here */
@Component(modules = {GasEngineModule.class, CarModule.class})
public interface CarComponent {

    Car getCar();

    void inject(Runner runner);

    /**
     * In order not to pass the run time args into module, we pass it into the builder itself
     * To do so, we need to have our own builder.
     *
     * 1. Create an interface inside CarComponent, annotate it with @Component.Builder
     */
    @Component.Builder
    interface Builder {
        /**
         * 2. Have a method annotated with @BindsInstance.
         *    It accepts a param. Dagger will bind a instance that requires this type. - If there's more than one
         *    instance require this type of param
         * Ref:
         * https://dagger.dev/users-guide.html#binding-instances
         * https://dagger.dev/api/2.10/dagger/BindsInstance.html
         */
        @BindsInstance
        Builder horsePower(int horsePower);

        /**
         * 3. Builder always needs a build to return the object it builds.
         */
        CarComponent build();

        /**
         * Once finish steps above, go to the method that uses this component and pass integer to the builder.
         */
    }
}
