/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pl.polsl.textfilecomparison.view;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import pl.polsl.textfilecomparison.controller.Controller;
import pl.polsl.textfilecomparison.model.TextStats;

/**
 * GUI class.
 *
 * @author Marta Wojcik
 * @version 1.0
 */
public class MainWindow extends javax.swing.JFrame {
    
    /**
     * MainWindow constructor.
     */
    public MainWindow() {
        initComponents();
    }

    /** Initializes the components of the window. Generated automatically. */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        err_message = new javax.swing.JOptionPane();
        text1Path = new javax.swing.JLabel();
        text2Path = new javax.swing.JLabel();
        txtBox1 = new javax.swing.JTextField();
        txtBox2 = new javax.swing.JTextField();
        btnCompare = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        comparisonTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text file comparison");
        setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        setResizable(false);

        text1Path.setText("Text 1 path:");

        text2Path.setText("Text 2 path:");

        btnCompare.setText("Compare");
        btnCompare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompareActionPerformed(evt);
            }
        });

        comparisonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Amount of lines:", null, null, null},
                {"Amount of words:", null, null, null},
                {"Amount of characters:", null, null, null},
                {"Amount of letters:", null, null, null},
                {"Amount of digits:", null, null, null}
            },
            new String [] {
                "Statistic", "Text 1", "vs.", "Text 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DefaultTableCellRenderer centralRenderer = new DefaultTableCellRenderer();
        centralRenderer.setHorizontalAlignment(JLabel.CENTER);
        comparisonTable.getColumnModel().getColumn(1).setCellRenderer(centralRenderer);
        comparisonTable.getColumnModel().getColumn(2).setCellRenderer(centralRenderer);
        comparisonTable.getColumnModel().getColumn(3).setCellRenderer(centralRenderer);
        comparisonTable.setRowSelectionAllowed(false);
        comparisonTable.getColumnModel().getColumn(0).setPreferredWidth(30);
        comparisonTable.getColumnModel().getColumn(1).setPreferredWidth(10);
        comparisonTable.getColumnModel().getColumn(2).setPreferredWidth(10);
        comparisonTable.getColumnModel().getColumn(3).setPreferredWidth(10);
        jScrollPane1.setViewportView(comparisonTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text1Path)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBox1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text2Path)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBox2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCompare)
                .addGap(233, 233, 233))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text1Path)
                    .addComponent(txtBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text2Path)
                    .addComponent(txtBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCompare)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    *  TxtBox1 getter.
    *  
    *  @return txtBox1 contents
    */
    public String getTextbox1Content() {
        return txtBox1.getText();
    }
    
    /**
    *  TxtBox1 getter.
    *  
    *  @return txtBox1 contents
    */
    public String getTextbox2Content() {
        return txtBox2.getText();
    }
    
    /**
    *  Sets bot textboxes text from arguments received by running a command.
    *  
    *  @param text1 first parameter from running with console.
    *  @param text2 second parameter from running with console.
    */
    public void setStarterTextboxText(String text1, String text2) {
        txtBox1.setText(text1);
        txtBox2.setText(text2);
    }
    
    /**
     * Shows the error dialog box.
     * 
     * @param err the message of the error
     */
    public void showDialog(String err) {
        err_message.showMessageDialog(this, err, "Input error", err_message.WARNING_MESSAGE);
    }
    
    /**
     * Updates the table.
     * 
     * @param txt1 the statistics of the first text
     * @param txt2 the statistics of the second text
     */
    public void displayStats(TextStats txt1, TextStats txt2) {
        
        comparisonTable.setValueAt(txt1.getLineCount(), 0, 1);
        comparisonTable.setValueAt(txt1.getWordCount(), 1, 1);
        comparisonTable.setValueAt(txt1.getCharCount(), 2, 1);
        comparisonTable.setValueAt(txt1.getLetterCount(), 3, 1);
        comparisonTable.setValueAt(txt1.getDigitCount(), 4, 1);
        
        comparisonTable.setValueAt(txt2.getLineCount(), 0, 3);
        comparisonTable.setValueAt(txt2.getWordCount(), 1, 3);
        comparisonTable.setValueAt(txt2.getCharCount(), 2, 3);
        comparisonTable.setValueAt(txt2.getLetterCount(), 3, 3);
        comparisonTable.setValueAt(txt2.getDigitCount(), 4, 3);
        
        for(int i=0; i<5; i++) {
            if ((int)comparisonTable.getValueAt(i, 1) == (int)comparisonTable.getValueAt(i, 3)) {
                comparisonTable.setValueAt("=",i,2);
            } else if ((int)comparisonTable.getValueAt(i, 1) > (int)comparisonTable.getValueAt(i, 3)) {
                comparisonTable.setValueAt(">",i,2);
            } else {
                comparisonTable.setValueAt("<",i,2);
            }
        }
    }
    
    /**
     * Performs an action on clicking the "Compare button"
     * 
     * @param evt the type of action event generated by the action
     */
    private void btnCompareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompareActionPerformed
        
        if(txtBox1.getText().equals("") || txtBox2.getText().equals("")) {
            showDialog("At least one text field is empty!");
        }
        else {
            Controller controller = new Controller(this);
            controller.compare();
        }
    }//GEN-LAST:event_btnCompareActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompare;
    private javax.swing.JTable comparisonTable;
    private javax.swing.JOptionPane err_message;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel text1Path;
    private javax.swing.JLabel text2Path;
    private javax.swing.JTextField txtBox1;
    private javax.swing.JTextField txtBox2;
    // End of variables declaration//GEN-END:variables
}
