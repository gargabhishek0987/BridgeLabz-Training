import java.lang.reflect.Method;

class Calculator{
    private int  multiply(int a, int b){
        return a*b;
    }
}



public class InvokePrivateMethod {
   
    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator();
        Class<?> cl  = cal.getClass();

        
        Method method  = cl.getMethod("multiply",int.class , int.class);
        

        method.setAccessible(true);

        int result =  (int) method.invoke(cal , 5,4);


        System.out.println("result");
        
    }
    
}
