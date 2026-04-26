public class letter extends item {

    public letter(String description, String roomName){
        super(description, roomName);
    }

    public void read(){
        System.out.println("You have opened the letter! Let's see what it says");
        System.out.println( "Letter: Beautiful views are the most deadly");
        System.out.println("Don't trust B.");
    }
}
