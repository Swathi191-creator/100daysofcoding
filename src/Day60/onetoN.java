package Day60;

public class onetoN {
        public String transform(String s)
        {
            StringBuilder result = new StringBuilder();
            boolean capitalizeNext = true;

            for (char c : s.toCharArray()) {
                if (Character.isWhitespace(c)) {
                    capitalizeNext = true;
                    result.append(c);
                } else if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(c);
                }
            }

            return result.toString();
        }

}
