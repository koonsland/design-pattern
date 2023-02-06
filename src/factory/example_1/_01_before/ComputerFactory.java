package factory.example_1._01_before;

public class ComputerFactory {

    public static Computer makeComputer(String color, String cpu) {
        // validate
        if (cpu == null || cpu.isBlank()) {
            throw new IllegalArgumentException("CPU를 선택해 주세요");
        }
        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException("색상을 입력해 주세요");
        }

        System.out.println("컴퓨터를 만들 준비가 되었습니다.");

        // 컴퓨터 부품 생성
        Computer computer = new Computer();
        computer.setName("Mac book");


        if (color.equalsIgnoreCase("space gray")) {
            computer.setColor("Space Gray");
        } else {
            computer.setColor("silver");
        }

        if (cpu.equalsIgnoreCase("m2")) {
            computer.setCpu("M2");
        } else {
            computer.setCpu("M1");
        }

        System.out.println(computer.getName() + " 제작이 완료되어 배송합니다.");

        return computer;
    }
}
