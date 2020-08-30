package day48_Inheritance;

public class BofA {

    public static void main(String[] args) {

        BankAccount obj = new BankAccount("Igor","Rustemi");
        obj.setAccountHolder(obj.firstName+" "+obj.lastName);
        obj.setAccountNumber(2554565);
        obj.setBalance(50);

        obj.availableBalance();
        obj.deposit(500);

        obj.withdraw(125);
        obj.availableBalance();

        obj.withdraw(985);
        obj.availableBalance();

        System.out.println(obj);


    }


}
