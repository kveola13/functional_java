package streams;


import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Race.*;

public class _Stream {
    public static void main(String[] args) {
        List<Unit> units = List.of(
                new Unit("Geralt", WITCHER),
                new Unit("Iorveth", ELF),
                new Unit("Zoltan", DWARF),
                new Unit("Regis", VAMPIRE),
                new Unit("Shupe", OGROID),
                new Unit("Dettlaff", VAMPIRE),
                new Unit("Orianna", VAMPIRE),
                new Unit("Vernossiel", ELF),
                new Unit("Lambert", WITCHER),
                new Unit("Ardal", HUMAN)
        );

        Consumer<Race> printRaces = System.out::println;
        units.stream().map(unit -> unit.race).collect(Collectors.toSet()).forEach(printRaces);

        units.stream().map(unit -> unit.name).mapToInt(String::length).forEach(System.out::println);

        Function<Unit, String> unitStringFunction = unit -> unit.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;

        units.stream().map(unitStringFunction).mapToInt(length).forEach(println);

    }

    static class Unit {
        private final String name;
        private final Race race;

        Unit(String name, Race race) {
            this.name = name;
            this.race = race;
        }

        @Override
        public String toString() {
            return "Unit{" +
                    "name='" + name + '\'' +
                    ", race=" + race +
                    '}';
        }
    }

    enum Race {
        ELF, DWARF, HUMAN, VAMPIRE, WITCHER, OGROID, INSECTOID
    }
}
