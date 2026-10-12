class Pharmacy {
    String medicineName;
    double price;

    Pharmacy() {
        medicineName = "Paracetamol";
        price = 25.5;
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName
                + " | Price: " + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();

        System.out.println("Direct access: "
                + pharmacy.medicineName
                + " costs " + pharmacy.price);

        pharmacy.displayMedicine();
    }
}