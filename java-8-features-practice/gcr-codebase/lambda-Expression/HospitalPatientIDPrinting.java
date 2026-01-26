import java.util.ArrayList;
import java.util.List;

public class HospitalPatientIDPrinting {

    static class Patient {
        int id;
        String name;
        int age;

        Patient(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        int getId() {
            return id;
        }
    }

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient(101, "Rahul", 30));
        patients.add(new Patient(102, "Anita", 25));
        patients.add(new Patient(103, "Rohit", 40));
        patients.add(new Patient(104, "Sneha", 35));

        System.out.println("Patient IDs for Admin Verification:");

        for (Patient patient : patients) {
            printPatientId(patient);
        }
    }

    static void printPatientId(Patient patient) {
        System.out.println(patient.getId());
    }
}
