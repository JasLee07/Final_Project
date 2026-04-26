public class item {
    
    public String description = "<Unknown item>";
    
    public item(String description){
        if (description != null) { this.description = description; }
    }

    public String getDescription() {
        return this.description;
    }
    
    @Override
    public String toString() {
        return "This is a: " + this.description;
    }

    public void pickUp(){
        System.out.println("You picked up: " + this.description);
    }

    public void putDown(){
        System.out.println("You put down: " + this.description);
    }

}
