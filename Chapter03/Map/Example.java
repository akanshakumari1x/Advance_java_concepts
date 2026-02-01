
import java.util.*;

public class Example {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Akan");
        students.put(102, "Rahul");
        students.put(103, "Priya");

        // Access value using key
        System.out.println(students.get(102)); // Rahul

        // Check key
        System.out.println(students.containsKey(101)); // true

        // Remove
        students.remove(103);

        // Loop
        for(Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
