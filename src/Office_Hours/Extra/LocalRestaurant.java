package Office_Hours.Extra;
   /*
        Create a class LocalRestaurant that has a main method with the following:
            - Make a Restaurant object
            - Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers
            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs
            - Print your whole restaurants information
            - After setting everything up spend some time interacting with the objects, try to call the methods of the objects, access the instance variables.
        - Extra optional tasks (Should still be done in the LocalRestaurant main method)
            - Find out the cost of all the employees (servers + chefs) by checking all of their hourly rates
            - Make two new ArrayLists that will separate all the employees (servers + chefs) by full time and part time. Their position of server or chef does not matter for these ArrayList, only their employment status
            - Make sure the Restaurant is staffed enough for the level of stars it is using the following requirements:
                5 stars: need at least 6 chefs and 10 servers
                4 stars: need at least 3 chefs and 7 servers
                3 stars: need at least 1 chefs and 4 servers
                - if the restaurant does not have the correct number of chefs or servers based on their number of stars you should print a message: "Need to hire more $chefs or $servers (maybe both). Otherwise you can print: "Up to standard"
	*/

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {

    public static void main(String[] args) {
        Restaurant kfc = new Restaurant();
        kfc.setInfo("Colonel Sanders", "Kentucky", 3);

        Server[] servers = {new Server(), new Server(), new Server(), new Server(), new Server()};
        servers[0].setInto("Nana", 30, 15.5, true);
        servers[1].setInto("Jimmy", 31, 17.0, true);
        servers[2].setInto("Kara", 42, 10.5, false);
        servers[3].setInto("Omar", 13, 9.5, false);
        servers[4].setInto("James", 20, 11.5, false);

        Chef[] chefs = {new Chef(), new Chef(), new Chef(), new Chef()};
        chefs[0].setInto("Taliah", 3, 18, true);
        chefs[1].setInto("Elliot", 32, 12, false);
        chefs[2].setInto("Edward", 28, 16.5, true);
        chefs[3].setInto("Sofia", 15, 13.5, false);

        kfc.hireServer(servers);
        kfc.hireChef(chefs);
        System.out.println(kfc);

        System.out.println("=============================================================================");

        // optional tasks:

        // cost of all employees

        double totalCostPerHour = 0;
        int runFor = Math.max(kfc.servers.size(), kfc.chefs.size());
        // this runFor variable will let use run one loop and still check all elements from
        // both ArrayLists with one cycle through the indexes.

        for (int i = 0; i < runFor; i++) {

            if (i < kfc.servers.size()) {
                totalCostPerHour += kfc.servers.get(i).hourlyRate;
            }

            if (i < kfc.chefs.size()) {
                totalCostPerHour += kfc.chefs.get(i).hourlyRate;
            }
        }

        System.out.println("The total cost per hour for the restaurant: " + totalCostPerHour);

        System.out.println("=============================================================================");

        /* For the second optional task about separating everyone by the employment status
         I realized while creating the solution that it wouldn't be possible for you to
         do it at this point because some OOP concepts would need to be used in order to store the
         Server and Chefs objects together into one ArrayList. I will still share a solution to this
         task, but it may not make complete sense at this moment because we need to cover
         some additional things
         */


        ArrayList<Server> allServers = new ArrayList<>(Arrays.asList(servers));
        ArrayList<Chef> allChefs = new ArrayList<>(Arrays.asList(chefs));
        allServers.removeIf(p -> !p.fullTime);
        allChefs.removeIf(p -> !p.fullTime);

        ArrayList<Object> allFullTime = new ArrayList<>();
        allFullTime.addAll(allServers);
        allFullTime.addAll(allChefs);
        System.out.println("All full time: " + allFullTime);


        allServers = new ArrayList<>(Arrays.asList(servers));
        allChefs = new ArrayList<>(Arrays.asList(chefs));
        allServers.removeIf(p -> p.fullTime);
        allChefs.removeIf(p -> p.fullTime);

        ArrayList<Object> allPartTime = new ArrayList<>();
        allPartTime.addAll(allServers);
        allPartTime.addAll(allChefs);
        System.out.println("All part time: " + allPartTime);


        System.out.println("=============================================================================");

        // Checking if the restaurant is staffed enough

        boolean enoughChefs = true;
        boolean enoughServers = true;

        switch (kfc.numberOfStars) {
            case 5:
                if(kfc.chefs.size() < 6) {
                    enoughChefs = false;
                }
                if(kfc.servers.size()  < 10) {
                    enoughServers = false;
                }
                break;
            case 4:
                if(kfc.chefs.size() < 3) {
                    enoughChefs = false;
                }
                if(kfc.servers.size()  < 7) {
                    enoughServers = false;
                }
                break;
            case 3:
                if(kfc.chefs.size() < 1) {
                    enoughChefs = false;
                }
                if(kfc.servers.size()  < 4) {
                    enoughServers = false;
                }
                break;
            default:
                System.out.println("Get your star number up!");

        }

        if(enoughChefs && enoughServers) {
            System.out.println("Up to standard");
        }

        if(!enoughChefs) {
            System.out.println("Hire more chefs");
        }

        if(!enoughServers) {
            System.out.println("Hire more servers");
        }

    }
}


