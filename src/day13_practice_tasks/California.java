package day13_practice_tasks;

public class California extends State{
    public California(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
    }
    public String capital = "Sacramento";

    public void votes(){
        System.out.println(super.getName() + " is vote in October");
    }
    public void celebrates(){
        System.out.println(super.getName() + " is vote in May");
    }
}
