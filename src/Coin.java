/**
// Erstelle dein Programm über Blockly und
// klicke auf 'Play', um es auszuführen!
*/

public class Coin { 
    private double runCounter;


    public Coin() {
    }

    /**
     * Alle 100 Runs, an einen zufälligen Ort
     *  im gegenüberliegenden Quadrant setzen.
     */
    public void act() {
        runCounter = (runCounter + 1) % 100;

        if (runCounter == 0) {
            double dx = 0;
            double dy = 0;
        }
    }

}