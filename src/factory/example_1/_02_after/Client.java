package factory.example_1._02_after;


public class Client {
    public static void main(String[] args) {
        print(makeCoffee(new AmericanoCoffeeFactory(), "Americano", "Hot"));
        print(makeCoffee(new EspressoCoffeeFactory(), "Espresso", "Hot"));
    }

    private static Coffee makeCoffee(CoffeeFactory factory, String name, String temperature) {
        return factory.orderCoffee(name, temperature);
    }

    private static void print(Coffee coffee) {
        System.out.println(String.format("고객님, 주문하신 %s %s 나왔습니다.", coffee.getTemperature(), coffee.getName()));
    }
}
