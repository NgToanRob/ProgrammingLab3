package run;

import core.actors.Astronomer;
import core.actors.Man;

public class Story {
    public static void main(String[] args) {
        try {
            Man man = new Man("Man");
            man.goHome();

            Astronomer astronomer = new Astronomer("Steklyashkin");
            man.meet(astronomer);

            System.out.println(astronomer.toString());
            astronomer.lookThroughBrokenBottles();
            astronomer.makeMagnifying();
            astronomer.lookThroughMagnifying();
            astronomer.makeTelescope();
            astronomer.lookThroughTelescope();
            astronomer.becomeAstronomer();
        } catch (Exception e) {
            System.out.println("debug plssss");
        }
    }
}
