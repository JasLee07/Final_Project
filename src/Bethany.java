public class Bethany extends npc {
    
    public Bethany(){
        super("Bethany", "Entry Hall", true, false);
    }

    @Override
    public void interact(){
        System.out.println(name + ": I'm so glad you've come. Please, take a look around the house. Everyone is here and willing to cooperate.");
    }
}
