package day40_CustomClassPractice;

public class BOfA {


    public static void main(String[] args) {

        BankAccount Dawud = new BankAccount();
        Dawud.setAccountInfo("Saving","Dawud Abduwali","12333444556");


        Dawud.getAccountInfo();

        Dawud.deposit(1000);

        Dawud.checkBalance();

        Dawud.withdraw(1559);

        Dawud.checkBalance();





    }

}
