package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        Integer incrementByFunction = incrementByOneFunction.apply(1);
        System.out.println(incrementByFunction);

        int multiply = multiplyByTen.apply(incrementByFunction);
        System.out.println(multiply);

        Integer addOneMultiplyByTen = incrementByOneFunction.andThen(multiplyByTen).apply(1);
        System.out.println(addOneMultiplyByTen);
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyByTen = number -> number * 10;

    static int incrementByOne(int number) {
        return number + 1;
    }
}