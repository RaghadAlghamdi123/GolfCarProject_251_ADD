import java.util.Scanner;

public class FeedBack {
    private String feedbackID;
    private String freeFeedback = null;
    private int restrictedFeedback = 0;
    private Scanner scanner;

    public FeedBack(String feedbackID, Scanner scanner) {
        this.feedbackID = feedbackID;
        this.scanner = scanner;
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
        if (feedback.length() <= 150 && feedback.matches("[a-zA-Z ]+")) {
            this.freeFeedback = feedback;
            displayConfirmation();
        } else {
            System.out.println("Invalid input. Free feedback should contain alphabets and spaces only, and not exceed 150 characters.");
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

    // Method to prompt user for feedback type and then enter feedback
    public void promptForFeedback() {
        System.out.println("Choose feedback type:");
        System.out.println("1. Free feedback");
        System.out.println("2. Restricted feedback (1 to 5)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                promptUserForFreeFeedback();
                break;
            case 2:
                promptUserForRestrictedFeedback();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Method to prompt user for free text feedback
    private void promptUserForFreeFeedback() {
        System.out.println("Please provide your feedback (max 150 characters, alphabets and spaces only): ");
        String feedback = scanner.nextLine();
        if (feedback.length() <= 150 && feedback.matches("[a-zA-Z ]+")) {
            setFreeFeedBack(feedback);
        } else {
            System.out.println("Invalid input. Free feedback should contain alphabets and spaces only, and not exceed 150 characters.");
            promptUserForFreeFeedback(); // Prompt again recursively
        }
    }

    // Method to prompt user for restricted feedback (numbers only)
    private void promptUserForRestrictedFeedback() {
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Please rate your experience (from 1 to 5): ");
            if (scanner.hasNextInt()) {
                int feedback = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                if (feedback >= 1 && feedback <= 5) {
                    setRestrictedFeedBack(feedback);
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Restricted feedback should be a number between 1 and 5.");
                }
            } else {
                scanner.next(); // Consume invalid input
                System.out.println("Invalid input. Restricted feedback should be a number between 1 and 5.");
            }
        }
    }
}
