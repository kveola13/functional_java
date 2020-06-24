package functionalinterface;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);
    }

    static int incrementByOne(int number) {
        return number + 1;
    }
}
