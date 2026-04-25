public class Brian extends NPC {

    public Brian(){
        super("Brian", "Common Space", false, true);
    }
    
    @Override
    public void interact(){
        System.out.println(name + ": I didn't know much about Brock other than when he was bragging, but I did see someone with a flashlight in the middle of the night.");
    }
}
