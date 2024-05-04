
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class Driver extends User {

    public Driver(int user_id,String name) {
              super(user_id,name);
    }
       public boolean AcceptOrRejectOrder(Order order)
    {
        
        // driver interaction
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Driver: " + name);
        System.out.println("------------------------------------");
        System.out.println("Received Order Details:");
        System.out.println("Number of Seats: " + order.getNumSeats());
        System.out.println("Current Location: " + order.getCurrentLocation().getAdress());
        System.out.println("Destination Location: " + order.getDestinationLocation().getAdress());
        System.out.println("------------------------------------");
        System.out.print("Accept the order? (yes/no): ");
        String response = scanner.nextLine();

        scanner.close();

        return response.equalsIgnoreCase("yes");
    
    }

 
    
}