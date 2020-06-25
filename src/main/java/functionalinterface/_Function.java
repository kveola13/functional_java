package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        Integer incrementByFunction = incrementByOneFunction.apply(1);
        System.out.println(incrementByFunction);
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static int incrementByOne(int number) {
        return number + 1;
    }
}
