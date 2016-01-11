package net.jzapper;

import net.jzapper.Factory.PunchFactory;
import net.jzapper.Punches.ArithmeticHelp;
import net.jzapper.Punches.Basic;
import net.jzapper.Punches.Punch;

public class Main {
    /**
     * Generic punch doer
     *
     * @param punchType the type of punch to do
     * @param numPunches the number of punches of this type to create
     */
    public static void doPunch(Class<? extends Punch> punchType, int numPunches) {
        // now loop for punch to give
        for (int i = 0; i < numPunches; ++i) {
            Punch p = PunchFactory.createPunch(punchType, i);
            p.printId();
            p.punch();
        }
    }

    /**
     * main entry point of the java program
     * @param args
     */
    public static void main(String[] args) {
        doPunch(Basic.class, 1);
        doPunch(ArithmeticHelp.class, 1);
    }
}
