package pattern;

import java.util.regex.Pattern;

public class number {

    public boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]+");
        return pattern.matcher(str).matches();
    }


    public static void main(String[] args) {

        number n=new number();
        System.out.println(n.isNumeric(""));
    }
}
