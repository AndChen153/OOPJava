//to demonstrate encapsulation
public class Encapsulate{
    
    private String bankAccountName = "john";
    private int bankAccountNumber = 38902934;
    private int bankAccountValue = 130000;

    //public method to return name
    public String getName(){
        return bankAccountName;
    }

    //public method to return bank account number
    public int getNumber(){
        return bankAccountNumber;
    }

    //public method to return bank account value
    public int getValue(){
        return bankAccountValue;
    }

    //public method to add money to bank account
    public void addMoney(int amount){
        bankAccountValue = bankAccountValue+amount;
    }

    //public method to change bank account name
    public void changeName(String newName){
        bankAccountName = newName;
    }
}