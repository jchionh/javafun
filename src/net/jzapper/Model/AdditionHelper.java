package net.jzapper.Model;

/**
 * User: jchionh
 * Date: 1/12/16
 * Time: 1:04 AM
 *
 * Addition Helper returns the result
 */
public class AdditionHelper extends ArithmeticHelper {

    // ctor
    public AdditionHelper(ArithmeticParam a, ArithmeticParam b) {
        super(a, b);
    }

    /**
     * add the 2 params together and return the result.
     * @return
     */
    @Override
    protected ArithmeticHelperResult doOperation() {
        return new ArithmeticHelperResult(a.getValue() + b.getValue());
    }
}
