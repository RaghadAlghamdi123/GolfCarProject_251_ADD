import java.util.Scanner;
public class GolfCar1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the system with some predefined data
        Driver driver = new Driver(110786, "Fatema");
        GolfCar car = new GolfCar("4", "23453");

        while (true) {
            System.out.println("\nWelcome to the Golf Car Booking App!");
            System.out.println("1. Request Golf Car");
            System.out.println("2. View Schedule");
            System.out.println("3. Add Feedback");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline left-over

            switch (choice) {
                case 1:
                    // Handle golf car request
                    Order order = Student.requestGolfCar(scanner);
                    boolean isAccepted = driver.AcceptOrRejectOrder(order, scanner);
                    if (isAccepted) {
                        System.out.println("Order accepted by the driver.");
                        System.out.println(car.estimateTimep(order.getCurrentLocation().getAdress(), order.getDestinationLocation().getAdress()));
                    } else {
                        System.out.println("Order rejected by the driver.");
                    }
                    break;
                case 2:
                    // View working hours schedule
                    Schedule.viewGolfWorkingHourSchedule();
                    break;
                case 3:
                    // Add feedback
                    FeedBack feedback = new FeedBack("1234", scanner);
                    feedback.promptForFeedback();
                    break;
                  
                case 4:
                    // Exit
                    System.out.println("Thank you for using our app!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
    }
}
