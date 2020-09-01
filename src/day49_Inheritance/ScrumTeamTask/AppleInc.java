package day49_Inheritance.ScrumTeamTask;


/*
 create a class called AppleInc:
                    1. create an array of Testers and store the testers info in your group
                    2. create an array of developers store the developers info in your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team

 */
public class AppleInc {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Rakhat", 30, 'F', 125000, 123456, "SDET");
        Tester tester2 = new Tester("Murat", 30, 'M', 110000, 1078836, "SDET");
        Tester tester3 = new Tester("Milovan", 33, 'M', 125000, 1523093, "SDET");

        Tester[] testers = {tester1, tester2, tester3};

        Developer developer1 = new Developer("Ebrahim", 31, 'M', 130000, 8765432, "SDET");
        Developer developer2 = new Developer("Ahmet", 31, 'M', 150000, 2256452, "Lead Developer");
        Developer developer3 = new Developer("Yardigan", 40, 'M', 130000, 3658430, "SDET");
        Developer developer4 = new Developer("Fatime", 31, 'F', 130000, 48895444, "SoftwareDesigner");

        Developer[] developers = {developer1, developer2, developer3, developer4};

        ScrumTeam scrum1 = new ScrumTeam(testers, developers);

        System.out.println(scrum1);


        Tester [] testers2 = {
                new Tester("Milos", 32, 'M', 150000, 77769, "SDET"),
               new Tester("Memetjan", 36, 'M', 130000, 8765432, "SDET"),
        };

        Developer [] developers2 = {
              new Developer("Kalbi",38,'F',230000,323434,"Senior developer"),
                new Developer("Fatih", 50, 'M', 124000, 2324242, "SDET"),
                new Developer("Aidana", 24, 'F', 160000, 123456, "softwareEngineer"),

        };
        ScrumTeam scrum2 = new ScrumTeam(testers2,developers2);

        System.out.println(scrum2);

        scrum2.removeDeveloper(323434);
        scrum1.removeTester(123456);


        ScrumTeam [] allScrumTeam = {scrum1,scrum2};
        System.out.println("=========================");
        System.out.println("Testers: ");
        for(ScrumTeam eachScrum : allScrumTeam){
            for(Tester eachTester : eachScrum.testers){
                System.out.println(eachTester.name + " "+eachTester.salary);
            }
        }

        System.out.println("=========================");
        System.out.println("Developers: ");
        for(ScrumTeam eachScrum : allScrumTeam){
            for(Developer eachDeveloper : eachScrum.developers){
                System.out.println(eachDeveloper.name + " "+ eachDeveloper.salary);
            }
        }








    }
    }


