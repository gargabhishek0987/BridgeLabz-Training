import java.util.*;
public class Anagram {
    // check aqnagram
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println(" Enter the two strings with same length to check anagram");
    String str1= sc.nextLine();
    String str2= sc.nextLine();
    System.out.println(isAnagram(str1,str2));
  
    
}
  static boolean isAnagram(String str1 , String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] charArray1 =str1.toCharArray();
        char[] charArray2=str2.toCharArray();
       Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }}
