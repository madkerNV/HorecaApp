package org.example.madjid.horecagelegenheidapp;

import java.util.List;

public class HorecaGelegenheid {
    //Vele medewerkers, vele gasten
    //Arraylist implementeren
    private List<HorecaMedewerker> horecaMedewerkers; //Een HorecaMedewerker bevat meerdere horecamedewerkers
    private List<HorecaGast> horecaGasten; //Zelfde als voor HorecaMedewerker
    private static int totaalAantalTafelsHorecaGelegenheid;
    private static int totaalAantalGebruikteTafelsHorecaGelegenheid;

    //Nieuwe HorecaGelegenheid object aangemaakt.
    //horecaMedewerkers en horecaGasten list in de horecagelegenheid
    public HorecaGelegenheid(List<HorecaMedewerker> horecaMedewerkers, List<HorecaGast> horecaGasten) {
        this.horecaMedewerkers = horecaMedewerkers;
        this.horecaGasten = horecaGasten;
        totaalAantalGebruikteTafelsHorecaGelegenheid = 0;
        totaalAantalTafelsHorecaGelegenheid = 10;
    }

    public List<HorecaMedewerker> getHorecaMedewerkers() {
        return horecaMedewerkers;
    }
    //Toevoegen van een medewerker aan de horecagelegenheid
    public void addHorecaMedewerkers(HorecaMedewerker horecaMedewerker) {
        horecaMedewerkers.add(horecaMedewerker);
    }

    public List<HorecaGast> getHorecaGasten() {
        return horecaGasten;
    }
    //Toevoegen van horecagast aan de horecagelegenheid
    public void addHorecaGasten(HorecaGast horecaGast) {
        horecaGasten.add(horecaGast);
    }
    //Return totaal aantal tafels in de horecagelegenheid
    public int getTotaalAantalTafelsHorecaGelegenheid() {
        return totaalAantalTafelsHorecaGelegenheid - totaalAantalGebruikteTafelsHorecaGelegenheid;
    }
    //toevoegen van aantal tafels die beschikbaar is in de horecagelegenheid
    public static void updateTotaalAantalTafelsHorecaGelegenheid(int aantalTafels) {
        totaalAantalTafelsHorecaGelegenheid -= aantalTafels;
    }
    //Return totaal gebruikte dus bezette tafels horecagelegenheid
    public int getTotaalAantalGebruikteTafelsHorecaGelegenheid() {
        return totaalAantalGebruikteTafelsHorecaGelegenheid;
    }

    //update de tafels die nog beschikbaar zijn
    public void updateTotaalAantalBeschikbareTafelsHorecaGelegenheid(int gebruikteTafels) {
totaalAantalTafelsHorecaGelegenheid -= gebruikteTafels;   }
}
