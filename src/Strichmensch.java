/**
Erstelle dein Programm über Blockly und
klicke auf 'Play', um es auszuführen!
*/

public class Strichmensch extends Group { 
    private Line k;
    private Line bL;
    private Line bR;
    private Line aL;
    private Line aR;
    private Circle h;


    public Strichmensch(double x, double y) {
        k = new Line(0 + x, 15 + y, 0 + x, 100 + y);
        bL = new Line(0 + x, 100 + y, -50 + x, 175 + y);
        bR = new Line(0 + x, 100 + y, 50 + x, 175 + y);
        aL = new Line(0 + x, 70 + y, -70 + x, 30 + y);
        aR = new Line(0 + x, 70 + y, 70 + x, 30 + y);
        h = new Circle(0 + x, 0 + y, 30);
        this.add(k);
        this.add(aL);
        this.add(aR);
        this.add(bL);
        this.add(bR);
        this.add(h);
        setFillColor("#ffffff");
    }

    public void setFillColor(String farbe) {
        h.setFillColor(farbe);
        aL.setBorderColor(farbe);
        aR.setBorderColor(farbe);
        bL.setBorderColor(farbe);
        bR.setBorderColor(farbe);
        k.setBorderColor(farbe);
    }

}