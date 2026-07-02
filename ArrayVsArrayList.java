import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        

        String[] promotionStudents = new String[27]; 
        
        promotionStudents[0] = "Alice";
        promotionStudents[1] = "Bob";
        promotionStudents[2] = "Charlie";
        
        System.out.println("Promotion 27 Students:");
        for (int i = 0; i < promotionStudents.length; i++) {
            if (promotionStudents[i] != null) {
                System.out.println(promotionStudents[i]);
            }
        }
        
        System.out.println(); // 
        

        ArrayList<String> dailyTasks = new ArrayList<>();
        
       
        dailyTasks.add("Attend class");
        dailyTasks.add("Complete assignment");
        dailyTasks.add("Study Java");
        
        System.out.println("Daily Tasks:");
       
        for (String task : dailyTasks) {
            System.out.println(task);
        }
    }
}