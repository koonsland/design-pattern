package factory.example_1._01_before;

public class ComputerClient {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.makeComputer("silver", "m2");
        System.out.println(computer);
    }
}
