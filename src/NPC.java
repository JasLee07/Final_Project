public class npc extends character{
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
}