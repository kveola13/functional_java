package imperative;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Unit> units = List.of(

        );
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
