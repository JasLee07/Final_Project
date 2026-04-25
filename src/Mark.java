public class Mark extends NPC {

    public Mark(){
        super("Mark", 34, "Orange Bedroom", true, false);
    }

    @Override
    public void interact(){
        System.out.println(name + "I really didn't know much about him. I remember seeing him drinking tea in the common room though.");
    }
    
}
