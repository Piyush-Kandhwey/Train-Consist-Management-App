import java.util.Arrays;

// UC19: Binary Search for Bogie ID

class BogieBinarySearch {

    public static boolean binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            // Match found
            if (result == 0) {
                return true;
            }
            // Search in right half
            else if (result > 0) {
                low = mid + 1;
            }
            // Search in left half
            else {
                high = mid - 1;
            }
        }

        return false; // Not found
    }

    public static void displayResult(String key, boolean found) {
        if (found) {
            System.out.println("Bogie ID " + key + " FOUND in the consist.");
        } else {
            System.out.println("Bogie ID " + key + " NOT FOUND in the consist.");
        }
    }
}

// Main Application
public class TrainConsistManagement {
    public static void main(String[] args) {

        // Sorted bogie IDs (IMPORTANT precondition)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Optional safety: ensure sorting
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        System.out.println("\n---- Binary Search Tests ----");

        // Test Cases

        // 1. Found
        String key1 = "BG309";
        BogieBinarySearch.displayResult(key1,
                BogieBinarySearch.binarySearch(bogieIds, key1));

        // 2. Not Found
        String key2 = "BG999";
        BogieBinarySearch.displayResult(key2,
                BogieBinarySearch.binarySearch(bogieIds, key2));

        // 3. First Element
        String key3 = "BG101";
        BogieBinarySearch.displayResult(key3,
                BogieBinarySearch.binarySearch(bogieIds, key3));

        // 4. Last Element
        String key4 = "BG550";
        BogieBinarySearch.displayResult(key4,
                BogieBinarySearch.binarySearch(bogieIds, key4));

        // 5. Single Element
        String[] single = {"BG101"};
        String key5 = "BG101";
        BogieBinarySearch.displayResult(key5,
                BogieBinarySearch.binarySearch(single, key5));

        System.out.println("\nProgram continues after search...");
    }
}