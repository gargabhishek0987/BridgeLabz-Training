
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
public class GetClassInformation {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the class name");
        String classNAme = sc.nextLine();



        Class<?> cl = Class.forName(classNAme);
        System.out.println("Class name "+cl.getName());

       Constructor<?>[] constructor = cl.getDeclaredConstructors();
       for(int i=0;i<constructor.length;i++){
        System.out.println("Constructors avai "+constructor[i]);
       }

       
       Field[] fields = cl.getDeclaredFields();
       for(int i=0;i<fields.length;i++){
        System.out.println("Fields avai "+fields[i]);
       

        Method[] methods = cl.getDeclaredMethods();
        for(int j=0;j<methods.length;j++){
            System.out.println("Methods avai "+methods[j]);
           }

    }

    
    }}
