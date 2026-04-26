public class Victim extends npc{

    public Victim(){
        super("Brock", "Purple Bedroom", false, false);
    }

    @Override
    public void interact(){
        System.out.println("...");
        System.out.println("He's...gone");
    }
    
    public static void main(String[] args) {
        Victim brock = new Victim();
        brock.interact();
    
    }
}
