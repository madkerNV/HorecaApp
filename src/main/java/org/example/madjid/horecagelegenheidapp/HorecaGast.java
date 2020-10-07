package org.example.madjid.horecagelegenheidapp;

public class HorecaGast {

    private int id;
    private String naam;
    private int aantalGemaakteReserveringen;
    private int aantalGebruikteTafelsHorecaGelegenheid;
    private int totaalAantalTafelsHorecaGelegenheid;

    public HorecaGast(int id, String naam, int aantalGemaakteReserveringen){
        this.aantalGebruikteTafelsHorecaGelegenheid = 0;
        this.totaalAantalTafelsHorecaGelegenheid = 10;
        this.id = id;
        this.naam = naam;
        this.aantalGemaakteReserveringen = aantalGemaakteReserveringen;

    }


    public void setAantalGemaakteReserveringen(int aantalGemaakteReserveringen){
        this.aantalGemaakteReserveringen = aantalGemaakteReserveringen;
    }

    public void bezetTafel(int gebruikteTafels){
        aantalGebruikteTafelsHorecaGelegenheid += gebruikteTafels;
        //Update aantal tafels die wel beschikbaar zijn via static werd dit mogelijk
        HorecaGelegenheid.updateTotaalAantalTafelsHorecaGelegenheid(gebruikteTafels);
    }

    public int getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalGemaakteReserveringen() {
        return aantalGemaakteReserveringen;
    }

    public int getAantalGebruikteTafelsHorecaGelegenheid() {
        return aantalGebruikteTafelsHorecaGelegenheid;
    }

    public int getTotaalAantalTafelsHorecaGelegenheid() {
        return totaalAantalTafelsHorecaGelegenheid;
    }
    //return beschikbare tafels
    public int krijgBeschikbareTafels(){
        return totaalAantalTafelsHorecaGelegenheid - aantalGebruikteTafelsHorecaGelegenheid;
    }

}
