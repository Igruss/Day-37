package day47_Encapsulations;

public class MyCredentials {

    public static void main(String[] args) {

        Credentials obj = new Credentials("Mike",34);

        obj.setUsername("Cybertek");
        obj.setPassword("CyberTek12345");

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());


    }
}
