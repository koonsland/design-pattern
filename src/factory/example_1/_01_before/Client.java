package factory.example_1._01_before;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = MakeCoffee.orderCoffee("Americano", "Hot");
        print(coffee);
        Coffee coffee1 = MakeCoffee.orderCoffee("Latte", "Cold");
        print(coffee1);
    }

    private static void print(Coffee coffee) {
        System.out.println(String.format("고객님, 주문하신 %s %s 나왔습니다.", coffee.getTemperature(), coffee.getName()));
    }
}
