package net.jzapper.Model;

/**
 * User: jchionh
 * Date: 1/12/16
 * Time: 12:57 AM
 *
 * A helper to perform arithmetic functions.
 * This is a base abstract class
 *
 */
public abstract class ArithmeticHelper {

    // protected values that the helper will perform
    protected ArithmeticParam a;
    protected ArithmeticParam b;

    // ctor of the helper
    public ArithmeticHelper(ArithmeticParam a, ArithmeticParam b) {
        this.a = a;
        this.b = b;
    }

    /**
     * helpers override this to perform the correct operation
     * @return
     */
    protected abstract ArithmeticHelperResult doOperation();

    /**
     * returns the result of the two
     * @return
     */
    public ArithmeticHelperResult getResult() {
        return doOperation();
    }
}
