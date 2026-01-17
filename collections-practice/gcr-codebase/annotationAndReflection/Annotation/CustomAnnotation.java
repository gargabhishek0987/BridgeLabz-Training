
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo{
    String priority();
    String assignedTo();


}

class Sample{
     @TaskInfo(priority = "High", assignedTo = "Abhishek")
    public void CompleteTAsk(){
        System.out.println("Completed the task");
    }
}

public class CustomAnnotation {
    public static void main(String[] args) {
        Class<?> cls = Sample.class;
        try {
            Method method = cls.getDeclaredMethod("CompleteTAsk");
            
            if(method.isAnnotationPresent(TaskInfo.class)){
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
                System.out.println("Priority: "+taskInfo.priority());
                System.out.println("Assigned To: "+taskInfo.assignedTo());
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
   

    
}
