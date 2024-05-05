/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class FeedBack {
     private String feedbackID;
    private String FreeFeedback;
    private int RestrictedFeedback;

    public FeedBack(String feedbackID) {
        this.feedbackID = feedbackID;
    }

    

    // Method to set Restricted feedback
    public void setRestrictedFeedback(int feedback) {
        this.RestrictedFeedback = feedback;
    }

    // Method to set free feedback
    public void setFreeFeedback(String feedback) {
       System.out.println("Free Feedback set successfully.");

        this.FreeFeedback = feedback;
        
    }

    // Getter for free feedback
    public String getFreeFeedback() {
        System.out.println("Feedback ID: " + feedbackID);
        System.out.println("Free Feedback: " + FreeFeedback);
        return FreeFeedback;
    }

    // Getter for restricted feedback
    public int getRestrictedFeedback() {
        System.out.println("Feedback ID: " + feedbackID);
        System.out.println("Restricted Feedback: " + RestrictedFeedback);
        return RestrictedFeedback;
    }
    
     // method to display confirmation for setting feedback
    private void displayConfirmation() {
        System.out.println("your feedback set successfully.");
     }
    
}
