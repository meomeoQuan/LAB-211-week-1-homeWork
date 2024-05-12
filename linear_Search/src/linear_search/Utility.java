/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linear_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Utility {
    
    public static String nhap (String s)
    {
        System.out.println(s+": ");
        return new Scanner(System.in).nextLine();
    }
    
    public static String check_Empty (String s)
    {
        String check;
        do{
            check = nhap(s);
            
        }while(check.isEmpty() || check.length() == 0);
        return check;
    }
    
    public static Integer return_Integer (String s)
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
       System.out.print("The array: [");
       Arrays.stream(a).forEach(c -> System.out.print(c+","));
       System.out.print("]");
       System.out.println("");
   }
    public static <T> int linear_Search (T [] a, T target)
    {
       
        for(int i = 0 ; i < a.length; i ++)
        {
            if( a[i].equals(target))
            {
                return i;
            }
        }
        return -1;
    }
}
