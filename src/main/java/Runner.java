public class Runner {
    public static void main(String[] args) {
        CarComponent carComponent = DaggerCarComponent.create();
        Car car = carComponent.getCar();
        car.dirve();
    }
}
