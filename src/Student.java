
import java.util.Scanner;

class Student extends User {
  
        public Student(int user_id, String name)
    {
        super(user_id, name);
        
    }
    public static Order requestGolfCar(Scanner scanner) {
    System.out.print("Enter the number of seats: ");
    String numberOfSeats = scanner.next();
    scanner.nextLine(); // Consume the newline character

    System.out.print("Enter current location: (example: library , college of Designs , cafeteria ): ");
    String currentLocation = scanner.nextLine();

    System.out.print("Enter destination location: (example: library , college of Designs , cafeteria ): ");
    String destinationLocation = scanner.nextLine();

    Location current = new Location(currentLocation);
    Location dest = new Location(destinationLocation);
    Order order = new Order(current, dest, numberOfSeats);
    return order;
}
}



   

