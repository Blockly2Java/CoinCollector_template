## Aufgabe: Gassi gehen - Mensch und Hund in Bewegung

In dieser Aufgabe programmieren wir einen Spaziergang zwischen Mensch und Hund. Der Hund soll seinem Herrchen beim Gassi gehen folgen, wenn er gerufen wird (Bei Fuß!).

Der Code für beide Klassen ist bereits vorhanden. Sie haben bereits ein Erscheinungsbild (aus geometrischen Formen). Deine Aufgabe ist es, die Bewegungslogik und die Interaktion zwischen Mensch und Hund zu implementieren.

---

## Klassendiagramm

(Das Klassendiagramm gibt es nur auf Artemis)

---

## Beschreibung - Vorlage

- Die Main-Methode enthält bereits etwas Code, damit du deine Änderungen direkt siehst, wenn du startest. Hieran musst du nichts ändern.
- Die Konstruktoren von Mensch und Hund erzeugen alle benötigten Grafik-Objekte. Du musst sie nicht verändern. Es wird jeweils eine Grafik-Gruppe erzeugt (siehe Klassendiagramm) mit der du das ganze Objekt auf einmal bewegen kannst. Wichtig ist, dass diese Gruppe immer alle Grafiken enthält. Das genaue Aussehen kannst du anpassen, wenn du möchtest.
- Der Hund hat bereits Getter-Methoden für die Koordinaten.
- Der Hund hat bereits eine Methode `zuPositionLaufen(x,y)`, mit deren Hilfe er sich ungefährt zu einer bestimmten Koordinate bewegt. Sie ist zwar nicht super-genau, aber das sind Hunde in Wirklichkeit ja auch nicht. Für unsere Zwecke ist das aber völlig ausreichend. Wenn du sie verbessern möchtest, kannst du das natürlich tun.


---

## TODO - Der Spaziergang
- **Mensch.getX(), Mensch.getY()**: Damit der Hund später nachschauen kann, wo der Mensch ist, brauchen wir Getter-Methoden für die Koordinaten des Menschen. Tipp: Nutze die Koordinaten der `grafikGruppe`.
- **Hund.beiFuss(Mensch herrchen)** — soll den Hund veranlassen, zur Position des Mensch-Objekts zu laufen, das als Parameter übergeben wird (Tipp: Nutze `zuPositionLaufen(double x, double y)`).
- **Mensch.gassiGehen()** soll den Menschen zu einem zufälligen Punkt bewegen (Empfehlung: zufällige Bewegung zwischen 500 und 1400 Einheiten pro Koordinaten-Richtung vom Startpunkt aus) und anschließend den Hund rufen.
- **Mensch.hundRufen()** — soll den Hund zum Menschen rufen (nutze `beiFuss` und übergib ein geeignetes Mensch-Objekt als Parameter).




---