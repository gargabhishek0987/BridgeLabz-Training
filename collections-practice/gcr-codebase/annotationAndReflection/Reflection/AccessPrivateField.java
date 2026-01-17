
import java.lang.reflect.Field;

class Person{
    private int age = 30;


}


public class AccessPrivateField {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Person pl = new Person();
        Class<?> cl = pl.getClass();
        Field fields = cl.getDeclaredField("age");
        
        fields.setAccessible(true);

        int Age = (int) fields.get(pl);// we have to access class by an object of that class

        System.out.println("current age is "+Age);

        fields.set(pl,35);

        int newAge = (int) fields.get(pl);
        System.out.println("now age is "+newAge);



    }
    
}
