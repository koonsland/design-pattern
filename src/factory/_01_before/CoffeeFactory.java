package factory._01_before;

public class CoffeeFactory {
    public static Coffee orderCoffee(String nickname, int shot, CoffeeSize size, Temperature temperature) {
        // validate parameter
        if (nickname == null || nickname.isBlank()) {
            throw new IllegalArgumentException("주문자를 입력하세요");
        }
        if (shot < 1 || shot > 3) {
            throw new IllegalArgumentException("샷은 1~3까지 선택 가능해요");
        }

        // 주문 완료
        successOrder(shot, size, temperature);

        // 커피 만드는 중
        makingCoffee(shot, size, temperature);

        Coffee coffee = new Coffee();
        coffee.setName("아메리카노");
        coffee.setShot(1);
        coffee.setSize(size);
        coffee.setTemperature(temperature);

        // 제조 완료
        successMaking(shot, size, temperature);

        return coffee;
    }

    private static void successOrder(int shot, CoffeeSize size, Temperature temperature) {
        System.out.println(String.format("☕️ 커피 주문 완료.. %d, %s, %s", shot, size, temperature));
    }

    private static void makingCoffee(int shot, CoffeeSize size, Temperature temperature) {
        System.out.println(String.format("☕️ 커피 제조중.. %d, %s, %s", shot, size, temperature));
    }

    private static void successMaking(int shot, CoffeeSize size, Temperature temperature) {
        System.out.println(String.format("☕️ 커피 제조 완료.. %d, %s, %s", shot, size, temperature));
    }
}
