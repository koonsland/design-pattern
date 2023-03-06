package factory.example_1._02_after;

public class EspressoCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee makeCoffee() {
        return new EspressoCoffee();
    }
}
