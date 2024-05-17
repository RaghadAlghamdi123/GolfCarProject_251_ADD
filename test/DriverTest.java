/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
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
public class DriverTest {

    Driver driver = new Driver(110786, "Fatema");

    public DriverTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAcceptOrRejectOrder() {
        // Set up the test data
        Location currentLocation = new Location("Library");
        Location destinationLocation = new Location("College of Designs");
        Order order = new Order(currentLocation, destinationLocation, "2");
        String input = "yes\n";
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

        // Redirect System.out to capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Call the method to test
        boolean result = driver.AcceptOrRejectOrder(order, scanner);

        // Restore System.out
        System.setOut(originalOut);

        // Assert the result
        assertTrue(result);
    }

}
