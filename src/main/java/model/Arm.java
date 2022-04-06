package model;

public class Arm {
    private int number;
    /** Creates an Arm with the specified number.
     * @param number The arm’s number.
     */
    public Arm(int number) {
        this.number = number;
    }
    /** Get the Arm’s number.
     * @return A string representing the Arm’s number
     */
    public int getNumber() {
        return number;
    }
    /** Set the Arm’s number.
     * @return A string representing the Arm’s number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Arms{" +
                "number=" + number +
                '}';
    }
}
