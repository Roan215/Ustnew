package Personal;

import java.util.*;

public class StudentListAndSet {
    public static void main(String[] args) {
        // List
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");

        // Set
        Set<Integer> studentIds = new HashSet<>();
        studentIds.add(101);
        studentIds.add(102);
        studentIds.add(103);
        
        // Print List
        System.out.println("Student Names: " + studentNames);
        
        // Print Set
        System.out.println("Unique Student IDs: " + studentIds);
    }
}
