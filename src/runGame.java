public class runGame {
    
    public static void main(String[] args) {
        gameLoop mygame = new gameLoop();
        System.out.println("Hello! For this detective game, please use the numbers 1-7 to progress!");
        System.out.println("When you want to pick up an item, type the name of it. It will be in parenthesis.");
        System.out.println("Have fun!");
        mygame.setup();
        while (mygame.isRunning){
            mygame.takeTurn();
        }
    }
}
