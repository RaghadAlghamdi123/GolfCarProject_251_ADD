
class GolfCar {
   private String numSeats;
 private static  String platenum;

   

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
    
    
    // Method to calculate ETA and print for user and driver
    public   void printETA(Location pickupLocation) {
        // Dummy calculation of ETA (in minutes)
        int etaMinutes = (int) (Math.random() * 30) + 15; // Random value between 15 and 45 minutes
        
        // ETA in hours and minutes
       
        int minutes = etaMinutes % 60;
        
        // ETA as string
        String etaString =  minutes + " minutes";
        
        // Print ETA for user
        System.out.println("\n--------------------------------------- Student screen-----------------------------------------------");
        System.out.println("Estimated time of arrival for student: " + etaString);
        System.out.println("Car plate number: " +platenum);
        
        // Print ETA for driver
         System.out.println("\n--------------------------------------- Driver screen-----------------------------------------------");
        System.out.println("Estimated time of arrival for driver: " + etaString);
        System.out.println("Pickup location: " + pickupLocation.getAdress());
        
    }
    
    public  void notifyDriverArrival( Location  pickupLocation) {
    
                         System.out.println("\n--------------------------------------- Student screen-----------------------------------------------");
        
        
      
                System.out.println("Driver will arrive in 2 minutes at " + pickupLocation.getAdress());
          
        
        
                System.out.println("Driver has arrived at " + pickupLocation.getAdress());
           

        
        
    }
    
    
    
    // Static method to calculate ETA and print for user and driver based on destination location
    public  void printDestinationETA(Location destination) {
        // Dummy calculation of ETA (in minutes)
        int etaMinutes = (int) (Math.random() * 60) + 30; // Random value between 30 and 90 minutes
        
        // ETA in hours and minutes
       
        int minutes = etaMinutes % 60;
        
        // ETA as string
        String etaString =  minutes + " minutes";
        
        // Print ETA for user
        System.out.println("Estimated time of arrival for student to destination: " + etaString);
        System.out.println("Car plate number: " + platenum);
        
        // Print ETA for driver
                 System.out.println("\n--------------------------------------- Driver screen-----------------------------------------------");

        System.out.println("Estimated time of arrival for driver to destination: " + etaString);
        System.out.println("Destination location: " + destination.getAdress());
                

    }
    
    
    
}



