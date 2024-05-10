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
      Location pickupLocation;
       GolfCar car ;
       ByteArrayOutputStream outContent;
       Location DestinationLocation;
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
         pickupLocation = new Location("123");
        car = new GolfCar(4, "2345");
         outContent = new ByteArrayOutputStream();
         DestinationLocation=new Location("134");
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetNumSeats() {
         assertEquals(4, car.getNumSeats());
        
    }

    @Test
    public void testSetNumSeats() {
        // Set a new value for numSeats
        car.setNumSeats(6);

        // Test that the value was set correctly
        assertEquals(6, car.getNumSeats());
    }

    @Test
    public void testGetPlatenum() {
        
        assertEquals("2345", car.getPlatenum());
    }

    @Test
    public void testSetPlatenum() {
        car.setPlatenum("5678");

        // Test that the value was set correctly
        assertEquals("5678", car.getPlatenum());
    }

    @Test
    public void testPrintETA() {
        // Prepare test data
       
        
        // Redirect standard output to capture printed messages
       
        System.setOut(new PrintStream(outContent));
        
        // Call the method to be tested
        car.printETA(pickupLocation);
        
        // Define the expected result
        String expectedResult = "--------------------------------------- Student screen-----------------------------------------------"+System.getProperty("line.separator");
        expectedResult += "Estimated time of arrival for student: 12 minutes "+System.getProperty("line.separator");
        expectedResult += "Car plate number: 2345"+System.getProperty("line.separator");
        expectedResult += "--------------------------------------- Driver screen-----------------------------------------------"+System.getProperty("line.separator");
        expectedResult += "Estimated time of arrival for driver: 12 minutes "+System.getProperty("line.separator");
        expectedResult += "Pickup location: 123"+System.getProperty("line.separator");
        
        // Assert that the printed output matches the expected result
        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testNotifyDriverArrival() {
        System.setOut(new PrintStream(outContent));
        car.notifyDriverArrival(pickupLocation);
         String expectedResult = "--------------------------------------- Student screen-----------------------------------------------"+System.getProperty("line.separator");
        expectedResult += "Driver will arrive in 2 minutes at 123"+System.getProperty("line.separator");
        expectedResult += "Driver has arrived at 123"+System.getProperty("line.separator");
        
        // Assert that the printed output matches the expected result
        assertEquals(expectedResult, outContent.toString());
        
    }

    @Test
    public void testPrintDestinationETA() {
       System.setOut(new PrintStream(outContent));
       car.printDestinationETA(DestinationLocation);
       String expectedResult = "Estimated time of arrival for student to destination: 10 minutes"+System.getProperty("line.separator");
        expectedResult += "Car plate number: 2345"+System.getProperty("line.separator");
        expectedResult += "--------------------------------------- Driver screen-----------------------------------------------"+System.getProperty("line.separator");
        expectedResult += "Estimated time of arrival for driver to destination: 10 minutes"+System.getProperty("line.separator");
        expectedResult += "Destination location: 134"+System.getProperty("line.separator");
                assertEquals(expectedResult, outContent.toString());

    }
    
}
