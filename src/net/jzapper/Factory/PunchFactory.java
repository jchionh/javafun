package net.jzapper.Factory;

import net.jzapper.Punches.ArithmeticHelp;
import net.jzapper.Punches.Basic;
import net.jzapper.Punches.Punch;

/**
 * User: jchionh
 * Date: 1/12/16
 * Time: 12:43 AM
 *
 * punch factory instantiates a given type of punch
 *
 */
public class PunchFactory {

    public static Punch createPunch(Class<? extends Punch> t, int id) {
        if (t == Basic.class) {
            return new Basic(id);
        }
        if (t == ArithmeticHelp.class) {
            return new ArithmeticHelp(id);
        }
        return null;
    }
}
