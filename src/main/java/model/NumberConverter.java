package model;

import javafx.util.StringConverter;
import org.tinylog.Logger;


/**
 * A konvertálást megvalósító osztály.
 */
public class NumberConverter extends StringConverter<String> {
        /**
         * {@code from, to} Privát osztályváltozók, a konvertáláshoz használjuk
         * (miből, mibe)
         */
        private int from;
        private int to;
        /**
         * {@code NumberConverter} Az osztály konstruktora.
         */

        public NumberConverter(int from, int to) {
            this.from = from;
            this.to = to;
            Logger.info("Meghívódik a konvertáló konstruktora.");
        }
        /**
         * {@code toString, fromString} Az osztálymetódusok, amik egy
         * String értékkel térnek vissza, a metódus törzsén legbelül egy int
         * típussá történő konvertálás, amjd azon kívűl egy String típussá történő
         * alakítás látszódik.
         */

        @Override
        public String toString(String s) {
            return Integer.toString(Integer.parseInt(s, to), from);
        }

        @Override
        public String fromString(String s) {
            return Integer.toString(Integer.parseInt(s, from), to);
        }


}
