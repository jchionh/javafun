package net.jzapper.Factory;

import net.jzapper.Model.AdditionHelper;
import net.jzapper.Model.ArithmeticHelper;
import net.jzapper.Model.ArithmeticParam;

/**
 * User: jchionh
 * Date: 1/12/16
 * Time: 12:32 AM
 *
 * Arithmetic helper factory creating arithmetic helpers
 *
 */
public class ArithmeticHelperFactory {
    public static ArithmeticHelper createHelper(Class<? extends ArithmeticHelper> t, ArithmeticParam a, ArithmeticParam b) {

        if (t == AdditionHelper.class) {
            return new AdditionHelper(a, b);
        }
        return null;
    }

}
