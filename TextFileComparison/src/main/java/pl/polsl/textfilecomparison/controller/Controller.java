/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.textfilecomparison.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import pl.polsl.textfilecomparison.view.MainWindow;
import pl.polsl.textfilecomparison.model.*;

/** 
 * Class, that manages both view and model classes.
 * 
 * @author Marta Wojcik
 * @version 3.0
 */
public class Controller {
    
    TextImport txtImport = new TextImport();
    TextAnalysis txtAnalysis = new TextAnalysis();
    Statistics stats = new Statistics();
    MainWindow window = new MainWindow();
    
    /** First text given as parameter. */
    List<String> text1 = new ArrayList();
    /** Second text given as parameter. */
    List<String> text2 = new ArrayList();
    
    /**
     * Controller constructor.
     * 
     * @param newWindow main window of the application.
     */
    public Controller(MainWindow newWindow) {
        this.window = newWindow;
    }
    
    /** Main comparing function. */
    public void compare() {
        addBothTexts(window.getTextbox1Content(), window.getTextbox2Content());
        collectStats();
        displayStats();
    }
    
    /**
     * Imports both text files to the application.
     * 
     * @param path1 path to the first file
     * @param path2 path to the second file
     */
    public void addBothTexts(String path1, String path2) {
        
        try {
            text1 = txtImport.importText(path1);
            text2 = txtImport.importText(path2);
        } catch(PathNotFoundException | IOException e) {
            window.showDialog(e.toString());
        }
    }
    
    /** Sets all text comparison statistics in a Statistics object. */
    public void collectStats() {
        
        stats.setText1Stats(
                txtAnalysis.countLine(text1),
                txtAnalysis.countWord(text1),
                txtAnalysis.countChar(text1),
                txtAnalysis.countLetter(text1),
                txtAnalysis.countDigit(text1)
                );
        
        stats.setText2Stats(
                txtAnalysis.countLine(text2),
                txtAnalysis.countWord(text2),
                txtAnalysis.countChar(text2),
                txtAnalysis.countLetter(text2),
                txtAnalysis.countDigit(text2)
                );
    }
    
    /** Displays all text comparison statistics in a table. */
    public void displayStats() {
        window.displayStats(stats.getText1Stats(), stats.getText2Stats());
    }
}
