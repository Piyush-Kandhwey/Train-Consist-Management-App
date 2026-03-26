import java.util.HashMap;
import java.util.Map;

public class TrainManagement {
    public static void main(String[] args) {
        // Create a HashMap to store Bogie Name as the Key and Capacity as the Value
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        System.out.println("--- Railway Operational Mapping System ---");

        // 1. PUT: Mapping bogie types to their specific capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair Car", 56);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("General", 90);

        System.out.println("Status: Bogie-Capacity pairs registered successfully.");

        // 2. ENTRYSET ITERATION: Displaying all mapped data
        System.out.println("\nListing All Bogie Capacities:");
        System.out.println("----------------------------------");

        // Iterating through the map using entrySet() for efficient access
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Seat Capacity: " + entry.getValue());
        }

        // 3. FAST LOOKUP: Retrieving a specific value using a key
        String searchKey = "Sleeper";
        if (bogieCapacityMap.containsKey(searchKey)) {
            int capacity = bogieCapacityMap.get(searchKey);
            System.out.println("\nQuery Result: The capacity of '" + searchKey + "' is " + capacity + " seats.");
        }

        System.out.println("\n--- Operational Mapping Complete ---");
    }
}