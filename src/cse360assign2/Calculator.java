package cse360assign3;

/**
 * Anish Katukam, 434, Assignment #2
 * <p>
 * The Calculator class provides a set of methods which allow for arithmetic
 * manipulation of an instance dependant integer "total", which
 * aforementioned methods can add, subtract, multiply, or divide by a
 * parametrized value. There is also a method that gives the history of
 * operations performed on "total".
 */
public class Calculator {

    private int total;

    /**
     * Class constructor. int Total is initialized to the default value of 0
     * and is the value that all future operations can change.
     */
    public Calculator() {
        total = 0;  // not needed - included for clarity
    }

    /**
     * getTotal will return the current value of "total".
     *
     * @return the current value of "total"
     */
    public int getTotal() {
        return 0;
    }

    /**
     * Adds the parameter to "total".
     *
     * @param value the value to be added to "total"
     */
    public void add(int value) {

    }

    /**
     * Subtracts the parameter from "total".
     *
     * @param value the value to be subtracted from "total"
     */
    public void subtract(int value) {

    }

    /**
     * Multiplies "total" by the parameter.
     *
     * @param value the value to multiply "total" by
     */
    public void multiply(int value) {

    }

    /**
     * Divides "total" by the parameter. If the parameter is 0, then "total"
     * will be set to 0. There is no decimal precision, this method uses
     * integer division.
     *
     * @param value the value to divide "total" by
     */
    public void divide(int value) {

    }

    /**
     * Returns a string containing all operations done to "total" in the
     * format "0 + 3 - 1 * 2".
     *
     * @return a string encoding all operations done to "total"
     */
    public String getHistory() {
        return "";
    }
}