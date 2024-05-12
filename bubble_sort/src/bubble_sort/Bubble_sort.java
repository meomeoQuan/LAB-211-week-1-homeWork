/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble_sort;


import java.util.Random;
import java.util.Scanner;

public class Bubble_sort {
    
        
    public static String sCan_meo(String msg)
    {
        System.out.println(msg+":");
        return new Scanner(System.in).nextLine();
    }

    public void sort_Bubble(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap a[j] and a[j + 1]
                   int temp = a[i];
                   a[i] = a[i+1];
                   a[i+1] = temp;
                }
            }
        }
    }
    
//   public static void nhap(String s)
//   {
//       System.out.println(s+": ");
//    int t =   Integer.parseInt(check_Empty(s));
// 
//       
//   }
    
    public static String check_Empty (String t)
    {
        while (true) {            
            String check = sCan_meo(t);
            if (check.length() == 0 || check.isEmpty()) {
                System.err.println("Input can not be empty !");
            }else{
                return check;
            }
        }
        
    }
    public static int check_Int (String t)
    {
        while(true){
        String check = check_Empty(t);
            if (check == null) {
                System.err.println("Input empty !");
            }else{
                try{
                     return Integer.parseInt(check);     
                    
                }catch(NumberFormatException e){System.out.println("Invalid input ! Please enter a valid interger");}
            }
        }
    }
    public static int check_Positive (String s)
    {
        while(true){
            int check = check_Int(s);
            if (check < 0) {
                System.err.println("Input must positive");
            }else{
                return check;
            }
        }
    }
    public void meomeo(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        bubbleSort ja = new bubbleSort();
        
        
        int n = check_Positive("Enter size of Array : ");
       
        Random random = new Random();
        int[] a = new int[n]; 
        
        
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(n); 
        }
        
        System.out.println("Array before sorting:");
        ja.meomeo(a); 
        
        ja.sort_Bubble(a);
        
        System.out.println("Array after sorting:");
        ja.meomeo(a);
    }
}
