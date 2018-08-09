package shipeiqimoshi;

import java.awt.*;

public class adapter extends dog implements  robotdog{


    @Override
    public void robotgiao() {

        System.out.print("robot ");

        doggiao();

    }


    public static void main(String[] args) {
        robotdog r= new adapter();
        r.robotgiao();
    }
}
