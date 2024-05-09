import java.util.Collection;
import java.util.Objects;
public class Vehicle implements Math, Comparable<Vehicle> {
    private String name;
    private int wheels;

    public Vehicle(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public void turn() {
        System.out.println("I just turned");
    }

    public void brake() {
        System.out.println("I just braked");
    }
    public String toString() {
        return "Name: " + name + ", Wheels: " + wheels;
    }
    //interface methods
    public int someMath() {
        return wheels + name.length();
    }
    public void addMath() {
        for (int i = 0; i < wheels; i++) {
            name = name + name;
        }
    }
    public boolean isMath(int value) {
        return wheels % value == 0;
    }
    public int compareTo(Vehicle other) {
        return name.compareTo(other.name);
    }
}
