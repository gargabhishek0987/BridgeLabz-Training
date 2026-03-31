public class Course {
    private String courseName;
    private int duration;
    private int fee;
    private static String instituteName;


    public Course(String courseName, int duration, int fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public  void displayCourseDetails() {
        System.out.println("Total courses " + courseName + duration + fee +instituteName);

    }
    public static void  updateInstituteName(String newName)
    {
        instituteName = newName;
}

}