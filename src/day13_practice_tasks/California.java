package day13_practice_tasks;

public class California extends State{
    public California(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
        setCapital(capital);
    }
    private String capital = "Sacramento";

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void votes(){
        System.out.println(getName() + " is vote in October");
    }
    public void celebrates(){
        System.out.println(getName() + " is vote in May");
    }
}
