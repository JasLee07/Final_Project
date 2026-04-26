public class letter extends item {

    public letter(String description){
        super(description);
    }

    public void read(){
        System.out.println("You have opened the letter! Let's see what it says");
        System.out.println( "Letter: Beautiful views are the most deadly");
        System.out.println("Don't trust B.");
    }
    

    public static void main(String[] args) {
        letter greenLetter = new letter("Green Envelope");
        greenLetter.pickUp();
        greenLetter.read();
        System.out.println("Spooky...");
    }
}
