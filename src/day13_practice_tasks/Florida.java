package day13_practice_tasks;

public class Florida extends State{

    public Florida(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
        setAverageTemperature(averageTemperature);
    }

    private int averageTemperature;

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        if (averageTemperature < 0 || averageTemperature > 100){
            throw new RuntimeException("Invalid input in: TEMPERATURE");
        }
        this.averageTemperature = averageTemperature;
    }

    public void festivals(){
        System.out.println("Festival in " + getName() + " starts April 15th!");
    }
}
