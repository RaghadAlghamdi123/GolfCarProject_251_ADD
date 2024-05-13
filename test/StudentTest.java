/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author saral
 */
public class StudentTest {
    
    public StudentTest() {
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

    /**
     * Test of RequestGolfCar method, of class Student.
     */
  @Test
    public void testRequestGolfCar() {
        // Concatenate all inputs with line breaks to simulate user entering them one after another
        String simulatedUserInput = "5\n420\n500\n";
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
        Scanner scanner = new Scanner(System.in);
        // Assuming the 'requestGolfCar' method has been adjusted to accept a Scanner object
        // for testing purposes (this requires a small modification to your method)
        Order result = Student.requestGolfCar(scanner);
        // Assert that an Order object was returned
        assertNotNull(result);

        // Clean up by closing the scanner
        scanner.close();
    }
    
}
