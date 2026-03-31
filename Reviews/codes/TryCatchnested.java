public class TryCatchnested{
    public static void main(String[] args) {
        try {

            System.out.println("chaining example ");
            try {
                
                int a = 10;
                int b= 0;
                int result = a/b;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println( e.getMessage());
            }
        } catch(Exception e){
            System.out.println(e.getMessage());

        }



}}