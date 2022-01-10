package com.uni;

public class Felder {
    private int Id;
    private String Unternehmensname;
    private String Unternehmensgrosse;
    private int AnzahlMitarbeiter;
    private int EinkomenVonKunde;
    private String Ort;

    public Felder(int id, String unternehmensname, String unternehmensgrosse, int anzahlMitarbeiter, int einkomenVonKunde, String ort) {
        Id = id;
        Unternehmensname = unternehmensname;
        Unternehmensgrosse = unternehmensgrosse;
        AnzahlMitarbeiter = anzahlMitarbeiter;
        EinkomenVonKunde = einkomenVonKunde;
        Ort = ort;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUnternehmensname() {
        return Unternehmensname;
    }

    public void setUnternehmensname(String unternehmensname) {
        Unternehmensname = unternehmensname;
    }

    public String getUnternehmensgrosse() {
        return Unternehmensgrosse;
    }

    public void setUnternehmensgrosse(String unternehmensgrosse) {
        Unternehmensgrosse = unternehmensgrosse;
    }

    public int getAnzahlMitarbeiter() {
        return AnzahlMitarbeiter;
    }

    public void setAnzahlMitarbeiter(int anzahlMitarbeiter) {
        AnzahlMitarbeiter = anzahlMitarbeiter;
    }

    public int getEinkomenVonKunde() {
        return EinkomenVonKunde;
    }

    public void setEinkomenVonKunde(int einkomenVonKunde) {
        EinkomenVonKunde = einkomenVonKunde;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    @Override
    public String toString() {
        return "Felder{" +
                "Id=" + Id +
                ", Unternehmensname='" + Unternehmensname + '\'' +
                ", Unternehmensgrosse='" + Unternehmensgrosse + '\'' +
                ", AnzahlMitarbeiter=" + AnzahlMitarbeiter +
                ", EinkomenVonKunde=" + EinkomenVonKunde +
                ", Ort='" + Ort + '\'' +
                '}';
    }
}
