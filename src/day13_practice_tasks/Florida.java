package day13_practice_tasks;

public class Florida extends State{
    {
        System.err.println("\"Need more information\"");
    }

    public Florida(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
    }

    public int averageTemperature = 75;
    public void festivals(){
        System.out.println("Festival in " + getName() + " starts April 15th!");
    }
}
