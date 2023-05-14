/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.textfilecomparison.model;

/**
 * Exception class for invalid path of the text file
 * 
 * @author Marta Wojcik
 * @version 1.0
 */
public class PathNotFoundException extends RuntimeException {
    
    public PathNotFoundException(String message) {
        super(message);
    }
}
