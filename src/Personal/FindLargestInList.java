package Personal;

import java.util.*;

public class FindLargestInList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 7, 3));
        System.out.println("Largest number: " + Collections.max(numbers));
    }
}

