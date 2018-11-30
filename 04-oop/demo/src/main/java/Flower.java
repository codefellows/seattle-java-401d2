public class Flower {
    // class variables
    // Flower.types
    public static String[] types = new String[]{"rose", "tulip", "sunflower", "daisy", "pansy"};

    // instance variables
    // ourRose.color
    public String type;
    public String color;
    public int petals;
    public boolean blooming;
    public boolean alive;

    // constructor
    public Flower(String type, String color, int petals, boolean blooming, boolean alive) {
        this.type = type;
        this.color = color;
        this.petals = petals;
        this.blooming = blooming;
        this.alive = alive;
    }

    public Flower() {
        
    }
    // class methods (we don't have any for this class)

    // Flower.isGoodHabitat("greenhouse") => true
    // Flower.isGoodHabitat("desert") => false

    // instance methods
    // Make a flower blooming
    public void bloom() {
        this.blooming = true;
    }

    // ourRose.bloom();
}
