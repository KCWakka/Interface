import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder(5);
        Rectangle rect = new Rectangle(5, 8);
        Vehicle vehicle = new Vehicle("mercedes", 4);
        Vehicle vehicle1 = new Vehicle("taxi", 4);
        Vehicle vehicle2 = new Vehicle("bus", 4);
        Vehicle vehicle3 = new Vehicle("spotcar", 4);
        ArrayList<Vehicle> list2 = new ArrayList<>();
        list2.add(vehicle);
        list2.add(vehicle1);
        list2.add(vehicle2);
        list2.add(vehicle3);
        for (Vehicle vehicle4 : list2) {
            System.out.println(vehicle4);
        }
        Collections.sort(list2);
        for (Vehicle vehicle4 : list2) {
            System.out.println(vehicle4);
        }
        ArrayList<Math> list = new ArrayList<>();
        list.add(adder);
        list.add(rect);
        list.add(vehicle);
        for (Math math : list) {
            System.out.println(math.someMath());
            System.out.println(math.isMath(4));
            math.addMath();
            System.out.println(math.someMath());
        }
    }
}