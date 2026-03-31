public class StringBuilder_ReverseString {
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String sc = "hello";
        System.out.println("Reversed String: " + reverse(sc));
    }
}