public class mark extends npc {

    public mark(){
        super("Mark", "Orange Bedroom", true, false);
    }

    @Override
    public void interact(){
        System.out.println(name + ": I really didn't know much about him. I remember seeing him drinking tea in the common room though.");
    }
    
}
