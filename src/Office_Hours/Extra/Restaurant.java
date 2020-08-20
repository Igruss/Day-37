package Office_Hours.Extra;
/*
      Create a class called Restaurant
        Attributes:
        Owner (String), Location (String), numberOfStars (int)
        Servers (ArrayList of Server objects)
        Chefs (ArrayList of Chef objects)
        Actions: (all void methods)
        setInfo(): sets the owner, location, and number of stars with the given parameters
        hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
        hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList
        hireServer(String name, int employeeID, double hourlyRate, boolean fullTime): this overloaded version accept the given parameters/information of a Server and will add the given Server to the ArrayList of Servers
        hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
        hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList
        hireChef(String name, int employeeID, double hourlyRate, boolean fullTime): this overloaded version accept the given parameters/information of a Chef and will add the given Chef to the ArrayList of Chefs
        toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs along side the other information
        - Extra optional tasks
        terminateEmployee(String title, int employeeID): Create a method that will accept a String title which can only be "server" or "chef". If any other String is given it is invalid and the no action should be done (an error message can be given "invalid employee type"). Once you know which type of employee you are terminating use their given employeeID in the correct ArrayList type and remove them (you can give a message if you want: "$name was terminated").
        */

        import java.util.ArrayList;
        import java.util.Arrays;

public class Restaurant {

    String owner;
    String location;
    int numberOfStars;
    ArrayList<Server> servers = new ArrayList<>();
    ArrayList <Chef> chefs = new ArrayList<>();

    public void setInfo(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server) {
        servers.add(server);
    }

    public void hireServer(Server [] servers) {
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireServer(String name, int employeeID, double hourlyRate, boolean fullTime) {
        Server server = new Server();
        server.setInto(name, employeeID, hourlyRate, fullTime);
        servers.add(server);
    }

    public void hireChef(Chef chef) {
        chefs.add(chef);
    }

    public void hireChef(Chef [] chefs) {
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void hireChef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        Chef chef = new Chef();
        chef.setInto(name, employeeID, hourlyRate, fullTime);
        chefs.add(chef);
    }

    public String toString() {
        String s = "Owner: " + owner + ", Location: " + location + ", " + numberOfStars + " star restaurant. Number of servers: " +
                servers.size() + ", Number of chefs: " + chefs.size();
        return s;
    }

    public void terminateEmployee(String title, int employeeID) {
        switch (title) {
            case "server":
                servers.removeIf( p -> p.employeeID == employeeID );
                System.out.print("Employee terminated");
                break;
            case "chef":
                chefs.removeIf( p -> p.employeeID == employeeID );
                System.out.print("Employee terminated");
                break;
            default:
                System.out.print("invalid employee type");
        }

    }

    // This is a more manual approach for the terminateEmployee method, which lets you print the name, but is a little bit too much for this task. You can take a look if you want, but the above method will get the job done.

    public void terminateEmployee2(String title, int employeeID) {
        String name = "";
        switch (title) {
            case "server":
                for(int i=0; i < servers.size(); i++) {
                    if(servers.get(i).employeeID == employeeID) {
                        name = servers.get(i).name;
                        servers.remove(i);
                        break;
                    }
                }
                break;
            case "chef":
                for(int i=0; i < chefs.size(); i++) {
                    if(chefs.get(i).employeeID == employeeID) {
                        name = chefs.get(i).name;
                        chefs.remove(i);
                        break;
                    }
                }
                break;
            default:
                System.out.print("invalid employee type");
                return;
        }

        System.out.print(name + " was terminated");
    }

}