package factory.example_1._02_after;

public class AmericanoCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee makeCoffee() {
        return new AmericanoCoffee();
    }
}
