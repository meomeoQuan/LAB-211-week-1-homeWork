/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package letter.and.character.count;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

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
    public static String check_Empty(String msg)
    {
        String check;
              do {            
                  check = nhap(msg);
        } while (check.length() == 0 || check.isEmpty());
              return check;
}
    public static Map<String,Integer> wordCount (String s)
    {
        Map<String,Integer> wordCountMap = new HashMap<>();
        StringTokenizer token = new StringTokenizer(s);
        while(token.hasMoreTokens())
        {
            String word = token.nextToken();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0)+1);
        }
        return wordCountMap;
    }
    public static Map<Character,Integer> characterCount (String s)
    {
         Map<Character,Integer> characterMap = new HashMap<>();
         for(char ch : s.toCharArray())
         {
             if(ch != ' ')
             {
                 characterMap.put(ch, characterMap.getOrDefault(ch, 0)+1);
             }
         }
         return characterMap;
}
    static <T> void printFrequencies(Map<T, Integer> frequencies) {
        for (Map.Entry<T, Integer> entry : frequencies.entrySet()) {
            System.out.print(entry.getKey() + " = " + entry.getValue()+",  ");
        }
        if (frequencies.isEmpty()) {
            System.out.println("No items with positive count found.");
        }
    }
}
