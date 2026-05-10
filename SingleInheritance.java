import java.util.Scanner;
class Person {
    String name;
    int rollno;
    int std;

    void getpersondata(Scanner sc) {
        System.out.println("Enter name of student:");
        name = sc.next();
        System.out.println("Enter roll no of student:");
        rollno = sc.nextInt();
    }

    void displaypersondata() {
        System.out.println("Name of person: " + name);
        System.out.println("Roll no of person: " + rollno);
    }
}

class Student extends Person {
    void getstudentdata(Scanner sc) {
        getpersondata(sc);
    }
    void displaystudentdata() {
        displaypersondata();
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Student S1 = new Student();
         System.out.println("Enter details for Student:");
        S1.getstudentdata(sc);
        S1.displaystudentdata();
              
    }
}
