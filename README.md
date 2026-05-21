# Videos zu Vererbung
[Studyflix: studyflix.de/informatik/vererbung-in-java-430](https://studyflix.de/informatik/vererbung-in-java-430)

[https://youtu.be/74bnkF66PFU?si=HpbBCnsi3qjP3bZw](https://youtu.be/74bnkF66PFU?si=HpbBCnsi3qjP3bZw)

---

# Kontext

In dieser Aufgabe nutzen wir die Vererbnung, um unsere Formen mit der Tastatur zu kontrollieren und durch die Welt zu bewegen. Damit bauen wir ein Einzel- oder Mehrspieler-Spiel, in welchem Spieler:innen Münzen einsammeln. Das ist eine anspruchsvolle Aufgabe - wenn ihr euch (wie bisher auch) Schritt für Schritt durcharbeitet, ist es aber garnicht so schlimm🙂 Aber man muss ein bisschen lesen...

**Die Korrektheit der Aufgabe wird nicht automatisch überprüft!** --> Kontrolliere selbst, ob du die beschriebene Anforderungen erfüllst!

---


# Die Grafikklassen

Nutze den "`Erbt von Grafikklasse`"-Block, um eigene Klassen zu erstellen, die die geometrischen Formen individualisieren.

Die `act()` Methode von Objekten der Klasse Actor (und ihren Unterklassen), wird immer wieder ausgeführt, wenn man auf Play drückt. Was man hierin programmiert, wird also dauernd wiederholt. Die Methode eignet sich für Bewegungen etc.

*Beispiel:* Wenn eine Unterklasse von `Circle` die `act()`-Methode so überschreibt, dass dem Objekt eine zufällige neue Farbe zugewiesen wird, wird dieser Kreis dann andauernd seine Farbe zufällig ändern.

Außerdem haben alle Grafikklassen die Methode `onKeyDown(String key)`, die aufgerufen werden, wenn eine Taste gedrückt (down) wird. Als Paramter wird die jeweilige Taste übergeben (z.B. `a`, `5`, `ArrowLeft`, `ArrowDown`, `Space`, ...).

---

# Vorlage

Alle benötigten Klassen sind bereits vorhanden. Erstelle keine neuen und benenne keine bestehenden um!

## `Strichmensch`
Diese Klasse ist schon fertig. Du kannst einfach Objekte erzeugen und Methoden aufrufen. **Hier nichts ändern!

## `Main`
Die Main enthält eine Vorlage für ein 2-Spieler-Spiel. Ein Spieler wird mit den Pfeilen und einer mit WSAD gesteuert. Die Spieler starten in gegenüberliegenden Ecken. Sobald alles fertig ist, wird der Hintergrund grün und das Spiel beginnt. Die Main musst du nicht verändern, darfst aber.

## `Coin`
Die `act()` Methode enthält bereits die Logik, alle 100 Durchläufe irgendwas zu tun. Du kannst du Anzahl der Durchläufe verändern, den Rest solltest du aber behalten.

## `Player`
Hier sind nur die Methoden-Rahmen enthalten. Alles andere musst du selbst programmieren.

---


# Aufgabe

Programmiere ein Spiel, bei dem ein oder mehrere Spieler nach einer Münze jagen. Folgendes muss dafür erledigt werden:

## Oberklasse und Konstruktor
- `Player` und `Coin`: Orientiere dich für die Vererbungsstruktur am Klassendiagramm weiter unten. Hier sind z.B. auch Referenzattribute abgebildet, die du früher oder später nutzen musst.
- `Coin`s starten immer am gleichen Ort (wo genau ist egal, z.B. in der Mitte der Spielfelds `(500,500)`). Vergiss nicht, den `runCounter` anfangs auf `0` zu setzen. Du könntest hier außerdem noch eine Farbe setzen.
- `Player` bekommen viele Werte als Paramter übergeben. Manche musst du an den Konstruktor der Oberklasse `Strichmensch` weitergeben, andere in Attributen (siehe Klassendiagramm) speichern, da wir sie später noch brauchen. Um die `farbe` zu setzen gibt es sogar direkt eine Methode der Oberklasse. 


## Münze
- Programmiere in der Klasse `Coin` die `act()` Methode so, dass die Münze alle 100 Durchläufe der Methode ihre Posititon an eine zufällige Stelle auf dem Spielfeld verlegt. *Tipp:* Die Münze bleibt auf jeden Fall im Spielfeld, wenn man sie von der rechten Häfte des Felds zwischen 100 und 500 Einheiten nach links bewegt bzw. von der linken Häfte genauso weit zufällig nach rechts. Für oben und unten funktioniert es genauso.


## Spieler
- Programmiere die `onKeyDown(key)` Methode in der Klasse `Player` so, dass sich der Spieler je nach gedrückter Taste in eine bestimmte Richtung läuft. Die Geschwindigkeit legst du frei fest. Bei mir hat z.B. 5 gut funktioniert. *Hinweis: Spielt man zu zweit, muss man immer wieder drücken, sonst bleibt der Spieler nach einem Aufruf stehen.*
- `act()` soll kontinuierlich überprüfen, ob die Münze erreicht wurde. Vergleiche hierzu die x- und y-Koordinate von Spieler und Münze. Zur Überprüfung des Abstand hat gut funktioniert, bei (gleichzeitig!) weniger als 100 Einheiten in y-Richtung und weniger als 50 Einheiten in x-Richtung von einer Berührung auszugehen. Die Koordinaten-Getter nutzen jeweils den Mittelpunkt.
- Wurde die Münze erreicht, hat der Spieler gewonnen. Sei kreativ! Er könnte zum Beispiel größer werden (`scale(double faktor)`), rotieren (`rotate(double degrees)`), die Farbe ändern oder mehrere davon auf einmal.


Viele Spaß beim Spielen!

### Bonusaufgabe
Lasse eine zusätzliche `NPC` Klasse von `Player` ergeben , programmiere sie so, dass sie von allein die Münze jagt und spiele dann gegen den Computer. Wer gewinnt?

# Klassendiagramm

Der Übersichtlichkeit halber werden bei bereits vorhandenen Grafikklassen nicht alle Elemente dargestellt.


![ARCHITECTURE](http://www.plantuml.com/plantuml/proxy?cache=no&fmt=svg&src=https://raw.githubusercontent.com/Blockly2Java/CoinCollector_template/refs/heads/main/cd.puml)
