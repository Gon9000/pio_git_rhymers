package edu.kis.vh.nursery;

/**
 * Class representing a simple stack-based counting-out rhymer.
 * It stores integers in LIFO (Last-In-First-Out) order.
 *
 * The class allows adding elements, checking if the structure is empty or full,
 * and retrieving elements from the top.
 */
public class DefaultCountingOutRhymer {

    private  static final int ARRAY_SIZE = 12;
    private static final int EMPTY_INDEX = -1;
    private static final int NO_VALUE = -1;
    private static final int LAST_INDEX = ARRAY_SIZE - 1;

    private final int[] NUMBERS = new int[ARRAY_SIZE];

    private  int total = EMPTY_INDEX;
    /**
     * Adds a number to the rhymer if it is not full.
     *
     * @param in value to be added
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }
    /**
     * Checks whether the rhymer is empty.
     *
     * @return true if empty, false otherwise
     */
    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }
    /**
     * Checks whether the rhymer is full.
     *
     * @return true if full, false otherwise
     */
    public boolean isFull() {
        return total == LAST_INDEX;
    }

    /**
     * Returns the top element without removing it.
     *
     * @return top value or NO_VALUE if empty
     */
    protected int peekaboo() {
        if (callCheck())
            return NO_VALUE;
        return NUMBERS[total];
    }
    /**
     * Removes and returns the top element.
     *
     * @return removed value or NO_VALUE if empty
     */
    public int countOut() {
        if (callCheck())
            return NO_VALUE;
        return NUMBERS[total--];
    }
}
