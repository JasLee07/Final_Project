public class runGame {
    
    public static void main(String[] args) {
        gameLoop mygame = new gameLoop();
        mygame.setup();
        while (mygame.isRunning){
            mygame.takeTurn();
        }
    }
}
