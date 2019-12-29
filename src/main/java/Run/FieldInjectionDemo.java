package Run;

/**
 * Run.Runner would not be acceptable as an arg into dagger.CarComponent in the static main method.
 * Created another class to demo the field injection.
 */
public class FieldInjectionDemo {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.demo();
    }
}
