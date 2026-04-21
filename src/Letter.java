public class Letter extends Item {

    public Letter(String description){
        super(description);
    }

    public String read(){
        System.out.println("You have opened the letter! Let's see what it says");
        return "Beautiful views are the most deadly";
    }
    

    public static void main(String[] args) {
        Letter greenLetter = new Letter("Green Envelope");
        greenLetter.read();
        System.out.println("Spooky...");
    }
}
