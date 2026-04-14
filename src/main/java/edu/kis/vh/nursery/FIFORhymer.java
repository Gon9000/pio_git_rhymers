package edu.kis.vh.nursery;
/**
 * A rhymer that behaves like a FIFO queue instead of a stack.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
    /**
     * Removes elements in FIFO order.
     *
     * @return first inserted value
     */
    @Override
    public int countOut() {
        while (!callCheck()){
            temp.countIn(super.countOut());
        }
        
        int ret = temp.countOut();
        
        while (!temp.callCheck()){
            countIn(temp.countOut());
        }
        
        return ret;
    }
}
