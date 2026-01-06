public class Appointement {
    String DoctorAvailable;
    String PatientAvailable;


    Appointement(String doctorAvailable , String patientAvailable){
        this.DoctorAvailable = doctorAvailable;
        this.PatientAvailable = patientAvailable;
    }
    public static void Availability(String DoctorAvailable , String PatientAvailable) throws AppointementNotAvailableException{
         if(DoctorAvailable!=null&& PatientAvailable!=null){
        System.out.println("Appointement is available");
    }
    else{
        throw new AppointementNotAvailableException("Appointement is not available");

    }
    }
    

}
