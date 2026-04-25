public class Bethany extends NPC {
    
    public Bethany(){
        super("Layota", 25, "Orange Bedroom", true, false);
    }

    @Override
    public void interact(){
        System.out.println(name + ": I'm so glad you've come. Please, take a look around the house. Everyone is here and willing to cooperate.");
    }
}
