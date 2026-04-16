public class flashlight extends Item {
    
    public boolean isLit;

    public flashlight(String description, boolean isLit){
        super(description);
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

    public static void main(String[] args) {
        flashlight myFlashlight = new flashlight("Green flashlight", false);
        System.out.println("Hm, it's hard to see. Let's use the flashlight nearby");
        myFlashlight.pickUp();
        myFlashlight.turnOn();
        System.out.println("Let's see what's around this area now!");
        System.out.println("I've looked around enough, let's turn this off");
        myFlashlight.turnOff();
    }
}
