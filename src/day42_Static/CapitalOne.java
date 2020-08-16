package day42_Static;

public class CapitalOne {

    public static void main(String[] args) {

        Tester [] testers ={new Tester(),new Tester(),new Tester()};
        testers[0].setInfo("Aalia",'F',12558,"Lead Tester",180000);
        testers[1].setInfo("Naz",'F',12559,"Tester",120000);
        testers[2].setInfo("Kalbinur",'F',12557,"Tester",110000);

        Developer [] developers = {new Developer(),new Developer(),new Developer(),new Developer(),new Developer()};
        developers[0].setInfo("Waqar",'M',25888,"Dev Lead",200000);
        developers[1].setInfo("Hamit",'M',25885,"Dev ",180000);
        developers[2].setInfo("Banu",'F',25886,"Dev ",150000);
        developers[3].setInfo("Vildan",'F',25883,"Dev ",120000);
        developers[4].setInfo("Amir",'M',25887,"Dev ",120000);

        ScrumTeam team1 = new ScrumTeam();
        team1.setInfo("Ramazan","Hamit","Ismail");
        team1.addTester(testers);
        team1.addDeveloper(developers);

        System.out.println(team1);

        System.out.println("================================");
        for(Tester each : team1.testers ){// each: every single testers in the scrum team
            System.out.println(each.name +" : $"+each.salary);
        }

        System.out.println("=====================================");

        for(Developer each : team1.developers){
            System.out.println(each.name +" : $"+each.salary);
        }

        System.out.println("=======================================");
        team1.removeTester(12588);
        team1.removeDeveloper(25888);
        team1.removeDeveloper(25883);
        System.out.println(team1);

        System.out.println("======================================");
        Developer dev1 =  new Developer();
        dev1.setInfo("Luisa", 'f', 2113L, "Dev Lead" , 500000);

        team1.addDeveloper(dev1);

        System.out.println(team1);



        ScrumTeam[] scrumTeams = {team1, new ScrumTeam(), new ScrumTeam()};
        /*
        print all developers and testers from scrum team
        find the maximum salary
         */

    }
}
