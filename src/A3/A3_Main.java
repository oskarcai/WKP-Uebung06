package A3;

import java.util.Arrays;

public class A3_Main {
    public static void main(String[] args) {


        Integer[] ints = {10, 20, 30};
        NumberContainer nc = new NumberContainer(ints);
        System.out.println(nc.sum());
        /* a)
        Kompiliert dieser Code? Wenn ja, welche Ausgabe erzeugt er? Begründen Sie kurz, warum
        die Zuweisung ints → NumberContainer möglich ist

        -> Ja, der Code kompiliert.
        -> Die Zuweisung ints → NumberContainer ist möglich aufgrund von Subtyppolymorphie in Java,
            da ein Integer[]-Objekt als Referenztyp eine Oberklasse (in dem Fall Number) von Integer haben darf.
         */

        nc.set(0, 3.14);
        /* b)
        Kompiliert dieser Code? Was passiert zur Laufzeit? Erklären Sie in einem Satz, warum
        es trotz fehlerfreier Kompilierung zu diesem Verhalten kommt.

        -> Ja, der Code kompiliert. (es gibt zur Laufzeit allerdings einen Fehler)
        -> Der Laufzeitfehler entsteht dadurch, das zur Laufzeit versucht wird,
            in ein Integer[]-Array eine double-Wert einzufügen (funktioniert nicht → ArrayStoreException).

            Hier kommt ein wichtiges Konzept ins Spiel: Array-Kovarianz. Das ist eigentlich der Kern von Aufgabe 3! Lass mich das kurz erklären:
            Weil Integer eine Unterklasse von Number ist, darf ein Integer[] überall dort stehen, wo ein Number[] erwartet wird — das nennt sich Kovarianz von Arrays. Das ist wie bei Polymorphismus, nur für Arrays.

            Der Haken: Der echte Typ des Arrays im Speicher bleibt Integer[]. Java merkt sich das. Wenn du nun versuchst, einen Double-Wert (3.14) hineinzuschreiben, prüft Java zur Laufzeit: "Passt ein Double in ein Integer[]?" — Nein! → ArrayStoreException.
            Der Compiler sieht nur Number[] und sagt "passt", aber zur Laufzeit kennt Java den echten Arraytyp und blockiert den Schreibzugriff.
         */

        printAll(ints);
        /* c)
         Schreiben Sie eine Methode printAll(Number[] numbers) in Ihre Main-Klasse, die alle
        Werte des übergebenen Arrays auf der Konsole ausgibt. Rufen Sie printAll mit einem
        Integer[]-Array auf. Kompiliert der Aufruf? Warum?

        -> Ja, der Aufruf von printAll(ints) kompiliert mit Übergabe eines Integer[]-Arrays,
            obwohl der Übergabetyp ein Number[]-Array ist-
        -> Warum? Wegen Subtyppolymorphie ("kleinerer Referenztyp passt in einen größeren rein")
         */
    }

    // c
    public static void printAll(Number[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}
