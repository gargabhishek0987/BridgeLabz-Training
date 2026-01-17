
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod{
    String description() default"High";

}
class Apply{

    @ImportantMethod
    public void normalMethod(){
        System.out.println("This is a normal method");
    }
    @ImportantMethod(description= "High")
    public void criticalMethod(){
        System.out.println("This is a critical method");
    }
}




public class ImportantMethodCustomAnnotation {
    public static void main(String[] args) {
        Class<?> cls = Apply.class;
        Method[] methods = cls.getDeclaredMethods();
        for(int i=0;i<methods.length;i++){
             if(methods[i].isAnnotationPresent(ImportantMethod.class)){
                ImportantMethod im = methods[i].getAnnotation(ImportantMethod.class);
            System.out.println(methods[i].getName());        }
        }
       
    }
    
}
