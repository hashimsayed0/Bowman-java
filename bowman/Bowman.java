package bowman;


/**
 * Main class responsible for starting the game
 * 
 * @author a-haydar
 */
public class Bowman {
    
    private static final int WINDOW_WIDTH = 1000;
    private static final int WINDOW_HEIGHT = 600;
    private static final String TITLE = "Bowman v0.1";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create game & start it
        Game game = new Game(WINDOW_WIDTH, WINDOW_HEIGHT);
        // create window with this game
        Window window = new Window(WINDOW_WIDTH, WINDOW_HEIGHT, game, TITLE);
        // start game
        game.start();
    }
    
}
