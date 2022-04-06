package model;

public class Foot {
    private int number;
    /** Creates a Foot with the specified number.
     * @param number The foot’s number.
     */
    public Foot(int number) {
        this.number = number;
    }
    /** Get the foot’s number.
     * @return A string representing the foot’s number
     */
    public int getNumber() {
        return number;
    }
    /** set the foot’s number.
     * @return A string representing the foot’s number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Foot{" +
                "number=" + number +
                '}';
    }
}
