import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("2");
        list.add("3");
        list.add("2");

        // Sort using a custom comparator (descending order in this case)
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // descending order
            }
        });

        // Print sorted list
        System.out.println("Sorted list (custom order): " + list);
    }
}
