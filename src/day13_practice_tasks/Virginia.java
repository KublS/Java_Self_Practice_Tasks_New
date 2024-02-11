package day13_practice_tasks;

public class Virginia extends State {

    public Virginia(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
    }
    private String nickNames;

    public String getNickNames() {
        if(nickNames.length()>10){
            System.out.println("NickName to long");
            System.exit(1);
        }
        return nickNames;
    }

    public void setNickNames(String nickNames) {
        this.nickNames = nickNames;
    }

    public void votes(){
        System.out.println(getName() + " is vote in January");
    }

    public void partyMembersMeeting(){
        System.out.println(getName() + " members meets in the summer");
    }
}
