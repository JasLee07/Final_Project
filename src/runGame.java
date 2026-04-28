public class runGame {
    
    public static void main(String[] args) {
        gameLoop mygame = new gameLoop();
        System.out.println("Hello! For this detective game, please use the numbers 1-7 to progress!");
        mygame.setup();
        while (mygame.isRunning){
            mygame.takeTurn();
        }
    }
}
