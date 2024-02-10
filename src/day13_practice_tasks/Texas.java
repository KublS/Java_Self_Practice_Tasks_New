package day13_practice_tasks;
import static java.lang.Math.*;
public class Texas extends State{
    public Texas(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
    }

    public void howManyCounty(){
        if (getPopulation() > 4_000_000){
            int county;
            county = round(getPopulation() / 4_000_000);
            System.out.println("How many county: " + county);
        } else {
            System.out.println("How many county: 1");
        }
    }

    public void debates(){
        System.out.println("Debates will start in July!");
    }
}
