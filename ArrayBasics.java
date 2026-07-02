public class ArrayBasics{
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "Dave"};
        System.out.println("The first student is: " + students[0]);
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + students[i]);
        }
        System.out.println("-------------");
        System.out.println("Number of students: " + students.length);
    
    


    int[] Grade = {85, 90, 78, 92, 88};

    System.out.println("The Grade index: " + Grade[2] + Grade[3]);

    Grade[2] = 80;
    Grade [3] = 95;

    System.out.println("Updated Grade index:");
    for (int i = 0; i < Grade.length; i++) {
        System.out.println("Grade " + (i + 1) + ": " + Grade[i]);
    }
    }

}