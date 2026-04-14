package edu.kis.vh.nursery;

/**
 * A rhymer that rejects values greater than the last inserted one.
 * Counts how many elements were rejected.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int REJECTED = 0;
    private int totalRejected = REJECTED;
    /**
     * Returns the number of rejected elements.
     *
     * @return number of rejected values
     */
    public int reportRejected() {
        return totalRejected;
    }
    /**
     * Adds a value only if it does not violate the ordering rule.
     *
     * @param in value to be added
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
