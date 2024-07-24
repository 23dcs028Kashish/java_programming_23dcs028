import java.util.*;
class P8{
public static  int array_count9(int[] nums) {
    int count = 0;
    for (int num : nums) {
        if (num == 9) {
            count++;
        }
    }
    return count;
}


public static void main(String[] args) {
    //int[] nums1 = {1, 2, 9};
   String num1="kashish";
String num2="kashish";   
int[] nums3 = {1, 9, 9};
    int[] nums4 = {1, 9, 9};
    
   // System.out.println("number of 9 in {1, 2, 9} array:"+ array_count9(nums1)); // Output: 1
   // System.out.println("number of 9 in {1, 9, 9} array:" + array_count9(nums2)); // Output: 2
    //System.out.println("number of 9 in {1, 9, 9, 3, 9} array:" +array_count9(nums3)); // Output: 3
System.out.println(" "+ num1.equals(num2));
System.out.println(" "+ num1.compareTo(num2));
System.out.println(Arrays.compare(nums3,nums4));



    System.out.println("23DCS028 KASHISH GANDHI");
}
}