package Practice;
import java.util.Scanner;
//Create a class Account with a private variable balance. Write public functions deposit(amount), withdraw(amount) and getBalance().
//Do not allow a withdrawal if the balance is not enough, and print a message instead. 
/**
 *
 * @author Prince
 */
public class Account {
    private double balance = 0;
    public void   deposit(double amount) {
        balance = balance + amount;
        System.out.println("amount is enter sucesfully");}
    public void withdraw(double amount) {
        if (amount<=balance) {
            balance = balance - amount;
            System.out.println("withdrawal sucessful");
        }else {
            System.out.println("unsufficient balance");
        } 
    }
    public double getbalace() {
        return balance;
    }
}


package Practice;
import java.util.Scanner;

/**
 *
 * @author Prince
 */
public class Main2 {
    public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  Account a1 = new Account();
  System.out.println("Enter deposit amount : ");
  double d1 = sc.nextDouble();
  a1.deposit(500);
  System.out.println("Enter withdraw amount");
  double w1 = sc.nextDouble();
  a1.withdraw(100);
  System.out.println("current balance :" + a1.getbalace());}
          
    }
    
}

    

