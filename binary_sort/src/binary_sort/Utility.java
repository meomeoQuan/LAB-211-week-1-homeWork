/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary_sort;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author mac
 */
public class Utility {
      public static String nhap(String msg)
      {
          System.out.println(msg+": ");
          return new Scanner(System.in).nextLine();
      }
      
      public static String check_Empty(String m)
      {
          while(true)
          {
              String check = nhap(m);
              if (check.length() == 0 || check.isEmpty()) {
                  System.err.println("Empty Input !");
              }else{
                  return  check;
              
              }   
      }
     
}
      public static int check_Positive(String m)
      {
          while (true) {              
              String check = check_Empty(m);
              if (check == null) {
                  System.err.println("Empty Input !");
              }else{
                  try{
                      return Integer.parseInt(check);
                  }catch(NumberFormatException e)
                  {
                      System.err.println("Invalid input ! ");
                  }
              }
          }
    }
//      public static int binary_Search(int [] a,int find, int l , int h )
//      {
//          int m = a[(l+h)/2];
//          if(m == find)
//          {
//              return m;
//            
//          }
//          
//          if( m < find)
//          {
//              return binary_Search(a, find, l + 1, h);
//          }else{
//              return binary_Search(a, find, l, h - 1);
//          }
//          
//          
//      }
    
       public static int binary_Search(int[] a, int target, int low, int high) {
        if (low <= high) {
            int m = (low + high) / 2;

            if (a[m] == target) {
                return m;             }

            if (a[m] < target) {
                return binary_Search(a, target, low + 1, high); 
            } else {
                return binary_Search(a, target, low, high - 1); 
            }
        }

        return -1; 
    }
       public static void nhap (Random r , int [] a)
       {
           for(int i = 0 ; i < a.length ; i++)
           {
               a[i] = r.nextInt(a.length);
           }
       }
       public static void xuat (int [] a)
       {
           for(int n : a)
           {
               System.out.print(n+ " ");
           }
           System.out.println("");
       }
}
