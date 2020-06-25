package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);
    }

    Function<Integer, Integer> incrementByOneFunction = number -> number++;

    static int incrementByOne(int number) {
        return number + 1;
    }
}
