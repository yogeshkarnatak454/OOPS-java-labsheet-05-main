class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("ID: " + patientId
                + " | Name: " + patientName
                + " | Age: " + age);
    }
}

class PatientManager {
    void displayAllPatients(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) {
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients = new Patient[5];

        patients[0] = new Patient(1, "Riya", 25);
        patients[1] = new Patient(2, "Karan", 40);
        patients[2] = new Patient(3, "Mohan", 67);
        patients[3] = new Patient(4, "Sita", 12);
        patients[4] = new Patient(5, "Arjun", 33);

        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}