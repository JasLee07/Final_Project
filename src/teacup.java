public class teacup extends item {

    public teacup(String description){
        super(description);
    }

    public void Smell(){
        System.out.println("The sweet aroma of the cup swirls into your nose. You start to feel...lightheaded and sick...what's in this tea?");
    }

    public static void main(String[] args) {
        teacup teacup = new teacup("Green teacup");
        System.out.println("There's a teacup! Let's go check it out.");
        teacup.pickUp();
        teacup.Smell();
        System.out.println("I think I'm ready to put this down.");
        teacup.putDown();
        System.out.println("Let's see what else is around.");
    }
}
