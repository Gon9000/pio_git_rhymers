package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ARRAY_SIZE = 12;
    public static final int EMPTY_CODE = -1;

    final private int[] NUMBERS = new int[ARRAY_SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
        }

    public boolean callCheck() {
        return total == EMPTY_CODE;
    }
        
    public boolean isFull() {
        return total == (ARRAY_SIZE - 1);
    }
        
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_CODE;
        return NUMBERS[total];
    }
            
    public int countOut() {
        if (callCheck())
            return EMPTY_CODE;
        return NUMBERS[total--];
    }
}
