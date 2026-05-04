/**
// Erstelle dein Programm über Blockly und
// klicke auf 'Play', um es auszuführen!
*/

public class Mensch { 
    private Group grafikGruppe;
    private Hund meinHund;


    public void gassiGehen() {
    }

    public void hundRufen() {
    }

    public Mensch(Hund hund) {
        Line grafik1 = new Line(100, 50, 100, 200);
        Line grafik2 = new Line(100, 200, 50, 300);
        Line grafik3 = new Line(100, 200, 150, 300);
        Line grafik4 = new Line(100, 150, 0, 100);
        Line grafik5 = new Line(100, 150, 200, 100);
        Circle grafik6 = new Circle(100, 25, 50);
        grafik6.setBorderColor("#ffffff");
        grafik6.setFillColor("#cccccc");
        grafikGruppe = new Group();
        grafikGruppe.add(grafik6);
        grafikGruppe.add(grafik1);
        grafikGruppe.add(grafik2);
        grafikGruppe.add(grafik3);
        grafikGruppe.add(grafik4);
        grafikGruppe.add(grafik5);
        meinHund = hund;
    }

}