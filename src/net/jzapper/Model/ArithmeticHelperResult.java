package net.jzapper.Model;

/**
 * User: jchionh
 * Date: 1/12/16
 * Time: 1:05 AM
 *
 * this is the value that is return from a arithemitic helper
 */
public class ArithmeticHelperResult {
    private int value;

    // ctor
    public ArithmeticHelperResult(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
