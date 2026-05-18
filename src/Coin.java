/**
Erstelle dein Programm über Blockly und
klicke auf 'Play', um es auszuführen!
*/

public class Coin extends Circle { 
    private double runCounter;


    public Coin() {
        super(500, 500, 20);
        runCounter = 0;
        this.setFillColor("#ffcc33");
    }

    public static int mathRandomInt(int a, int b) {
            if (a > b) {
                // Swap a and b to ensure a is smaller.
                int c = a;
                a = b;
                b = c;
            }
            return (int) (Math.floor(Math.random() * (b - a + 1)) + a);
        }

    /**
     * Alle 100 Runs, an einen zufälligen Ort
     *  im gegenüberliegenden Quadrant setzen.
     */
    public void act() {

        if (runCounter == 0) {
            double dx = 0;
            double dy = 0;

            if (this.getCenterX() >= 500) {
                dx = -1 * mathRandomInt(0, 500);
            }
            else {
                dx = mathRandomInt(0, 500);
            }

            if (this.getCenterY() >= 500) {
                dy = -1 * mathRandomInt(0, 500);
            }
            else {
                dy = mathRandomInt(0, 500);
            }
            this.move(dx, dy);
        }
        runCounter = (runCounter + 1) % 100;
    }

}