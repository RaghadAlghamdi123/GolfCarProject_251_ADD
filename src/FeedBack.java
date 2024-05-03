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
    private int feedback_Id;
    private String feedback;
    private int rating;

    public FeedBack(String feedback) {
        this.feedback = feedback;
    }

    public FeedBack(int rating) {
        this.rating = rating;
    }

    public int getFeedback_Id() {
        return feedback_Id;
    }

    public void setFeedback_Id(int feedback_Id) {
        this.feedback_Id = feedback_Id;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
}
