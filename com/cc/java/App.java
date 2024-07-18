package com.cc.java;

public class App {
    public static void main(String[] args) {
        // Erzeugen von drei Mitarbeiter-Objekten
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Müller", "Hans", "Entwickler", 2015);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Schmidt", "Lisa", "Projektmanager", 2018);
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Martinelli", "Silvia", "CEO", 2020);

        // Ausgabe der Informationen
        System.out.println(mitarbeiter1.getInfo("name"));
        System.out.println(mitarbeiter1.getInfo("vorname"));
        System.out.println(mitarbeiter1.getInfo("funktion"));
        System.out.println(mitarbeiter1.getInfo("eintrittsjahr"));

        System.out.println(mitarbeiter2.getInfo("name"));
        System.out.println(mitarbeiter2.getInfo("vorname"));
        System.out.println(mitarbeiter2.getInfo("funktion"));
        System.out.println(mitarbeiter2.getInfo("eintrittsjahr"));

        System.out.println(mitarbeiter3.getInfo("name"));
        System.out.println(mitarbeiter3.getInfo("vorname"));
        System.out.println(mitarbeiter3.getInfo("funktion"));
        System.out.println(mitarbeiter3.getInfo("eintrittsjahr"));
    }
}
