public class teacup {
    
    public String description;

    public teacup(String description){
        this.description = description;
    }

    public void pickUp(){
        System.out.println("You picked up: " + this.description);
    }

    public void putDown(){
        System.out.println("You put down: " + this.description);
    }

    public void Inspect(){
        System.out.println("The sweet aroma of the cup swirls into your nose. You start to feel...lightheaded and sick...what's in this tea?");
    }

    public static void main(String[] args) {
        teacup greenteacup = new teacup("Green teacup");
        System.out.println("There's a teacup! Let's go check it out.");
        greenteacup.pickUp();
        greenteacup.Inspect();
        System.out.println("I think I'm ready to put this down.");
        greenteacup.putDown();
        System.out.println("Let's see what else is around.");
    }
}
