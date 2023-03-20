package factory._01_before;

public class Client {
    public static void main(String[] args) {
        String nickname = "유저A";

        Coffee coffee = CoffeeFactory.orderCoffee(nickname, 1, CoffeeSize.TALL, Temperature.ICED);

        print(nickname, coffee);
    }

    public static void print(String nickname, Coffee coffee) {
        System.out.println(String.format("%s 님. 주문하신 %s 사이즈 아메리카노 나왔습니다.", nickname, coffee.getSize()));
    }
}
