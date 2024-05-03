
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
    
    
  
}
