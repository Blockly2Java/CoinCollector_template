/**
// Erstelle dein Programm über Blockly und
// klicke auf 'Play', um es auszuführen!
*/

public class Main { 
    /**
     * Das Hauptprogramm (main-Methode):
     * Alles, was ausgeführt werden soll,
     * muss in diese Methode eingefügt werden.
     * Objekte erstellen, Methoden aufrufen, ...
     *
     * Das Hauptprogramm wird automatisch
     * gestartet, wenn du auf 'Play' drückst.
     */
    public static void main() {
        World world = new World(1600, 1600);
        Hund hund = new Hund();
        Mensch mensch = new Mensch(hund);
        mensch.gassiGehen();
    }

} /*// main()-Methode starten
Main.main();*/