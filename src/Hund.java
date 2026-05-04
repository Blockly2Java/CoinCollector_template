/**
// Erstelle dein Programm über Blockly und
// klicke auf 'Play', um es auszuführen!
*/

public class Hund { 
    private Group group;


    public void beiFuss(Mensch herrchen) {
    }

    public double getX() {
        return group.getCenterX();
    }

    public Hund() {
        RoundedRectangle beinL = new RoundedRectangle(120, 180, 20, 90, 10);
        beinL.rotate(-10);
        beinL.setFillColor("#996633");
        RoundedRectangle beinR = new RoundedRectangle(260, 180, 20, 90, 10);
        beinR.rotate(10);
        beinR.setFillColor("#996633");
        RoundedRectangle koerper = new RoundedRectangle(100, 100, 200, 100, 10);
        koerper.setFillColor("#996633");
        Circle kopf = new Circle(80, 80, 60);
        kopf.setFillColor("#996633");
        Circle auge = new Circle(55, 63, 10);
        auge.setFillColor("#000000");
        Triangle ohrL = new Triangle(45, 30, 55, -20, 75, 30);
        ohrL.setFillColor("#996633");
        Triangle ohrR = new Triangle(80, 30, 90, -20, 110, 30);
        ohrR.setFillColor("#996633");
        Ellipse route = new Ellipse(300, 100, 50, 10);
        route.rotate(60);
        route.setFillColor("#996633");
        group = new Group(koerper, kopf, beinL, beinR, ohrL, ohrR, auge, route);
        group.move(50, 50);
    }

    public double getY() {
        return group.getCenterY();
    }

    public void zuPositionLaufen(double x, double y) {
        double diffX = x - getX();
        double diffY = y - getY();
        double distanz = Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));

        if (distanz > 1) {
            double dirX = diffX / distanz;
            double dirY = diffY / distanz;

            while (distanz > 1) {
                group.move(dirX, dirY);
                distanz = distanz - 1;
            }
            double restX = x - getX();
            double restY = y - getY();
            group.move(restX, restY);
        }
    }

}