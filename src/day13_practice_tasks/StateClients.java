package day13_practice_tasks;

public class StateClients {
    public static void main(String[] args) {

        Virginia virginia = new Virginia("Virginia", "VA", "democrats",
                "Jason Mason", "Bill Bali", 4_890_000);
        System.out.println(virginia);
        virginia.partyMembersMeeting();
        virginia.votes();
        virginia.setNickNames("Mother of");
        System.out.println(virginia.getNickNames());
        System.out.println(virginia.getSenator());



        System.out.println("----------------------------------------");

        California california = new California("California", "CA", "democrats",
                "Robert Gover", "Maya Power", 21_450_000);
        System.out.println(california);
        california.celebrates();
        System.out.println(california.capital);
        System.out.println(california.getAbbreviation());
        california.votes();

        System.out.println("----------------------------------------");

        Texas texas = new Texas("Texas", "TX", "democrats",
                "John Phino", "Mark Polon", 17_123_546);
        System.out.println(texas);
        texas.howManyCounty();
        System.out.println(texas.getGovernor());
        texas.debates();
        System.out.println(texas.getAbbreviation());

        System.out.println("----------------------------------------");

        Florida florida = new Florida("Florida", "FL", "democrats",
                "Gina Polaris", "John Smith", 31_001_006);
        System.out.println(florida);
        System.out.println(florida.averageTemperature);
        florida.festivals();
        System.out.println(florida.getPopulation());


    }
}
