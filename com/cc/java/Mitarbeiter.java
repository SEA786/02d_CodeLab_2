package com.cc.java;

public class Mitarbeiter {
    // Felder
    private String name;
    private String vorname;
    private String funktion;
    private int eintrittsjahr;

    // Konstruktor
    public Mitarbeiter(String name, String vorname, String funktion, int eintrittsjahr) {
        this.name = name;
        this.vorname = vorname;
        this.funktion = funktion;
        this.eintrittsjahr = eintrittsjahr;
    }

    // Methode getInfo
    public String getInfo(String parameter) {
        switch (parameter.toLowerCase()) {
            case "name":
                return "Name: " + this.name;
            case "vorname":
                return "Vorname: " + this.vorname;
            case "funktion":
                return "Funktion: " + this.funktion;
            case "eintrittsjahr":
                return "Eintrittsjahr: " + this.eintrittsjahr;
            default:
                return "Ungültiger Parameter";
        }
    }
}
