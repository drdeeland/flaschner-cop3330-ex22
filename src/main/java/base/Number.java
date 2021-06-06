/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

public class Number {
    private final String ordinal;
    private int num;

    public Number(String ordinal) {
        this.ordinal = ordinal;
    }

    public void setNumber(int num) {
        this.num = num;
    }

    public int getNumber() {
        return num;
    }

    public String getOrdinal() {
        return ordinal;
    }
}
