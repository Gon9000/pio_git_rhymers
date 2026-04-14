package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private  static final int ARRAY_SIZE = 12;
    private static final int EMPTY_INDEX = -1;
    private static final int NO_VALUE = -1;
    private static final int LAST_INDEX = ARRAY_SIZE - 1;

    private final int[] NUMBERS = new int[ARRAY_SIZE];

    private  int total = EMPTY_INDEX;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == LAST_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return NO_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return NO_VALUE;
        return NUMBERS[total--];
    }
}
