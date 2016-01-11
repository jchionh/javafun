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

    /**
     * creates the various helpers by the type passed in
     * @param t the type class that is required
     * @param a first parameter
     * @param b second parameter
     * @return  a instanced helper to perform the operation
     */
    public static ArithmeticHelper createHelper(Class<? extends ArithmeticHelper> t, ArithmeticParam a, ArithmeticParam b) {

        // Addition helper
        if (t == AdditionHelper.class) {
            return new AdditionHelper(a, b);
        }

        // when we get here, we have an unhandled type, so just return null
        return null;
    }

}
