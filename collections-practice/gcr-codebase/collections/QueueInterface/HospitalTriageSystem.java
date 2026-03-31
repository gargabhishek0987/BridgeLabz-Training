package Collections.QueueInterface;

import java.util.PriorityQueue;
import java.util.Comparator;

class Patient {
    private String name;
    private int priority; 

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Patient{name='" + name + "', priority=" + priority + "}";
    }
}

public class HospitalTriageSystem {

    private PriorityQueue<Patient> triageQueue;

    public HospitalTriageSystem() {
       
        triageQueue = new PriorityQueue<>(Comparator.comparingInt(Patient::getPriority));
    }

    public void addPatient(String name, int priority) {
        Patient patient = new Patient(name, priority);
        triageQueue.offer(patient);
        System.out.println("Added patient to triage: " + patient);
    }

    public void treatNextPatient() {
        if (triageQueue.isEmpty()) {
            System.out.println("No patients in the triage queue.");
            return;
        }
        Patient nextPatient = triageQueue.poll(); 
        System.out.println("Treating patient: " + nextPatient.getName() + " (Priority: " + nextPatient.getPriority() + ")");
    }

    public int getQueueSize() {
        return triageQueue.size();
    }

    public boolean isQueueEmpty() {
        return triageQueue.isEmpty();
    }

    public static void main(String[] args) {
        HospitalTriageSystem triageSystem = new HospitalTriageSystem();


        triageSystem.addPatient("Sohil", 3); 
        triageSystem.addPatient("Tanuj", 1); 
        triageSystem.addPatient("Raj", 2); 
        triageSystem.addPatient("nikhil", 3);
        triageSystem.addPatient("Sparsh", 1);
        System.out.println("\nPatients in queue: " + triageSystem.getQueueSize());

        triageSystem.treatNextPatient(); 
        triageSystem.treatNextPatient(); 
        triageSystem.treatNextPatient();

        System.out.println("\nPatients in queue: " + triageSystem.getQueueSize());

        triageSystem.addPatient("Sohil", 4); // Less urgent
        triageSystem.addPatient("Tanuj", 2); // Serious condition

        triageSystem.treatNextPatient(); 
        triageSystem.treatNextPatient(); 
        triageSystem.treatNextPatient(); 
        triageSystem.treatNextPatient();

        triageSystem.treatNextPatient(); 

        System.out.println("\nIs queue empty? " + triageSystem.isQueueEmpty());
    }
}