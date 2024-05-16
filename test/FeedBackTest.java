import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class FeedBackTest {
    private final InputStream systemIn = System.in;
    private ByteArrayInputStream testIn;

    // Method to simulate user input
    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Before
    public void setUp() {
        System.setIn(systemIn);
    }

    @After
    public void tearDown() {
        System.setIn(systemIn);
    }

    @Test
    public void testRestrictedFeedback() {
        System.out.println("Testing Restricted Feedback:");

        // Test valid restricted feedback
        provideInput("2\n4\n"); // Simulate user input: choose restricted feedback and then provide valid input
        FeedBack feedback = createFeedbackInstance();
        feedback.promptForFeedback();
        int restrictedFeedback = feedback.getRestrictedFeedback();
        assertEquals(4, restrictedFeedback);

        // Test invalid restricted feedback
        provideInput("2\ninvalid\n5\n"); // Simulate user input: choose restricted feedback, provide invalid input, then valid input
        feedback = createFeedbackInstance();
        feedback.promptForFeedback();
        restrictedFeedback = feedback.getRestrictedFeedback();
        assertEquals(5, restrictedFeedback);
    }

    @Test
    public void testFreeFeedback() {
        System.out.println("Testing Free Feedback:");

        // Test valid free feedback
        provideInput("1\nGood experience\n"); // Simulate user input: choose free feedback and provide valid input
        FeedBack feedback = createFeedbackInstance();
        feedback.promptForFeedback();
        String freeFeedback = feedback.getFreeFeedBack();
        assertEquals("Good experience", freeFeedback);

        // Test invalid free feedback
        provideInput("1\n12345678901234567890123456789012345678901234567890123456789012345678901234567890\nFine\n"); // Simulate user input: choose free feedback, provide invalid input, then valid input
        feedback = createFeedbackInstance();
        feedback.promptForFeedback();
        freeFeedback = feedback.getFreeFeedBack();
        assertEquals("Fine", freeFeedback);
    }

    private FeedBack createFeedbackInstance() {
        return new FeedBack("1", new java.util.Scanner(System.in));
    }
}
