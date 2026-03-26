import java.util.ArrayList;
import java.util.List;

// Defining a custom Bogie class to hold multiple attributes
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("%-15s | Capacity: %d seats", name, capacity);
    }
}

public class TrainManagement {
    public static void main(String[] args) {
        // 1. LIST: Creating a list to store custom Bogie objects
        List<Bogie> passengerBogies = new ArrayList<>();

        System.out.println("--- Railway Capacity Planning System ---");

        // 2. ADD: Populating the list with different coach types
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair Car", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("General", 90));

        System.out.println("Status: Bogies registered for analysis.");
        System.out.println("\nUnsorted Consist:");
        passengerBogies.forEach(System.out::println);

        // 3. COMPARATOR: Defining custom sorting logic (Descending Order: High to Low)
        // We use a Lambda expression for concise comparison logic
        passengerBogies.sort((b1, b2) -> Integer.compare(b2.capacity, b1.capacity));

        // 4. DISPLAY: Showing the results after sorting
        System.out.println("\nSorted Consist (Highest to Lowest Capacity):");
        System.out.println("---------------------------------------------");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        System.out.println("\nNote: Sorting helps administrators prioritize high-capacity coaches.");
    }
}