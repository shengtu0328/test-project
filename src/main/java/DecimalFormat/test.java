package DecimalFormat;

import java.text.DecimalFormat;

public class test {

    public static void main(String[] args) {


        double f = 111231.5535;


        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(f));
    }
}
