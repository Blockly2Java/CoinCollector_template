/**
Erstelle dein Programm über Blockly und
klicke auf 'Play', um es auszuführen!
*/

public class Player extends Strichmensch { 
    private String keyL;
    private String keyR;
    private String keyUp;
    private String keyDown;
    private Coin muenze;


    public Player(double startX, double startY, String farbe, String left, String right, String up, String down, Coin coin) {
        super(startX, startY);
        this.setFillColor(farbe);
        keyL = left;
        keyR = right;
        keyUp = up;
        keyDown = down;
        muenze = coin;
    }

    public void onKeyDown(String key) {

        if (key == keyL) {
            this.move(-5, 0);
        }
        else if (key == keyR) {
            this.move(5, 0);
        }
        else if (key == keyUp) {
            this.move(0, -5);
        }
        else if (key == keyDown) {
            this.move(0, 5);
        }
    }

    public void act() {
        double playerX = this.getCenterX();
        double coinX = muenze.getCenterX();
        double playerY = this.getCenterY();
        double coinY = muenze.getCenterY();

        if (100 >= Math.abs(coinY - playerY) && 50 >= Math.abs(coinX - playerX)) {
            this.scale(1.1);
            this.rotate(5);
        }
    }



}