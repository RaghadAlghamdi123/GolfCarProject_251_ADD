

import java.util.Scanner;

public class GolfCar1 {
    
    
    
    
    
    
    
    
public static void main(String[] args) {
    
Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String studentName = scanner.next();
        System.out.print("Enter your Id: ");
        int stuId= scanner.nextInt();
        Student student;
        student = new Student (stuId ,studentName);
        System.out.print("Enter number of seats: ");
        int numberOfSeats = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter current location: ");
        String currentLocation = scanner.nextLine();

        System.out.print("Enter destination location: ");
        String destination = scanner.nextLine();

        Location current = new Location(currentLocation);
        Location dest = new Location(destination);

        Order order = student.RequestGolfCar( current,dest, numberOfSeats);

        System.out.println("Order sent to driver.");
        System.out.println("Waiting for driver response...");

        Driver driver = new Driver(110786,"Fatema");
        boolean isAccepted = driver.AcceptOrRejectOrder(order);
        GolfCar car= new GolfCar(12,"23453");

        if (isAccepted) {
            System.out.println("Order accepted by the driver.");
            order.OrderDetails(order);
            car.printETA(current);
           car.notifyDriverArrival(current);
           car.printDestinationETA(dest);
        } else {
            System.out.println("Order rejected by the driver.");
        }

        scanner.close();
      
        
        
        
        
        
        
        
        
    }

    
}

