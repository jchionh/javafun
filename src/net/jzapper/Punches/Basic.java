package net.jzapper.Punches;

/**
 * User: jchionh
 * Date: 1/12/16
 * Time: 12:45 AM
 *
 * initial basic first punch
 */
public class Basic extends Punch {
    private static final String TAG = Basic.class.getSimpleName();

    // ctor
    public Basic(int id) {
        super(id);
    }

    @Override
    public void punch() {
        System.out.println("One Punch OK!!");
    }

    @Override
    protected String getTag() {
        return TAG;
    }
}
