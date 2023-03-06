package factory.example_1._02_after;

public interface CoffeeFactory {
    default Coffee orderCoffee(String name, String temperature) {
        validate(name, temperature);
        prepareCoffee();
        Coffee coffee = makeCoffee();
        notificationCoffee();
        return coffee;
    }

    Coffee makeCoffee();

    private void validate(String name, String temperature) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("커피 종류를 선택하세요");
        }
        if (temperature == null || temperature.isBlank()) {
            throw new IllegalArgumentException("커피 온도를 선택하세요");
        }
    }

    private static void prepareCoffee() {
        System.out.println("커피 준비중...☕️");
    }

    private static void notificationCoffee() {
        System.out.println("커피가 준비되었어요...☕️");
    }
}
