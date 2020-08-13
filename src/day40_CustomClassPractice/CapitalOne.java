package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount Ahmet = new BankAccount();
        BankAccount Viorel = new BankAccount();
        BankAccount Beslan = new BankAccount();
        BankAccount Waqar = new BankAccount();
        BankAccount Nurmamet = new BankAccount();

        Beslan.setAccountInfo("Checking","Beslan","455676332566");
        Ahmet.setAccountInfo("Checking","Ahmet","7899433667");
        Viorel.setAccountInfo("Checking","Viorel","7811345676");
        Nurmamet.setAccountInfo("Checking","Nurmamet","1345633667");
        Waqar.setAccountInfo("Checking","Waqar","6431578967");

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.addAll(Arrays.asList(Beslan,Ahmet,Viorel,Nurmamet,Waqar));

        for(BankAccount each : accounts){
            each.deposit(500);
            each.getAccountInfo();
        }

        accounts.get(3).deposit(1000);
        accounts.get(3).checkBalance();

        accounts.get(4).deposit(600);
        accounts.get(4).checkBalance();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        accounts.removeIf(p -> p.balance < 1000);
/*
        for(BankAccount each : accounts){
            each.getAccountInfo();
        }
*/
        System.out.println(accounts.size());



    }
}
