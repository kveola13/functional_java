package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object object = Optional.ofNullable(null).orElseGet(() -> "default");
        System.out.println(object);
    }
}
