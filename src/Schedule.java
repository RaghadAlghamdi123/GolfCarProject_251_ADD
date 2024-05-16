
import java.sql.Time;
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
    
    public static void viewGolfWorkingHourSchedule() {
       System.out.println("Working Hours Schedule for Golf Cars:");
        System.out.println("Time        | Activity");
        System.out.println("----------------------------------------------");
        
        // Start of shift
        printSchedule("7:30 am", "Start of shift");
        printAvailableCars("7:30 am", 2);
        
        // First service
        printSchedule("8:00 am", "First service");
        printAvailableCars("10:00 am", 3);
        
        // Break
        printSchedule("11:00 am", "Break");
        
        // Second service
        printSchedule("11:30 am", "Second service");
        printAvailableCars("12:30 pm", 5);
        
        // Fourth service
        printSchedule("12:30 pm", "Fourth service");
        printAvailableCars("1:30 pm", 3);
        
        // End of shift
        printSchedule("2:30 pm", "End of shift");
    }

    private static void printSchedule(String time, String activity) {
        System.out.printf("%-12s | %-30s%n", time, activity);
    }

    private static void printAvailableCars(String time, int availableCars) {
        System.out.printf("%-12s | Number of available cars: %d%n", time, availableCars);
    }  
    }
    
    

