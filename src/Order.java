
class Order {

    private Location currentLocation;
    private Location destinationLocation;
    private String status="Accepted";
    private int numSeats;
    
    public Order(Location currentLocation, Location destinationLocation, int numSeats) {
        this.currentLocation = currentLocation;
        this.destinationLocation = destinationLocation;
        this.numSeats = numSeats;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Location getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(Location destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }
    
        public void cancellationOrder(Boolean isCancel ){
        if (isCancel ==true)
        {
          setStatus("Canceled");  
        }
    }
    
    public static void OrderDetails(Order order) {
        // Implement your scheduling logic here
        
        // Example: Print the order details
        System.out.println("-------------------");
        System.out.println("Order details: \n Number of seats: " + order.getNumSeats() +
                "\n Current location: " + order.getCurrentLocation().getAdress() +
                "\n Destination location: " + order.getDestinationLocation().getAdress());
        System.out.println("-------------------");
    }
    
}
