class Hospital {
    public String hospitalName;
    public String hospitalCode;

    public Hospital() {
        hospitalName = "City Hospital";
        hospitalCode = "CH-01";
    }

    public void displayHospital() {
        System.out.println("Hospital: " + hospitalName
                + " | Code: " + hospitalCode);
    }
}

public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        System.out.println("Name (direct access): "
                + hospital.hospitalName);

        System.out.println("Code (direct access): "
                + hospital.hospitalCode);

        hospital.displayHospital();
    }
}