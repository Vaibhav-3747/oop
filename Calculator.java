import java.util.Scanner;
public class Calculator{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        String choice;
        System.out.println("1-Addition:");
        System.out.println("2-Substraction:");
        System.out.println("3-Multiplication:");
        System.out.println("4-Division:");
        System.out.println("5-Modulus:");
        System.out.println("6-Power:");
        try
        {
            do{
            System.out.println("Enter no of operation do you want to perform:");
            int opr=sc.nextInt();

            switch(opr){
                case 1:
                    System.out.println("Addition of two numbers is:"+(a+b));
                    break;
                case 2:
                    System.out.println("Substraction of two numbers is:"+(a-b));
                    break;
                case 3:
                    System.out.println("Multiplication of two numbers is:"+(a*b));
                    break;
                case 4:
                    if(b!=0)
                    {
                        System.out.println("Division of two numbers is:"+(a/b));
                    }
                    else
                    {
                         System.out.println("Division of two numbers is not possible");
                    }
                    break;
                case 5:
                    if(b!=0)
                    {
                         System.out.println("Modulus of two numbers is:"+(a%b));
                    }
                    else
                    {
                        System.out.println("modulus of two numbers is not possible:");
                    }
                    break;
                case 6:
                    System.out.println("power of given number is:"+Math.pow(a,b));
                    break;
                default:
                    System.out.println("Invalid");
            }
            System.out.println("Do you want to continue(yes/no):");
            choice=sc.next();
        }while(choice.equals("yes"));

        }
        catch(ArithmeticException e){
            System.out.println("Division and Modulus in not possible");
        }
         
    }
}
