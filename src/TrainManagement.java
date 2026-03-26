import java.util.HashMap;
import java.util.Map;

public class TrainManagement {
    public static void main(String[] args) {
        // Create a HashMap to store Bogie Name (Key) and Capacity (Value)
        // HashMap provides O(1) performance for lookups and insertions
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        System.out.println("--- Railway Operational Mapping System ---");

        // 1. PUT: Associating bogie types with their seating/load capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair Car", 56);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("General", 90);

        System.out.println("Status: Bogie-Capacity mappings registered successfully.");

        // 2. ENTRYSET ITERATION: Displaying all mapped data
        System.out.println("\n--- Current Bogie Inventory (Type : Capacity) ---");

        // Iterating through entrySet() allows us to access both Key and Value efficiently
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " | Seats/Load: " + entry.getValue());
        }

        // 3. FAST LOOKUP: Retrieving capacity using a specific key
        String searchBogie = "Sleeper";
        if (bogieCapacityMap.containsKey(searchBogie)) {
            int capacity = bogieCapacityMap.get(searchBogie);
            System.out.println("\nQuery Result: The capacity for '" + searchBogie + "' is " + capacity + " units.");
        }

        // 4. UPDATE: Modifying an existing mapping
        System.out.println("\nAction: Updating 'General' coach capacity due to refit...");
        bogieCapacityMap.put("General", 100); // Overwrites the previous value of 90

        System.out.println("Updated Capacity for General: " + bogieCapacityMap.get("General"));
        System.out.println("\n--- Operational Mapping Complete ---");
    }
}