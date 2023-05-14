/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.textfilecomparison.model;

/**
 * Class, that stores single text file statistics.
 * 
 * @author Marta Wojcik
 * @version 1.0
 */
public class TextStats {
    /** Number of lines in the text. */
    private int lineCount = 0;
    /** Number of words in the text. */
    private int wordCount = 0;
    /** Number of characters in the first text. */
    private int charCount = 0;
    /** Number of letters in the first text. */
    private int letterCount = 0;
    /** Number of digits in the first text. */
    private int digitCount = 0;
    
    /** Getters */
    
    /** @return first text's line count */
    public int getLineCount() {
        return lineCount;
    }

    /** @return first text's word count */
    public int getWordCount() {
        return wordCount;
    }

    /** @return first text's character count */
    public int getCharCount() {
        return charCount;
    }

    /** @return first text's letter count */
    public int getLetterCount() {
        return letterCount;
    }

    /** @return first text's digit count */
    public int getDigitCount() {
        return digitCount;
    }
    
    /** Setters */

    /** @param lineCount the first text's line count to set */
    public void setLineCount(int lineCount) {
        this.lineCount = lineCount;
    }
    
    /** @param wordCount the first text's word count to set */
    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    /** @param charCount the first text's character count to set */
    public void setCharCount(int charCount) {
        this.charCount = charCount;
    }

    /** @param letterCount the first text's letter count to set */
    public void setLetterCount(int letterCount) {
        this.letterCount = letterCount;
    }

    /** @param digitCount the first text's digit count to set */
    public void setDigitCount(int digitCount) {
        this.digitCount = digitCount;
    }
}
