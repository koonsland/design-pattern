package factory.example_1._01_before;

public class MakeCoffee {
    public static Coffee orderCoffee(String name, String temperature) {
        // validate
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("커피 종류를 선택하세요");
        }
        if (temperature == null || temperature.isBlank()) {
            throw new IllegalArgumentException("커피 온도를 선택하세요");
        }

        prepareCoffee();

        // make coffee
        Coffee coffee = new Coffee();
        coffee.setName(name);
        coffee.setTemperature(temperature);

        // notify
        notificationCoffee();

        return coffee;
    }

    private static void notificationCoffee() {
        System.out.println("커피가 준비되었어요...☕️");
    }

    private static void prepareCoffee() {
        System.out.println("커피 준비중...☕️");
    }
}
