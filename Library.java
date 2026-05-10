import java.util.Scanner;
class Book{
    String Name;
    boolean isIssued;
    static int totalbooks=0;

    Book(String Name){
        this.Name=Name;
        this.isIssued=false;
        totalbooks ++;

    }
    void issueBook()
    {
        if(!isIssued)
        {
            isIssued=true;
            System.out.println("Book" +Name + "Has been issued");
        }
        else
        {
            System.out.println("Book" +Name + "Has not issued");
        }
    }
    void returnBook()
    {
        if(isIssued)
        {
            isIssued=false;
            System.out.println("Book" +Name + "Has been returned");
        }
        else
        {
            System.out.println("Book" +Name + "was not issued");
        }
    }
    void displayBook()
    {
        System.out.println(Name + "|" +(isIssued ?"Issued" : "Available"));
    }
    static void displaytotalBooks()
    {
        System.out.println("Total available books:" +totalbooks);
    }
    
}

public class Library {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Book[]Library = new Book[5];
        int count=0;
        
        while(true)
        {
            System.out.println("\n Library Management System");
            System.out.println("1-add Book");
            System.out.println("2-Issue Book");
            System.out.println("3-return Book");
            System.out.println("4-view Books");
            System.out.println("5-check totalbooks");
            System.out.println("6-Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter Book name:");
                    String Name = sc.nextLine();
                    Library[count] = new Book(Name);
                    count ++;
                    System.out.println("Book added successfully"); 
                    break;
                case 2:
                    System.out.println("Enter Book number to Issue(1-" + count +"):");
                    int issueno=sc.nextInt();
                    Library[issueno-1].issueBook();
                    break;
                case 3:
                    System.out.println("Enter Book number to Issue(1-" + count +"):");
                    int returnno=sc.nextInt();
                    Library[returnno-1].returnBook();
                    break;
                case 4:
                    System.out.println("\n library books");
                    for(int i=0;i<count;i++)
                    {
                        System.out.println((i+1)+ " ");
                        Library[i].displayBook();
                    }
                    break;
                case 5:
                    Book.displaytotalBooks();
                    break;
                case 6:
                    System.out.println("Exit");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
    
}
