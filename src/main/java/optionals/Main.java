package optionals;


import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable(null).ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                () -> {
                    System.out.println("Can't send email to the Baba Yaega");
                });
        Optional<Object> empty = Optional.of("Hello");
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());
    }
}
