//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // sattheites werte der Tiere
        int satietyCow = 80;
        int satietySheep = 80;
        int satietyChicken = 80;


        /*
        * Aufgabe:
        *
        * Einen weg finden die z.B satietyCow variable zu verändern ohne 5 verschiedene Variablen zu deklarieren
        * Eine for schleife schreiben um 5 tage zu simulieren wo die tiere jeden tag hungriger werden. Außerdem werden
        * ALLE tiere am 3ten tag gefüttert
        *
        * Die Tiere dürfen nie Hungriger als 0 werden und nie gesättigter als 100
        * also wenn ein tier z.B auf 0 hunger ist soll die feed() methode einsetzten (spätestens) nicht
        * nochmals die getHungrier() Methode
        * */



        for (int i = 0; i < 5; i++) {
            satietyChicken = getHungrier(satietyChicken);
            System.out.println(satietyChicken);
        }

    }


    // Methode zum reduzieren des Sattheitwertes
    public static int getHungrier(int satiety) {
        return Math.max(0, satiety - 20);
    }

    // Methode zum erhöhen des Sattheitwertes
    public static int feed(int satiety) {
        return Math.min(100, satiety + 30);
    }
}