/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.textfilecomparison.modeltests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import pl.polsl.textfilecomparison.model.TextImport;
import pl.polsl.textfilecomparison.model.PathNotFoundException;

/**
 * Unit test for all TextImport class methods
 * 
 * @author Marta Wojcik
 * @version 2.0
 */
public class DataImportTest {
    
    TextImport txtImport = new TextImport();
    /** Template text, that should be present in the file */
    List<String> testing_data = new ArrayList(Arrays.asList(
    "JwIiUm_2022", "t3styj3dn0stk0w3", "pr-t-typ_n-_cw_2"));
    
    /**
     * Tests importText function.
     * 
     * @param path tested path to text file
     */
    @ParameterizedTest
    @ValueSource(strings = {
        "${C:\\Users\\mwojc\\Desktop\\test1.txt}",
        "${C:\\Users\\mwojc\\Desktop\\test.txt}",
        "${C:\\Program Files\\test.txt}",
        "${C:\\Users\\mwojc\\Documents\\test.txt}"})
    void testInportText(String path) {
        
        try {
            assertEquals(testing_data, txtImport.importText(path), "Imported text does not match the template!");
        } catch (PathNotFoundException | IOException e) {
            fail("Invalid path to text file!");
        }
    }
}
