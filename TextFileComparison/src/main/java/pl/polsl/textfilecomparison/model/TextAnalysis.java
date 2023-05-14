/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.textfilecomparison.model;

import java.util.List;
import java.util.stream.Collectors;

/** 
 * Class, that analyzes both imported texts.
 * 
 * @author Marta Wojcik
 * @version 2.0
 */
public class TextAnalysis {
    
    /**
     * Counts the lines in an analyzed text.
     * 
     * @param text analyzed text
     * 
     * @return the line count
     */
    public int countLine(List<String> text) {
        return text.size();
    }
    
    /**
     * Counts the words in an analyzed text.
     * 
     * @param text analyzed text
     * 
     * @return the word count
     */
    public int countWord(List<String> text) {
        int nWords = 0;
        
        for(String i : text) {
            nWords += i.split("\\s").length;
        }
        return nWords;
    }
    
    /**
     * Counts the characters in an analyzed text.
     * 
     * @param text analyzed text
     * 
     * @return the character count
     */
    public int countChar(List<String> text) {
        int nChars = 0;
        
        for (String i : text) {
            nChars += i.length();
        }
        
        return nChars;
    }
    
    /**
     * Counts the letters in an analyzed text.
     * 
     * @param text analyzed text
     * 
     * @return the letter count
     */
    public int countLetter(List<String> text) {
        int nLetters = 0;

        for (String i : text) {
            List<Character> char_list = i.chars().mapToObj(c->(char)c).collect(Collectors.toList());
            List<Character> letters = char_list.stream().filter(l -> Character.isLetter(l)).collect(Collectors.toList());
            
            nLetters += letters.size();
        }
       
        return nLetters;
    }
    
    /**
     * Counts the digits in an analyzed text.
     * 
     * @param text analyzed text
     * 
     * @return the digit count
     */
    public int countDigit(List<String> text) {
        int nDigits = 0;
        
        for (String i : text) {
            List<Character> char_list = i.chars().mapToObj(c->(char)c).collect(Collectors.toList());
            List<Character> digits = char_list.stream().filter(l -> Character.isDigit(l)).collect(Collectors.toList());
            
            nDigits += digits.size();
        }
        
        return nDigits;
    }
}
