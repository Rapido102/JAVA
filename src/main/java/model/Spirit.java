package model;

public class Spirit {
    private String id;
    private String name;

    /** Creates an Spirit with the specified id and name.
     * @param id The Spirit’s id.
     * @param name The Spirit’s name.
     */
    public Spirit(String id, String name) {
        this.id = id;
        this.name = name;
    }
    /** Gets the spirit’s id.
     * @return A string representing the spirit’s id
     */
    public String getId() {
        return id;
    }
    /** Set the spirit’s id.
     * @return A string representing the spirit’s id
     */
    public void setId(String id) {
        this.id = id;
    }
    /** Gets the spirit’s name.
     * @return A string representing the spirit’s name
     */
    public String getName() {
        return name;
    }
    /** Set the spirit’s name.
     * @return A string representing the spirit’s name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Spirit{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
