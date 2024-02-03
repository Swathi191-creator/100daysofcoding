package Day34;

public class strings {
    public String defangIPaddr(String address) {
        //    return address.replace(".","[.]");

        StringBuilder defanged = new StringBuilder();

        for (char c : address.toCharArray()) {
            if (c == '.') {
                defanged.append("[.]");
            } else {
                defanged.append(c);
            }
        }

        return defanged.toString();
    }
}
