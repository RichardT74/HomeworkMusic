package itemsAll;

import objectbehaviours.IPlay;
import objectbehaviours.ISell;

public class Violin extends Object implements IPlay, ISell {
    private String sound;
    private int cost;

    public Violin(String name, String colour, String type, String sound, int cost) {
        super(name, colour, type);
        this.sound = sound;
        this.cost = cost;
    }
    public String getSound() {return sound;}

    public double getMarkUp()
}




//    public double defaultPrice() {
//        return 2.80;
//    }