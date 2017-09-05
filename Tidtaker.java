package Oving2_sortering;

// package Øvinger.Øving1_Kompleksitet;

import java.util.Date;

public class Tidtaker {
    public static double getTid(Command metode){
        Date start = new Date();
        int runder = 0;
        double tid;
        Date slutt;
        do {
            metode.call();
            slutt = new Date();
            ++runder;
        } while (slutt.getTime()-start.getTime() < 1000);
        tid = (double)
                (slutt.getTime()-start.getTime()) / runder;
        return tid*1000;
    }
}
