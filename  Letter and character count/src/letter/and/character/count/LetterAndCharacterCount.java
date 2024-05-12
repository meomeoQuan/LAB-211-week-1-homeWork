/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package letter.and.character.count;

import java.util.Map;


public class LetterAndCharacterCount {

    public static void main(String[] args) {
        String input = Utility.check_Empty("Enter a String ");
        Map<String,Integer> stringMap = Utility.wordCount(input);
        Map<Character,Integer> characterMap = Utility.characterCount(input);
        Utility. printFrequencies(stringMap);
        System.out.println("");
        Utility.printFrequencies(characterMap);
}
    }
