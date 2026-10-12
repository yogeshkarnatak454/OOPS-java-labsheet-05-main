class Medicine {
    String medicineName;
    int ageLimit;

    Medicine(String medicineName, int ageLimit) {
        this.medicineName = medicineName;
        this.ageLimit = ageLimit;
    }

    String checkEligibility(int patientAge) {
        String result;

        if (patientAge >= ageLimit) {
            result = "Eligible";
        } else {
            result = "Not Eligible";
        }

        return result;
    }
}

public class EligibilityMain {
    public static void main(String[] args) {
        Medicine medicine = new Medicine("Cough Syrup", 18);

        System.out.println(medicine.medicineName
                + " for age 25: " + medicine.checkEligibility(25));

        System.out.println(medicine.medicineName
                + " for age 12: " + medicine.checkEligibility(12));
    }
}