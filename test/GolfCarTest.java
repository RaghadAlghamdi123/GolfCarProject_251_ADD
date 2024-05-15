/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aseel
 */
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
       // Define current and destination locations
        String current = "library";
        String destination = "Cafeteria";

        // Call the method under test
        String actualOutput = car.estimateTimep(current, destination);

        // Define the expected output
        String expectedOutput = "Please wait, the driver will come within 03 minutes and 49 seconds\n\nIn the car " +
                                "distance from " + current + " to " + destination + ": 300 km\n" +
                                "Estimated time to arrival: 03 minutes and 38 seconds";

        // Assert that the output matches the expected output
        assertEquals(expectedOutput, actualOutput);    }
    
    
    
    
    
    

    @Test
    public void testEstimateTime() {
        // Test case for a distance of 200 km
        int distance = 200;
        // Expected output considering the adjustment for distance greater than 100 km
        String expectedOutput = "03 minutes and 32 seconds";
        assertEquals(expectedOutput, car.estimateTime(distance));
    }

//    @Test
//    public void testPrintETA() {
//        System.out.println("printETA");
//        Location pickupLocation = null;
//        GolfCar instance = null;
//        instance.printETA(pickupLocation);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    @Test
//    public void testNotifyDriverArrival() {
//        System.out.println("notifyDriverArrival");
//        Location pickupLocation = null;
//        GolfCar instance = null;
//        instance.notifyDriverArrival(pickupLocation);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
