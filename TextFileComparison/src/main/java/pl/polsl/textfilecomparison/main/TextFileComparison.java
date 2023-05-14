/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pl.polsl.textfilecomparison.main;

import pl.polsl.textfilecomparison.view.MainWindow;

/** 
 * Main class of the application.
 * 
 * @author Marta Wojcik
 * @version 3.0
 */
public class TextFileComparison {

    /** 
     * Main method of the application.
     * 
     * @param args arguments imported from the command line in order:
     * [full path to the first text file] [full path to the second text file]
     */
    public static void main(String[] args) {
        
        MainWindow window = new MainWindow();
        
        /** If there are any arguments passed as parameters, first two of them will be added to the textboxes.*/
        switch (args.length) {
            case 0 -> window.setStarterTextboxText("","");
            case 1 -> window.setStarterTextboxText(args[0],"");
            default -> window.setStarterTextboxText(args[0], args[1]);
        }
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
