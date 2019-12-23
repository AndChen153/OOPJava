import java.util.Scanner;

public class encapTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Encapsulate bankAcct = new Encapsulate();

        System.out.println("bank account name: " + bankAcct.getName());
        System.out.println("bank account number: " + bankAcct.getNumber());
        System.out.println("bank account value: " + bankAcct.getValue());
        
    	System.out.print("Enter the ammount wished to add: ");
        int valueAdd = input.nextInt();
        bankAcct.addMoney(valueAdd);
    	System.out.println("new bank account value: " +bankAcct.getValue());
    }
}