/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quicksort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Utility {
    
    private static String nhap (String s)
    {
        System.out.println(s+": ");
        return new Scanner(System.in).nextLine();
    }
    
    private static String check_Empty (String s)
    {
        String check;
        do{
            check = nhap(s);
            
        }while(check.isEmpty() || check.length() == 0);
        return check;
    }
    
    private static Integer return_Integer (String s)
    {
        String check;
        do {            
            check = check_Empty(s);
            if (check != null) {
                try {
                    return Integer.valueOf(check);
                } catch (NumberFormatException e) {
                    System.err.println("Can not be converted to Number !");
                }
            }
        } while (true);
        
}
   public static Integer check_Positive (String s)
   {
       int check;
       do {           
           check = return_Integer(s);
           
       } while (check < 0);
       return check;
   }
   
    @SuppressWarnings("unchecked")
    public static <T> void nhap_MangRandom(Random random, T[] a) {
       for(int i = 0 ; i < a.length; i++)
       {
           try {
                 a[i] = (T) (Integer) random.nextInt(a.length);
           } catch (Exception e) {
           }
         
       }
    }
    
   public static <T> void xuat_Mang (T [] a)
   {
       System.out.print("[");
       Arrays.stream(a).forEach(c -> System.out.print(c+","));
       System.out.print("]");
       System.out.println("");
   }
   
   public static <T extends Comparable<T>> void quickSort(T[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static <T extends Comparable<T>> void quickSort(T[] arr, int start, int end) {
        if (start < end) {
            int p = partition(arr, start, end);
            quickSort(arr, start, p - 1);
            quickSort(arr, p + 1, end);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] arr, int start, int end) {
        T pivot = arr[start];
        int i = start + 1;
        int j = end;

        while (i <= j) {
            if (arr[i].compareTo(pivot) <= 0) {
                i++;
            } else if (arr[j].compareTo(pivot) > 0) {
                j--;
            } else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        // Place pivot element in its correct position
        swap(arr, start, j);

        return j;
    }

    private static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
