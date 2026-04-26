public class npc extends Character{
    public boolean isSuspect;
    public boolean isCulprit;

    public npc(String name, String currentRoom, boolean isSuspect, boolean isCulprit){
        super(name, currentRoom);
        this.isSuspect = isSuspect;
        this.isCulprit = isCulprit;
    }

    public void interact(){
        System.out.println(this.name + ": Hey! How are ya?");
    }

    public static void main(String[] args) {
        // NPC Jim = new NPC("Jim", 32, "Bedroom 2", true, false);
        Mark mark = new Mark();
        System.out.println("There's someone over there, maybe I should go talk to them");
        // System.out.println(Jim.interact());
    }
}
