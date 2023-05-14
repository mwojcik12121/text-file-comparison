/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.textfilecomparison.model;

/**
 * Class, that stores all texts' statistics.
 * 
 * @author Marta Wojcik
 * @version 2.0
 */
public class Statistics {
    
    private final TextStats text1 = new TextStats();
    private final TextStats text2 = new TextStats();
    
    /** Getters */
    
    /** @return first text's statistics */
    public TextStats getText1Stats() {
        return text1;
    }
    /** @return second text's statistics */
    public TextStats getText2Stats() {
        return text2;
    }
    
    /** Setters */

    /**
     *  Set all statistics for the first text.
     *  
     *  @param lineCount the first text's line count to set
     *  @param wordCount the first text's word count to set
     *  @param charCount the first text's character count to set
     *  @param letterCount the first text's letter count to set
     *  @param digitCount the first text's digit count to set
     */
    public void setText1Stats(int lineCount, int wordCount, int charCount, int letterCount, int digitCount) {
        text1.setLineCount(lineCount);
        text1.setWordCount(wordCount);
        text1.setCharCount(charCount);
        text1.setLetterCount(letterCount);
        text1.setDigitCount(digitCount);
    }
    
    /**
     *  Set all statistics for the second text.
     *  
     *  @param lineCount the second text's line count to set
     *  @param wordCount the second text's word count to set
     *  @param charCount the second text's character count to set
     *  @param letterCount the second text's letter count to set
     *  @param digitCount the second text's digit count to set
     */
    public void setText2Stats(int lineCount, int wordCount, int charCount, int letterCount, int digitCount) {
        text2.setLineCount(lineCount);
        text2.setWordCount(wordCount);
        text2.setCharCount(charCount);
        text2.setLetterCount(letterCount);
        text2.setDigitCount(digitCount);
    }
}