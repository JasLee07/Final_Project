public class Steph extends npc {
    
    public Steph(){
        super("Steph", "Kitchen", true, false);
    }

    @Override
    public void interact(){
        System.out.println(name + ": I hope the person that killed Brock doesn't get away.");
        System.out.println(name + ": When Brock invited us over, he said he was hosting a celebration because he was inheriting some generational wealth.");
        System.out.println(name + ": My guess is, whoever did this was jealous, and is trying to take the valuables from his house");
        System.out.println(name + ": Please, you have to solve this.");
    }
}
