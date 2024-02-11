package day13_practice_tasks;

public class State {

    private String name, abbreviation, politicalParty, governor, senator;
    private int population;

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }
    public String getAbbreviation() {
        return abbreviation;
    }
    public String getPoliticalParty() {
        return politicalParty;
    }
    public String getGovernor() {
        return governor;
    }
    public String getSenator() {
        return senator;
    }
    public int getPopulation() {
        return population;
    }

    public void setName(String name) {
        if (name == null){
            throw new RuntimeException("Invalid input in the: NAME");
        }
        if ( name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Invalid input in the: NAME");
        }
        this.name = name;
    }
    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null){
            throw new RuntimeException("Invalid input in the: Abbreviation");
        }
        if ( abbreviation.isEmpty() || abbreviation.isBlank()){
            throw new RuntimeException("Invalid input in the: Abbreviation");
        }
        this.abbreviation = abbreviation;
    }
    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null){
            throw new RuntimeException("Invalid input in the: POLITICAL PARTY");
        }
        if ( politicalParty.isEmpty() || politicalParty.isBlank()){
            throw new RuntimeException("Invalid input in the: POLITICAL PARTY");
        }
        this.politicalParty = politicalParty;
    }
    public void setGovernor(String governor) {
        if (governor == null){
            throw new RuntimeException("Invalid input in the: GOVERNOR");
        }
        if ( governor.isEmpty() || governor.isBlank()){
            throw new RuntimeException("Invalid input in the: GOVERNOR");
        }
        this.governor = governor;
    }
    public void setSenator(String senator) {
        if (senator == null){
            throw new RuntimeException("Invalid input in the: Senator");
        }
        if ( senator.isEmpty() || senator.isBlank()){
            throw new RuntimeException("Invalid input in the: Senator");
        }
        this.senator = senator;
    }
    public void setPopulation(int population) {
        if (population < 1){
           throw new RuntimeException("Invalid input in the: POPULATION");
        }
        this.population = population;
    }

    public String toString() {
        return getClass().getSimpleName() + "\n" +
                "Name:" + name +
                ", abbreviation: " + abbreviation +
                ", politicalParty: " + politicalParty +
                ", governor: " + governor +
                ", senator: " + senator +
                ", population: " + population;
    }


}
