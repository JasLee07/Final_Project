public class flashlight extends item {
    
    public boolean isLit;

    public flashlight(String description, String roomName, boolean isLit){
        super(description, roomName);
        this.isLit = isLit;
    }

    public boolean turnOn(){
        System.out.println("Gotta turn this light on...");
        this.isLit = true;
        System.out.println("Got it! I can see now.");
        return this.isLit;
    }

    public boolean turnOff(){
        System.out.println("I should turn the light off to save battery.");
        this.isLit = false;
        System.out.println("There we go!");
        return this.isLit;
    }

    /* Eventually, we will want to add an option to add the flashlight to inventory
    public void AddtoInventory(){
    System.out.println("I should take this with me")
    }
    
    */
}
