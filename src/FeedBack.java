import java.util.Scanner;

public class FeedBack {
    private String feedbackID;
    private String freeFeedback = null;
    private int restrictedFeedback = 0;

    public FeedBack(String feedbackID) {
        this.feedbackID = feedbackID;
    }

    public void setRestrictedFeedBack(int feedback) {
        if (feedback >= 1 && feedback <= 5) {
            this.restrictedFeedback = feedback;
            displayConfirmation();
        } else {
            System.out.println("Invalid input. Restricted feedback should be a number between 1 and 5.");
        }
    }

    public void setFreeFeedBack(String feedback) {
        if (feedback.length() <= 150 && !feedback.matches(".*[$%^&*@].*")) {
            this.freeFeedback = feedback;
            displayConfirmation();
        } else {
            System.out.println("Invalid input. Free feedback should not exceed 150 characters and should not contain special characters.");
        }
    }

    public String getFreeFeedBack() {
        return freeFeedback;
    }

    public int getRestrictedFeedback() {
        return restrictedFeedback;
    }

    private void displayConfirmation() {
        System.out.println("Your feedback has been sent successfully.");
    }

    // Method to prompt user for free text feedback
    public void promptUserForFreeFeedback(Scanner scanner) {
        System.out.println("Please provide your feedback (max 150 characters, avoid special characters): ");
        String feedback = scanner.nextLine();
        setFreeFeedBack(feedback);
    }

    // Method to prompt user for restricted feedback (numbers only)
    public void promptUserForRestrictedFeedback(Scanner scanner) {
        System.out.println("Please rate your experience (from 1 to 5): ");
        int feedback = scanner.nextInt();
        setRestrictedFeedBack(feedback);
    }
}
