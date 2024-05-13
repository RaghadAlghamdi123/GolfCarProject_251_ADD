import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import static org.junit.Assert.*;

public class FeedBackTest {

    private FeedBack feedback;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        feedback = new FeedBack("FB001");
        System.setOut(new PrintStream(outContent)); // Set up the stream to capture output
    }

    @Test
    public void testSetAndGetFreeFeedback() {
        String testFeedback = "Great service!";
        feedback.setFreeFeedback(testFeedback);
        assertEquals("Check free feedback value", testFeedback, feedback.getFreeFeedback());
        assertTrue("Output should contain 'Free Feedback set successfully.'",
                outContent.toString().contains("Free Feedback set successfully."));
        assertTrue("Output should include correct feedback retrieval message",
                outContent.toString().contains("Free Feedback: " + testFeedback));
    }

    @Test
    public void testSetAndGetRestrictedFeedback() {
        int testFeedback = 10;
        feedback.setRestrictedFeedback(testFeedback);
        assertEquals("Check restricted feedback value", testFeedback, feedback.getRestrictedFeedback());
        assertTrue("Output should include correct feedback retrieval message",
                outContent.toString().contains("Restricted Feedback: " + testFeedback));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null); // Reset the System.out after the tests
    }
}