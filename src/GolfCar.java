
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
       
       
        
        // ETA in hours and minutes
       
       
        
        // ETA as string
        
        
        // Print ETA for user
        System.out.println("--------------------------------------- Student screen-----------------------------------------------");
        System.out.println("Estimated time of arrival for student: 12 minutes ");
        System.out.println("Car plate number: " +platenum);
        
        // Print ETA for driver
         System.out.println("--------------------------------------- Driver screen-----------------------------------------------");
        System.out.println("Estimated time of arrival for driver: 12 minutes ");
        System.out.println("Pickup location: " + pickupLocation.getAdress());
        
    }
    
    public  void notifyDriverArrival( Location  pickupLocation) {
    
                         System.out.println("--------------------------------------- Student screen-----------------------------------------------");
        
        
      
                System.out.println("Driver will arrive in 2 minutes at " + pickupLocation.getAdress());
          
        
        
                System.out.println("Driver has arrived at " + pickupLocation.getAdress());
           

        
        
    }
    
    
    
    // Static method to calculate ETA and print for user and driver based on destination location
    public  void printDestinationETA(Location destination) {
        // Dummy calculation of ETA (in minutes)
       
        
        // Print ETA for user
        System.out.println("Estimated time of arrival for student to destination: 10 minutes");
        System.out.println("Car plate number: " + platenum);
        
        // Print ETA for driver
                 System.out.println("--------------------------------------- Driver screen-----------------------------------------------");

        System.out.println("Estimated time of arrival for driver to destination: 10 minutes");
        System.out.println("Destination location: " + destination.getAdress());
                

    }
    
    
    
}



