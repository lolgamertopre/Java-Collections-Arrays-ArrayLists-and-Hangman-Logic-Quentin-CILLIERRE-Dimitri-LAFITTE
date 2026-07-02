import java.util.ArrayList;
public class ArrayListBasics {
    public static void main(String [] args){
        ArrayList<String> courses = new ArrayList<>();
        
        courses.add("Python");
        courses.add("Java");
        courses.add("web development");
        
        System.out.println("Initial courses: " + courses);

        courses.add("DATA BASE");
        courses.remove ("Python");
        System.out.println("Updated courses: " + courses);

        ArrayList<Integer> temperature = new ArrayList<>();
        temperature.add(25);
        temperature.add(30);
        temperature.add(22);
        temperature.add(28);
        temperature.add(35);

        System.out.println("Temperature at index 1: " + temperature.get(1));
        temperature.set(1, 27);
        System.out.println("Updated temperature at index 1: " + temperature.get(1));
        System.out.println("Size of the list: " + temperature.size());
        System.out.println("Does list contain 35? " + temperature.contains(35));
    }
    
}
