package Notenoughmoney.example;
class NotenoughmoneyException extends Exception {
    public NotenoughmoneyException(String txt) {
        super(txt);
    }
}
class Account{
    String Owner,No_Account;
    int balance;
    public Account(String owner,String Acc_No,int balance){
        this.Owner=owner;
        this.No_Account=Acc_No;
        this.balance=balance;
    }

    public String getOwner() {return Owner;}
    public String getNo_Account() {return No_Account;}
    public int getbalance() {return balance;}

    public void setOwner(String nv) {this.Owner = nv;}
    public void setNo_Account(String nv) {this.No_Account = nv;}
    public void setbalance(int nv) {this.balance =nv;}

    public void Transfer(int amount) throws NotenoughmoneyException{
        if(balance>amount){
            balance-=amount;
        }
        else{
            throw new NotenoughmoneyException("insufficient funds");
        }
    }

}

public class moneymoney {
    public static void main(String[]args) throws NotenoughmoneyException {
        Account customer1 = new Account("lilian","344522287609",1000000);
        Account customer2 = new Account("hammed","566788092548",7000000);
        try{
            customer2.Transfer(2500000);
        }
        catch(NotenoughmoneyException ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("Amount left on your account is "+customer2.balance);
        }

    }

}
