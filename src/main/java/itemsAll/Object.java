package itemsAll;




public abstract class Object {

    private String name;
    private String colour;
    private String type;

    public Object(String name, String colour, String type) {
        this.name = name;
        this.colour = colour;
        this.type = type;
    }


    public String getName() { return name; }

}
