package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Race.*;

public class Main {
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
                new Unit("Lambert", WITCHER)
        );
        List<Unit> vampires = new ArrayList<>();

        for (Unit unit : units) {
            if (VAMPIRE.equals(unit.race)) {
                vampires.add(unit);
            }
        }

        for (Unit unit : vampires) {
            System.out.println(unit);
        }

        List<Unit> vampireList = units.stream()
                .filter(unit -> VAMPIRE.equals(unit.race))
                .collect(Collectors.toList());
        vampireList.forEach(System.out::println);
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
