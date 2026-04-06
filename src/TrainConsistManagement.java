import java.util.Arrays;

// UC17: Sort Bogie Names using Arrays.sort()

class BogieNameSorter {

    public static void sortBogieNames(String[] bogieNames) {
        // Built-in sorting (Dual-Pivot QuickSort / TimSort internally)
        Arrays.sort(bogieNames);
    }

    public static void display(String[] bogieNames) {
        System.out.println(Arrays.toString(bogieNames));
    }
}

// Main Application
public class TrainConsistManagement {
    public static void main(String[] args) {

        // Sample bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting:");
        BogieNameSorter.display(bogieNames);

        // Sorting using Arrays.sort()
        BogieNameSorter.sortBogieNames(bogieNames);

        System.out.println("After Sorting:");
        BogieNameSorter.display(bogieNames);

        // Additional test cases
        System.out.println("\n--- Additional Test Cases ---");

        String[] unsorted = {"Luxury", "General", "Sleeper", "AC Chair"};
        BogieNameSorter.sortBogieNames(unsorted);
        BogieNameSorter.display(unsorted);

        String[] alreadySorted = {"AC Chair", "First Class", "General"};
        BogieNameSorter.sortBogieNames(alreadySorted);
        BogieNameSorter.display(alreadySorted);

        String[] duplicates = {"Sleeper", "AC Chair", "Sleeper", "General"};
        BogieNameSorter.sortBogieNames(duplicates);
        BogieNameSorter.display(duplicates);

        String[] single = {"Sleeper"};
        BogieNameSorter.sortBogieNames(single);
        BogieNameSorter.display(single);

        System.out.println("\nProgram continues after sorting...");
    }
}