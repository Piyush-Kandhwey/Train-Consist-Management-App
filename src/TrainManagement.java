import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainManagement {
    public static void main(String[] args) {
        System.out.println("--- Railway Security & Validation System ---");

        // 1. DEFINE PATTERNS
        // Train ID: Starts with 'TRN-', followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";

        // Cargo Code: Starts with 'PET-', followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 2. COMPILE PATTERNS
        Pattern trainIdPattern = Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern = Pattern.compile(cargoCodeRegex);

        // 3. TEST DATA
        String[] testTrainIds = {"TRN-1234", "TRAIN12", "TRN-123", "TRN-99999"};
        String[] testCargoCodes = {"PET-AB", "PET-ab", "PET123", "PET-XYZ"};

        // 4. VALIDATE TRAIN IDs
        System.out.println("\n[Validating Train IDs]");
        for (String id : testTrainIds) {
            Matcher matcher = trainIdPattern.matcher(id);
            if (matcher.matches()) {
                System.out.println("✔ " + id + " : VALID Format");
            } else {
                System.out.println("❌ " + id + " : INVALID (Expected TRN-XXXX)");
            }
        }

        // 5. VALIDATE CARGO CODES
        System.out.println("\n[Validating Cargo Codes]");
        for (String code : testCargoCodes) {
            Matcher matcher = cargoCodePattern.matcher(code);
            if (matcher.matches()) {
                System.out.println("✔ " + code + " : VALID Format");
            } else {
                System.out.println("❌ " + code + " : INVALID (Expected PET-XX)");
            }
        }

        System.out.println("\nStatus: Validation process completed.");
    }
}