package model;

import enums.HeadSizeEnum;

public class Head {
    private HeadSizeEnum size;
    /** Creates a Head with the specified size.
     * @param size The head’s size.
     */
    public Head(HeadSizeEnum size) {
        this.size = size;
    }
    /** Get the head’s size.
     * @return A string representing the head’s size
     */
    public HeadSizeEnum getSize() {
        return size;
    }
    /** Set the head’s size.
     * @return A string representing the head’s size
     */
    public void setSize(HeadSizeEnum size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Head{" +
                "size=" + size +
                '}';
    }
}
