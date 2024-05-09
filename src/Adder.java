public class Adder implements Math {
    private int num;

    public Adder(int n) {
        num = n;
    }

    public void add(int n) {
        num += n;
    }

    public void printInfo() {
        System.out.println("Num: " + num);
    }
    //interface methods
    public int someMath() {
        return num + num;
    }
    public void addMath() {
        num *= (num % 3);
    }
    public boolean isMath(int value) {
        return num % value == 0;
    }
}
