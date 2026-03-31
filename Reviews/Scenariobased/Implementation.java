import java.util.*;
public class Implementation {
    HashMap<Integer, Patient> patientMap = new HashMap<>();
    LinkedList<String> doctorList = new LinkedList<>();
    public LinkedList<String> appointementHistory = new LinkedList<>();

    public int addPatient(String name, int personId){
        Patient patient = new Patient(name, personId);
        patientMap.put(personId, patient);
        return personId;
    }
    public String addDoctor(String name, int personId){
        Doctor doctor = new Doctor(name, personId);
        doctorList.add(doctor.name);
        return doctor.name;
    }
    String updatePatient(int personId, String name){
        Patient patient = patientMap.get(personId);
        if (patient != null) {
            patient.name = name;
            patientMap.put(personId, patient);
            return patient.name;
        }
        return null;
    }

    void deletePatient(int personId){
        patientMap.remove(personId);
    }

    public String BookingAvailable(String doctor) throws AppointementNotAvailableException{
        if (!doctorList.contains(doctor)) {
            throw new AppointementNotAvailableException("Appointment not available");
        }
        
        return doctor;
        
    }
    public void calculateFee(Doctor doctor, Patient patient, HospitalService service){
        int fee = service.calculateConsultationFee(doctor, patient);
        System.out.println(fee);
    }

    public String BookingCancel(String Doctor){
        for (int i=0 ;i<doctorList.size(); i++){
            if (doctorList.get(i).equals(Doctor)){
                doctorList.remove(i);
                return "Appointment cancelled";
            }
        }
        return "Doctor not found";
    }

    void addAppointementHistory(String details){
        appointementHistory.add(details);
        if (appointementHistory.isEmpty()){
            System.out.println("No appointement history");
        } else {
            System.out.println(details);
        }
    }

    public static void main(String[] args){
        Implementation apply = new Implementation();
    apply.addDoctor("Dr. garg", 1);
     apply.addPatient("shivam", 10);
      apply.BookingAvailable("Dr.garg")
        apply.addAppointementHistory("Booked Dr.garg");
    }
}
