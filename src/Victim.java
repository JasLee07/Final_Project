public class victim extends npc{

    public victim(){
        super("Brock", "Purple Bedroom", false, false);
    }

    @Override
    public void interact(){
        System.out.println("...");
        System.out.println("He's...gone");
    }
    
    public static void main(String[] args) {
        victim brock = new victim();
        brock.interact();
    
    }
}
