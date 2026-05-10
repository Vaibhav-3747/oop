import java.util.Scanner;
public class Hotelbooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floors = 2; 
        int rooms = 3;
        int[][] hotel = new int[floors][rooms]; // 0 = Available, 1 = Booked
        int choice;
        do {
            System.out.println("\nHotel Room Booking System");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel booking");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            switch (choice)
            {
                case 1:
                    System.out.println("Room Status (0 = Available, 1 = Booked)");
                    for (int i = 0; i < floors; i++)
                    {
                        System.out.print("Floor " + (i + 1) + ": ");
                        for (int j = 0; j < rooms; j++) 
                        {
                            System.out.print(hotel[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter floor (1-" + floors + "): ");
                    int f = sc.nextInt() - 1;
                    System.out.print("Enter room (1-" + rooms + "): ");
                    int r = sc.nextInt() - 1;
                    if (hotel[f][r] == 0)
                    {
                        hotel[f][r] = 1;
                        System.out.println("Room booked successfully.");
                    }
                    else
                    {
                        System.out.println("Room already booked.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Floor (1-" +floors + "): ");
                     f = sc.nextInt()-1;
                    System.out.print("Enter Room (1-"+ rooms +"): ");
                     r = sc.nextInt()-1;
                    if (hotel[f][r] == 1)
                    {
                        hotel[f][r] = 0;
                        System.out.println("Room canceled successfully!");
                    }
                    else
                    {
                        System.out.println("Cannot cancel booking of this room");
                    }
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        sc.close();
    }
}
