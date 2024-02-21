package Abstruction;

public class Main {
    public static void main(String[] args) {
        Car car;
        car = new Suzuki();
        car.getCarDetails();
        car.more();
        car = new Toyota();
        car.getCarDetails();
    }
}
