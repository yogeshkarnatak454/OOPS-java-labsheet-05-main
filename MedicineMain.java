class Medicine {
    String medicineName;
    String batchNo;
    double price;

    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName
                + " | Batch: " + batchNo
                + " | Price: " + price);
    }
}

public class MedicineMain {
    public static void main(String[] args) {
        Medicine m1 = new Medicine("Paracetamol", "B1001", 25.50);
        Medicine m2 = new Medicine("Amoxicillin", "B2002", 80.00);

        m1.displayMedicine();
        m2.displayMedicine();
    }
}