
class GolfCar {
    
   private String numSeats;
   private static  String platenum;

   private static final String[] locations = {"library", "college of Designs", "cafeteria"};
    private static final int[] distances = {500, 300, 200};

    
   

    public GolfCar(String numSeats, String platenum) {
        this.numSeats = numSeats;
        this.platenum = platenum;
    }
    public String getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(String numSeats) {
        this.numSeats = numSeats;
    }

    public String getPlatenum() {
        return platenum;
    }

    public void setPlatenum(String platenum) {
        this.platenum = platenum;
    }
public static String estimateTimep(String current, String destination) {
    // Check if the locations are in the arrays
    int currentIndex = -1;
    int destinationIndex = -1;
    for (int i = 0; i < locations.length; i++) {
        if (locations[i].equals(current)) {
            currentIndex = i;
        }
        if (locations[i].equals(destination)) {
            destinationIndex = i;
        }
    }

    if (currentIndex != -1 && destinationIndex != -1) {
        int distanceWaiting = distances[currentIndex];
        int distanceincar = Math.abs(distances[destinationIndex] - distances[currentIndex]);
        // Build the output string
        StringBuilder output = new StringBuilder();
        output.append("Please wait, the driver will come within ").append(estimateTime(distanceWaiting)).append("\n\nIn the car ");
        output.append("distance from ").append(current).append(" to ").append(destination).append(": ").append(distanceincar).append(" km\n");
        output.append("Estimated time to arrival: ").append(estimateTime(distanceincar));
        return output.toString();
    } else {
        return "Distance and estimated time cannot be determined for the provided locations.";
    }
}




   
 public static String estimateTime(int distance) {
    // Let's assume a constant speed of 60 km/h
    double speedKmPerHour = 60.0; // kilometers per hour
    double speedMetersPerSecond = speedKmPerHour * 1000 / 3600; // Convert speed to meters per second
    // Calculate the time using the formula: time = distance / speed
    double timeInSeconds = (double) distance / speedMetersPerSecond;
    // Calculate minutes and seconds
    int minutes = (int) (timeInSeconds / 60);
    int seconds = (int) (timeInSeconds % 60);
    // Adjust minutes and seconds to match the given distance
    if (distance > 100) {
        minutes += 3;
        seconds += 20;
    }
    // Format the adjusted time as "03 minutes and 20 seconds"
    return String.format("%02d minutes and %02d seconds", minutes, seconds);
}

 


















    
    
    
    
    
    
    
    
    
    
    
    
    
//    // Method to calculate ETA and print for user and driver
//    public   void printETA(Location pickupLocation) {
//       
//       
//        
//        // ETA in hours and minutes
//       
//       
//        
//        // ETA as string
//        
//        
//        // Print ETA for user
//        System.out.println("--------------------------------------- Student screen-----------------------------------------------");
//        System.out.println("Estimated time of arrival for student: 12 minutes ");
//        System.out.println("Car plate number: " +platenum);
//        
//        // Print ETA for driver
//         System.out.println("--------------------------------------- Driver screen-----------------------------------------------");
//        System.out.println("Estimated time of arrival for driver: 12 minutes ");
//        System.out.println("Pickup location: " + pickupLocation.getAdress());
//        
//    }
//    
//    public  void notifyDriverArrival( Location  pickupLocation) {
//    
//                         System.out.println("--------------------------------------- Student screen-----------------------------------------------");
//        
//        
//      
//                System.out.println("Driver will arrive in 2 minutes at " + pickupLocation.getAdress());
//          
//        
//        
//                System.out.println("Driver has arrived at " + pickupLocation.getAdress());
//           
//
//        
//        
//    }
//    
//    
//    
//    // Static method to calculate ETA and print for user and driver based on destination location
//    public  void printDestinationETA(Location destination) {
//        // Dummy calculation of ETA (in minutes)
//       
//        
//        // Print ETA for user
//        System.out.println("Estimated time of arrival for student to destination: 10 minutes");
//        System.out.println("Car plate number: " + platenum);
//        
//        // Print ETA for driver
//                 System.out.println("--------------------------------------- Driver screen-----------------------------------------------");
//
//        System.out.println("Estimated time of arrival for driver to destination: 10 minutes");
//        System.out.println("Destination location: " + destination.getAdress());
//                
//
//    }
    
    
    
}



