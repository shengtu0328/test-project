package regux;

import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {

        String s = "a%".replace("%", "[\\s\\S]+");
        Pattern p = Pattern.compile(s);
        if (p.matcher("a1").matches()) {
            System.out.println("true");

        }
    }
}
