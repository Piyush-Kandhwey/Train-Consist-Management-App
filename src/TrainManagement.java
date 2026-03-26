import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return String.format("[%s : %s]", type, cargo);
    }
}

public class TrainManagement {
    public static void main(String[] args) {
        // 1. DATA SETUP: Creating a list of goods bogies
        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("Rectangular", "Coal"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("Rectangular", "Grain"));

        // Simulating a safety violation: Cylindrical carrying Coal
        // goodsConsist.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("--- Railway Safety Compliance Engine ---");
        System.out.println("Inspecting Consist: " + goodsConsist);

        // 2. STREAM VALIDATION: Enforcing Safety Rules
        // Rule: IF type is Cylindrical, THEN cargo MUST be Petroleum.
        boolean isSafe = goodsConsist.stream().allMatch(bogie -> {
            if (bogie.type.equalsIgnoreCase("Cylindrical")) {
                return bogie.cargo.equalsIgnoreCase("Petroleum");
            }
            return true; // Non-cylindrical bogies are safe by default in this rule
        });

        // 3. DISPLAY: Final Safety Status
        System.out.println("\nAction: Running Safety Protocol...");
        if (isSafe) {
            System.out.println("Result: [PASS] Train is safety compliant. Ready for departure.");
        } else {
            System.out.println("Result: [FAIL] SAFETY ALERT! Cylindrical bogies must only carry Petroleum.");
            System.out.println("Action: Train movement halted for cargo reassignment.");
        }

        System.out.println("\n--- End of Safety Report ---");
    }
}