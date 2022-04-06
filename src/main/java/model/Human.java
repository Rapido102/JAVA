package model;

import enums.BodyTypeEnum;
import enums.HeadSizeEnum;
import enums.HumanTypeEnum;

public class Human extends Spirit {
    private HumanTypeEnum type;
    private BodyTypeEnum body;
    private int arms;
    private int foots;
    private HeadSizeEnum head;
    /** Creates a Human with the specified id, name and type.
     * @param id The Spirit’s id.
     * @param name The Spirit’s name.
     * @param type The Spirit’s name.
     */
    public Human(String id, String name, HumanTypeEnum type) {
        super(id, name);
        this.type = type;
    }
    /** Gets the Human’s foots.
     * @return A string representing the Human’s foots
     */
    public int getFoots() {
        return foots;
    }
    /** Set the human’s foot.
     * @return A string representing the human’s foot
     */
    public void setFoots(int foots) {
        this.foots = foots;
    }
    /** Gets the Human’s head.
     * @return A string representing the Human’s head
     */
    public HeadSizeEnum getHead() {
        return head;
    }
    /** Set the human’s head.
     * @return A string representing the human’s head
     */
    public void setHead(HeadSizeEnum head) {
        this.head = head;
    }
    /** Gets the Human’s body.
     * @return A string representing the Human’s body
     */
    public BodyTypeEnum getBody() {
        return body;
    }
    /** Set the human’s body.
     * @return A string representing the human’s body
     */
    public void setBody(BodyTypeEnum body) {
        this.body = body;
    }
    /** Gets the Human’s arm.
     * @return A string representing the Human’s arm
     */
    public int getArms() {
        return arms;
    }
    /** Set the human’s arm.
     * @return A string representing the human’s arm
     */
    public void setArms(int arms) {
        this.arms = arms;
    }
    /** Gets the Human’s type.
     * @return A string representing the Human’s type
     */
    public HumanTypeEnum getType() {
        return type;
    }
    /** Set the human’s type.
     * @return A string representing the human’s type
     */
    public void setType(HumanTypeEnum type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Human{" +
                "type=" + type +
                ", body=" + body +
                ", arms=" + arms +
                ", foots=" + foots +
                ", head=" + head +
                '}';
    }
}

