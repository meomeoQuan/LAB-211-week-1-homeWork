/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;

import java.util.Random;

/**
 *
 * @author mac
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int size = Utility.check_Positive("Enter number of array ");
       Integer [] a = new Integer[size];
        Random random = new Random();
        Utility.nhap_MangRandom(random, a);
        System.out.print("Unsorted array: ");
        Utility.xuat_Mang(a);
        Utility.quickSort(a);
        System.out.print("Sorted array:");
        Utility.xuat_Mang(a);
        
    }
    
}
