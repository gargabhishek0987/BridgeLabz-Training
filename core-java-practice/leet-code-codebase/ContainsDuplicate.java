import java.util.*;
public class ContainsDuplicate {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		System.out.println("Enter the number of elements");
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		 for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
		 System.out.println(containsDuplicate(arr));
	}
	public static boolean containsDuplicate(int[] nums) {
	       Arrays.sort(nums);
	       int n=nums.length;
	       for(int i=1;i<n;i++){
	        if(nums[i]==nums[i-1]){
	            return true;
	        }
	       }
	return false;
	       } 
	       
}
