import javafx.util.StringConverter;

public class NumberConverter  extends StringConverter<String> {

        private int from;
        private int to;

        public NumberConverter(int from, int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String toString(String s) {
            return Integer.toString(Integer.parseInt(s, to), from);
        }

        @Override
        public String fromString(String s) {
            return Integer.toString(Integer.parseInt(s, from), to);
        }


}
