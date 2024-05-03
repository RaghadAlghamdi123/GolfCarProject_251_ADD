
import java.sql.Time;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */
public class Schedule {
    private Time start_time;
    private Time end_time;

    public Schedule(Time start_time, Time end_time) {
        this.start_time = start_time;
        this.end_time = end_time;
    }
    

    public Time getStart_time() {
        return start_time;
    }

    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }

    public Time getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Time end_time) {
        this.end_time = end_time;
    }
    
    
}
