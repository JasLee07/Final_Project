public class Mark extends NPC {

    public Mark(){
        super("Mark", 34, "Orange Bedroom", true, false);
    }

    @Override
    public String interact(){
        return name + ": I really didn't know much about her. I remember seeing her drinking tea in the common room though.";
    }
    
}
