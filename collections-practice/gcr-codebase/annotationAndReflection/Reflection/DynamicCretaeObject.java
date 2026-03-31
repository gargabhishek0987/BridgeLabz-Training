class Student{
    private String name;
    private int id;
    public Student(){
        this.name = "Abhishek";
        this.id = 12;
    }
    public void display(){
        System.out.println("Name: " + name + 
        ", ID: " + id);
    }
}




public class DynamicCretaeObject {
    public static void main(String[] args)  {
       try{
        Class<?> cl = Class.forName("Student");
        Object obj = cl.getDeclaredConstructor().newInstance();
        Student st = (Student) obj;
        st.display();    }

        catch(Exception e){
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    
}
