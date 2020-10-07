import org.example.madjid.horecagelegenheidapp.HorecaGast;
import org.example.madjid.horecagelegenheidapp.HorecaGelegenheid;
import org.example.madjid.horecagelegenheidapp.HorecaMedewerker;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class testclass {

@Test
    void listTest(){
    List<Integer> nummers = new ArrayList<>();
    nummers.add(5);
    nummers.add(8);
    System.out.println(nummers);
}

@Test
        void maakHorecaMedewerkersEnHorecaGastenAanWaarbijTweeHorecaGastenVierTafelsGebruiken() {
    HorecaMedewerker jan = new HorecaMedewerker(1, "jan", 1200);
    HorecaMedewerker jon = new HorecaMedewerker(2, "jon", 1500);
    HorecaMedewerker jun = new HorecaMedewerker(3, "jun", 1100);
    List<HorecaMedewerker> horecaMedewerkerList = new ArrayList<>();

    horecaMedewerkerList.add(jan);
    horecaMedewerkerList.add(jon);
    horecaMedewerkerList.add(jun);



    HorecaGast pan = new HorecaGast(1, "pan", 2);
    HorecaGast lan = new HorecaGast(2, "lan", 1);
    HorecaGast lon = new HorecaGast(3, "lon", 1);
    List<HorecaGast> horecaGastList = new ArrayList<>();

    horecaGastList.add(pan);
    horecaGastList.add(lan);
    horecaGastList.add(lon);

    HorecaGelegenheid pizzeria = new HorecaGelegenheid(horecaMedewerkerList, horecaGastList);
    System.out.println("pizzeria heeft in totaal: " + pizzeria.getTotaalAantalTafelsHorecaGelegenheid() +" tafels");

    pan.bezetTafel(1);
    lan.bezetTafel(3);
    System.out.println("Daarvan zijn er " + pizzeria.getTotaalAantalTafelsHorecaGelegenheid() + " tafels beschikbaar");
}
}




