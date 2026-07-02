import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        

        String[] promotionStudents = new String[27]; 
        
        // Populating at least 3 elements
        promotionStudents[0] = "Alice";
        promotionStudents[1] = "Bob";
        promotionStudents[2] = "Charlie";
        
        System.out.println("Promotion 27 Students:");
        for (int i = 0; i < promotionStudents.length; i++) {
            if (promotionStudents[i] != null) {
                System.out.println(promotionStudents[i]);
            }
        }
        
        System.out.println(); // Blank line for spacing
        

        ArrayList<String> dailyTasks = new ArrayList<>();
        
        // Populating at least 3 elements
        dailyTasks.add("Attend class");
        dailyTasks.add("Complete assignment");
        dailyTasks.add("Study Java");
        
        System.out.println("Daily Tasks:");
        // Loop to print each task on a new line
        for (String task : dailyTasks) {
            System.out.println(task);
        }
    }
}