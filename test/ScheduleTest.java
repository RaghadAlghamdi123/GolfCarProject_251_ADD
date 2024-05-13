/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Time;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScheduleTest {
   
    private Schedule schedule;
    private Time startTime;
    private Time endTime;

    @Before
    public void setUp() {
        // Create Time instances
        startTime = Time.valueOf("08:00:00");
        endTime = Time.valueOf("17:00:00");
        // Initialize Schedule instance with start and end times
        schedule = new Schedule(startTime, endTime);
    }

    /**
     * Test of getStart_time method, of class Schedule.
     */
    @Test
    public void testGetStart_time() {
        assertEquals("Testing getStart_time", startTime, schedule.getStart_time());
    }

    /**
     * Test of setStart_time method, of class Schedule.
     */
    @Test
    public void testSetStart_time() {
        Time newStartTime = Time.valueOf("09:00:00");
        schedule.setStart_time(newStartTime);
        assertEquals("Testing setStart_time", newStartTime, schedule.getStart_time());
    }

    /**
     * Test of getEnd_time method, of class Schedule.
     */
    @Test
    public void testGetEnd_time() {
        assertEquals("Testing getEnd_time", endTime, schedule.getEnd_time());
    }

    /**
     * Test of setEnd_time method, of class Schedule.
     */
    @Test
    public void testSetEnd_time() {
        Time newEndTime = Time.valueOf("18:00:00");
        schedule.setEnd_time(newEndTime);
        assertEquals("Testing setEnd_time", newEndTime, schedule.getEnd_time());
    }

    /**
     * Test of viewGolfWorkingHourSchedule method, of class Schedule.
     * This test will require output capture to assert correct behavior.
     */
    @Test
    public void testViewGolfWorkingHourSchedule() {
        // Redirect System.out to capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Schedule.viewGolfWorkingHourSchedule();

        // Example assertion to check part of the output
        assertTrue("Output should contain 'Working Hours Schedule for Golf Cars:'",
                   outContent.toString().contains("Working Hours Schedule for Golf Cars:"));
       
        // Reset System.out to its original
        System.setOut(System.out);
    }
}
