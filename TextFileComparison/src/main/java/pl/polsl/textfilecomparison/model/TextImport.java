/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.textfilecomparison.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** 
 * Class, that does import operations.
 * 
 * @author Marta Wojcik
 * @version 2.0
 */
public class TextImport {
    
    /**
     * Imports the text from the file.
     * 
     * @param path the full path to the file
     * 
     * @return the contents of the text file
     * 
     * @throws pl.polsl.textfilecomparison.model.PathNotFoundException
     * @throws java.io.IOException
     */
    public List<String> importText (String path) throws PathNotFoundException, IOException{
        
        List<String> text = new ArrayList();
        File textPath = new File(path);
        
        if(!textPath.isFile()) {
            throw new PathNotFoundException("Invalid path detected!");
        } else {
            BufferedReader txt = new BufferedReader(new FileReader(path));
            
            String line = txt.readLine();
            while(line != null) {
                text.add(line);
                line = txt.readLine();
            }
        }
        
        return text;
    }
}
