package factory.example_1._01_before;

public class Computer {
    private String name;
    private String color;
    private String cpu;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
