// UC16: Sort Passenger Bogie Capacities using Bubble Sort

class PassengerBogieSorter {

    // Bubble Sort Method
    public static void sortCapacities(int[] capacities) {
        int n = capacities.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap logic
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    // Utility method to print array
    public static void display(int[] capacities) {
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
        System.out.println();
    }
}

// Main Application
public class TrainConsistManagement {
    public static void main(String[] args) {

        // Sample passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        PassengerBogieSorter.display(capacities);

        // Perform Bubble Sort
        PassengerBogieSorter.sortCapacities(capacities);

        System.out.println("After Sorting:");
        PassengerBogieSorter.display(capacities);

        // Additional test scenarios
        System.out.println("\n--- Additional Test Cases ---");

        int[] alreadySorted = {24, 56, 60, 70, 72};
        PassengerBogieSorter.sortCapacities(alreadySorted);
        PassengerBogieSorter.display(alreadySorted);

        int[] duplicates = {72, 56, 56, 24};
        PassengerBogieSorter.sortCapacities(duplicates);
        PassengerBogieSorter.display(duplicates);

        int[] single = {50};
        PassengerBogieSorter.sortCapacities(single);
        PassengerBogieSorter.display(single);

        int[] allEqual = {40, 40, 40};
        PassengerBogieSorter.sortCapacities(allEqual);
        PassengerBogieSorter.display(allEqual);

        System.out.println("\nProgram continues after sorting...");
    }
}