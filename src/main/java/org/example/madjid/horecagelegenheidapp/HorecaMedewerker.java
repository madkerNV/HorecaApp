package org.example.madjid.horecagelegenheidapp;

public class HorecaMedewerker {
    private int id;
    private String naam;
    private int salaris;

    public HorecaMedewerker(int id, String naam, int salaris){
        this.id = id;
        this.naam = naam;
        this.salaris = salaris;
    }
    public int getId(){
        return id;
    }
    public String getNaam() {
        return naam;
    }
    public int getSalaris(){
        return salaris;
    }
    public void setSalaris(int salaris){
        this.salaris =salaris;
    }
}
