package net.jzapper.Model;

/**
 * User: jchionh
 * Date: 1/12/16
 * Time: 12:59 AM
 *
 * This is a param that is taken by the helper to compute the operation
 *
 */
public class ArithmeticParam {
    private int value;

    // ctor
    public ArithmeticParam(int value) {
        this.value = value;
    }

    /**
     * gets value stored in our member
     * @return
     */
    public int getValue() {
        return value;
    }
}
