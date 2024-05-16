import java.util.Scanner;

public class GolfCar1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:  ");
        String studentName = scanner.next();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter your ID: ");
        int stuId = scanner.nextInt();
        
        Student student = new Student(stuId, studentName);
        scanner.nextLine(); // Consume the newline left-over
        
        Order order = student.requestGolfCar(scanner);
    
        
        Driver driver = new Driver(110786, "Fatema");
        boolean isAccepted = driver.AcceptOrRejectOrder(order, scanner);
        GolfCar car = new GolfCar("12", "23453"); 
        
        if (isAccepted) {
            System.out.println("Order accepted by the driver.");
            System.out.println(car.estimateTimep(order.getCurrentLocation().getAdress(), order.getDestinationLocation().getAdress()));
            FeedBack feedback = new FeedBack("1234", scanner);
            if (feedback.wantToProvideFeedback()) {
                feedback.promptForFeedback();
            } else {
                System.out.println("Thank you for your time!");
            }
            
            
        } else {
            System.out.println("Order rejected by the driver");
        }
        
        // Call the viewGolfWorkingHourSchedule() method
            Schedule.viewGolfWorkingHourSchedule();
        
        scanner.close(); // Closing the scanner at the end
    }
}

