public class Student {
    public int rollNumber;
    protected String name;
    private static int CGPA;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;

    }

    public int getCGPA() {
        return CGPA;
    }

    public void setCGPA(int CGPA) {

        this.CGPA = CGPA;
    }

    class postgraduateStudent extends Student {
        public postgraduateStudent(int rollNumber, String name, double CGPA) {
            super(rollNumber, name);
        }

        public void display() {
            System.out.println(rollNumber + name);
        }
    }

}