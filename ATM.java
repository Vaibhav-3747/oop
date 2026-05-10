import java.util.Scanner;

public class ATM {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double balance = 10000;
int choice;

        while (true) {
            
        System.out.println("===== ATM MACHINE =====");
        
        while (true) {            
try {
                
                System.out.println("===== ATM MACHINE =====");
System.out.println("\n1. Check Balance");
System.out.println("2. Deposit Money");
System.out.println("3. Withdraw Money");
System.out.println("4. Exit");

System.out.print("Enter your choice: ");
choice = sc.nextInt();

switch (choice) {
case 1:
System.out.println("Your current balance is: " + balance);
break;

case 2:
System.out.print("Enter amount to deposit: ");
double deposit = sc.nextDouble();

if (deposit <= 0) {
throw new IllegalArgumentException(
"Deposit amount must be greater than 0."
);
}

balance += deposit;
System.out.println("" + deposit + " deposited successfully.");
System.out.println("Updated balance: " + balance);
break;

case 3:
System.out.print("Enter amount to withdraw: ");
double withdraw = sc.nextDouble();

if (withdraw <= 0) {
throw new IllegalArgumentException(
"Withdrawal amount must be greater than 0."
);
}

if (withdraw > balance) {
throw new ArithmeticException(
"Insufficient funds! Withdrawal failed."
);
}

balance -= withdraw;
System.out.println("" + withdraw + " withdrawn successfully.");
System.out.println("Remaining balance: " + balance);
break;

case 4:
System.out.println("Thank you for using ATM!");
sc.close();
return;

default:
throw new IllegalArgumentException("Invalid menu choice! Please select between 1 to 4.");
}

}

catch (ArithmeticException e) {
System.out.println("Error: " + e.getMessage());
}

catch (IllegalArgumentException e) {
System.out.println("Error: " + e.getMessage());
}

catch (Exception e) {
System.out.println("Invalid input! Please enter numbers only.");
sc.nextLine();
}

            finally {
                System.out.println("Transaction process completed.");
            }
}
}
}
}
