public class Mark extends NPC {

    public Mark(String name, int age, String currentRoom, boolean isSuspect, boolean isCulprit){
        super("Mark", 34, "Orange Bedroom", true, false);
    }

    @Override
    public String Interact(){
        return this.name + ": I really didn't know much about her. I remember seeing her drinking tea in the common room though.";
    }
    
    public
}
