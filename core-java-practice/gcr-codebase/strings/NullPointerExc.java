public class NullPointerExc {

    public static void main(String[] args) {

       
        try {
            String text = null;
            System.out.println(text.length()); 
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
        }
    }
}
