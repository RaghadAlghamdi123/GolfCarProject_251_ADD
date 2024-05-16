
import java.io.ByteArrayOutputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class GolfCarTest {

    GolfCar car;
    ByteArrayOutputStream outContent;
    Location pickupLocation;
    Location DestinationLocation;
    String[] locations;
    int[] distances;

    public GolfCarTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        car = new GolfCar("4", "2345");
        outContent = new ByteArrayOutputStream();

        locations = new String[]{"library", "College of Designs", "Cafeteria"};
        distances = new int[]{500, 300, 200};

    }

    @After
    public void tearDown() {
    }

@Test
public void testEstimateTimep() {
    String current = "library";
    String destination = "cafeteria";  // Make sure the case sensitivity is correct

    int distanceWaiting = 500; // Correct distance for 'library'
    int distanceInCar = 300;   // Adjusted for correct understanding of indices

    String expectedOutput = "Please wait, the driver will come within " + car.estimateTime(distanceWaiting) +
                            "\n\nIn the car " +
                            "distance from " + current + " to " + destination + ": " + distanceInCar + " km\n" +
                            "Estimated time to arrival: " + car.estimateTime(distanceInCar);

    String actualOutput = car.estimateTimep(current, destination);
    assertEquals(expectedOutput, actualOutput);
}


    @Test
    public void testEstimateTime() {
        // Test case for a distance of 200 km
        int distance = 200;
        // Expected output considering the adjustment for distance greater than 100 km
        String expectedOutput = "03 minutes and 32 seconds";
        assertEquals(expectedOutput, car.estimateTime(distance));
    }
}