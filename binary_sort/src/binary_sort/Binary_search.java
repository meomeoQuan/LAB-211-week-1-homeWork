package binary_sort;
import java.util.Arrays;
import java.util.Random;
public class Binary_search {

    public static void main(String[] args) {
        Random random = new Random();
        int n = Utility.check_Positive("Enter size of array ");
        int[] a = new int[n];

        // Fill the array with random integers
        Utility.nhap(random, a);
       int find = Utility.check_Positive("Enter value to search ");
        // Sort the array
        Arrays.sort(a);
        // Display the sorted array
        System.out.println("Sorted array: ");
        Utility.xuat(a);
        
        // Perform binary search
        int index =Utility.binary_Search(a, find, 0, a.length - 1);

        if (index != -1) {
            System.out.println("Found " + find + " at index " + index);
        } else {
            System.out.println("Value " + find + " not found in the array");
        }
        }

   
}
