package optionals;


import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable(null).ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                () -> {
                    System.out.println("Can't send email to the Baba Yaega");
                });
        Optional<String> empty = Optional.ofNullable("Hello");
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());
        String orElse = empty.orElse("World");
        System.out.println(orElse);

        empty.ifPresentOrElse(System.out::println, () -> System.out.println("World"));

        Person person = new Person("John", "john@wick.com");
        System.out.println(person.getEmail().toLowerCase());

    }

    static class Person {
        private final String name;
        private final String email;

        public Person(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }
    }
}
