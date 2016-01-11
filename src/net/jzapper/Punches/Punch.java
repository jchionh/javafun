package net.jzapper.Punches;

/**
 * User: jchionh
 * Date: 1/12/16
 * Time: 12:37 AM
 *
 * One Punch is a unit of fun. Just like a puncline.
 */
public abstract class Punch {

    private static final String TAG = Punch.class.getSimpleName();

    // every case has a id
    protected int id = -1;

    // ctor
    public Punch(int id) {
        this.id = id;
    }

    public abstract void punch();

    // return the class's tag/
    protected abstract String getTag();

    public void printId() {
        System.out.println(TAG + ":" + getTag() + " #" + id);
    }
}
