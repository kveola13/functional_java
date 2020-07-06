package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object object = Optional.ofNullable("Hello").orElseThrow(() -> new IllegalStateException("No can do"));
        System.out.println(object);
    }
}
