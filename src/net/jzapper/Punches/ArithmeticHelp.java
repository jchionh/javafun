package net.jzapper.Punches;

import net.jzapper.Factory.ArithmeticHelperFactory;
import net.jzapper.Model.AdditionHelper;
import net.jzapper.Model.ArithmeticHelperResult;
import net.jzapper.Model.ArithmeticParam;

/**
 * User: jchionh
 * Date: 1/12/16
 * Time: 1:10 AM
 */
public class ArithmeticHelp extends Punch {
    private static final String TAG = ArithmeticHelp.class.getSimpleName();

    public ArithmeticHelp(int id) {
        super(id);
    }

    @Override
    public void punch() {
        // do the punchline
        // how many levels of indirection do you use in Java to do a simple thing?

        // do 1 + 1
        ArithmeticHelperResult result = ArithmeticHelperFactory.createHelper(
                                                AdditionHelper.class,
                                                new ArithmeticParam(1),
                                                new ArithmeticParam(1)
                                        ).getResult();
        System.out.println("1 + 1 = " + result.getValue());
    }

    @Override
    protected String getTag() {
        return TAG;
    }
}
