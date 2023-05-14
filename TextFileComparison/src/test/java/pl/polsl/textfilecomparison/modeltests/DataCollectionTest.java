/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.textfilecomparison.modeltests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import pl.polsl.textfilecomparison.model.TextAnalysis;

/**
 * Unit test for all TextAnalysis class methods
 * 
 * @author Marta Wojcik
 * @version 2.0
 */
public class DataCollectionTest {
    
    TextAnalysis txtAnalysis = new TextAnalysis();
    
    List<String> testing_data = new ArrayList(Arrays.asList(
    "JwIiUm_2022", "t3styj3dn0stk0w3", "pr-t-typ_n-_cw_2"));
    
    /** INFO: the first value for tests is correct, other are wrong. */
    
    /**
     * Tests lineCount function.
     * 
     * @param expected expected amount of lines
     */
    @ParameterizedTest
    @ValueSource(ints = {3, 7, 14})
    void testLineCount(int expected) {
        assertEquals(expected, txtAnalysis.countLine(testing_data), "Amount of lines is mismatched!");
    }
    
    /**
     * Tests wordCount function.
     * 
     * @param expected expected amount of words
     */
    @ParameterizedTest
    @ValueSource(ints = {3, 7, 14})
    void testWordCount(int expected) {
        assertEquals(expected, txtAnalysis.countLine(testing_data), "Amount of lines is mismatched!");
    }
    
    /**
     * Tests charCount function.
     * 
     * @param expected expected amount of characters
     */
    @ParameterizedTest
    @ValueSource(ints = {43, 7, 14})
    void testCharCount(int expected) {
        assertEquals(expected, txtAnalysis.countChar(testing_data), "Amount of characters is mismatched!");
    }
    
    /**
     * Tests letterCount function.
     * 
     * @param expected expected amount of letters
     */
    @ParameterizedTest
    @ValueSource(ints = {26, 7, 14})
    void testLetterCount(int expected) {
        assertEquals(expected, txtAnalysis.countLetter(testing_data), "Amount of letters is mismatched!");
    }
    
    /**
     * Tests digitCount function.
     * 
     * @param expected expected amount of digits
     */
    @ParameterizedTest
    @ValueSource(ints = {10, 7, 14})
    void testDigitCount(int expected) {
        assertEquals(expected, txtAnalysis.countDigit(testing_data), "Amount of digits is mismatched!");
    }
}
