package model;

import enums.BodyTypeEnum;

public class Body {
    private BodyTypeEnum type;
    /** Creates a new body.
     */
    public Body() {
    }
    /** Get the body’s type.
     * @return A string representing the body’s type
     */
    public BodyTypeEnum getType() {
        return type;
    }
    /** Set the body’s type.
     * @return A string representing the body’s type
     */
    public void setType(BodyTypeEnum type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Body{" +
                "type=" + type +
                '}';
    }
}
