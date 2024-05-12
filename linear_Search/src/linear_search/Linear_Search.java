/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linear_search;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author mac
 */
public class Linear_Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int s = Utility.check_Positive("Enter number of array ");
        int target = Utility.return_Integer("Enter search value ");
        Random random = new Random();
       Integer [] a = new Integer[s];  // Create an int array
      Utility.nhap_MangRandom(random, a);
      Utility.xuat_Mang(a);
      int index = Utility.linear_Search(a, target);
      
        if (index != -1) {
            System.out.println("Found "+target+" at index: "+ index);
        }else{
            System.out.println("Did not see the target want to find !");
        }
      
        
       
    }
    
}
