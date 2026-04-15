public class flashlight {
    
    public String description;
    public boolean isLit;

    public flashlight(String description, boolean isLit){
        this.description = description;
        this.isLit = isLit;
    }

    public void pickUp(){
        System.out.println("You picked up: " + this.description);
    }

    public void putDown(){
        System.out.println("You put down: " + this.description);
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
}
