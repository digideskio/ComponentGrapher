/*
 *  COMPOSITE-GRAPHER v1.0
 *  
 *  Copyright (C) 2016-2017  Etienne Lord
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the 
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package dialog;


import config.Config;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import matrixrenderer.ExcelResultAdapter;
import matrixrenderer.NodeView_TableModel;



/**
 * RenameComboBox for propertiesName
 * Note: return the propertiesName, it will be empty if cancelled
 *
 * @author Etienne Lord
 * @since July 2009
 */
public class NodeView_JDialog extends javax.swing.JDialog {

    ////////////////////////////////////////////////////////////////////////////
    /// Variables

    private String oldColName="";    //Old properties filename
    public String NewName="";        //New properties filename
    Config config=new Config();             //Configuration file
    Frame frame;                            //parent frame
    ExcelResultAdapter table1;
    ////////////////////////////////////////////////////////////////////////////
    /// Constructor
   
    public NodeView_JDialog(java.awt.Frame parent, COMPONENT_GRAPHER.summary_statistics data, int nodeid) {
        super(parent, true);
        this.setAlwaysOnTop(true);
        this.frame=parent;
        initComponents();
        //this.RenamejButton.setText(RenameButtonText);
        
        NodeView_TableModel nvt=new NodeView_TableModel();
        nvt.setData(data, nodeid);
        nvt.fireTableDataChanged();
        nvt.fireTableStructureChanged();
       this.jTable1.setModel(nvt);
       table1=new ExcelResultAdapter(jTable1);
        CopyAll_jButton.setFont(Config.getGlyphicon());
        CopyAll_jButton.setText("\uf0c5");
        //this.new_jTextField.setText(oldColName);
        Message("Noteid:"+nodeid+" "+nvt.current_node.complete_name,"");
        this.setTitle("Node information for "+nodeid+" "+nvt.current_node.complete_name);
        // Set position
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension d = getSize();
        setLocation((screenSize.width-d.width)/2,
					(screenSize.height-d.height)/2);
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        new_jTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CanceljButton = new javax.swing.JButton();
        jStatusMessage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CopyAll_jButton = new javax.swing.JButton();

        jLabel3.setText("Old ");

        setTitle("Rename idenfier");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        new_jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                new_jTextFieldKeyPressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 205));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Node informations");
        jLabel1.setOpaque(true);

        CanceljButton.setText("Done");
        CanceljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanceljButtonActionPerformed(evt);
            }
        });

        jStatusMessage.setForeground(new java.awt.Color(51, 51, 255));
        jStatusMessage.setText("Info");

        jLabel4.setText("Filter");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Value", "Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        CopyAll_jButton.setText("c");
        CopyAll_jButton.setToolTipText("Copy the table to the Clipboard.");
        CopyAll_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyAll_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jStatusMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                        .addGap(81, 81, 81)
                        .addComponent(CanceljButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(new_jTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CopyAll_jButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(new_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CopyAll_jButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jStatusMessage)
                    .addComponent(CanceljButton)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CanceljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanceljButtonActionPerformed
        NewName=this.oldColName;
        this.setVisible(false);
    }//GEN-LAST:event_CanceljButtonActionPerformed

    private void new_jTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_new_jTextFieldKeyPressed
        char c=evt.getKeyChar(); //Hack to catch V_ENTER key;
//       if (c==KeyEvent.VK_ENTER) {
//            renameColumn();
//        }
    }//GEN-LAST:event_new_jTextFieldKeyPressed

    private void CopyAll_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyAll_jButtonActionPerformed
         this.table1.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "CopyAll"));
    }//GEN-LAST:event_CopyAll_jButtonActionPerformed

    public String display() {
        this.setVisible(true);
        return "";
    }
    
    ///////////////////////////////////////////////////////////////////////////
    /// MESSAGE FONCTION

    /**
     * Affiche un message dans la status bar
     * La provenance peut être mise dans un tooltip
     * @param text Le texte
     * @param tooltip Le tooltip texte
     */
    public void Message(String text, String tooltip) {
        this.jStatusMessage.setEnabled(true);
        this.jStatusMessage.setForeground(new java.awt.Color(0, 51, 153));
        this.jStatusMessage.setBackground(Color.WHITE);
        this.jStatusMessage.setToolTipText(tooltip);
        this.jStatusMessage.setText(text);
    }

    /**
     * Affiche un message d'erreur en rouge dans la status bar
     * La provenance peut être mise dans un tooltip
     * @param text Le texte
     * @param tooltip Le tooltip texte
     */
    public void MessageErreur(String text, String tooltip) {
        this.jStatusMessage.setEnabled(true);
        this.jStatusMessage.setForeground(Color.RED);
        this.jStatusMessage.setBackground(Color.WHITE);
        this.jStatusMessage.setToolTipText(tooltip);
        this.jStatusMessage.setText(text);
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CanceljButton;
    private javax.swing.JButton CopyAll_jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jStatusMessage;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField new_jTextField;
    // End of variables declaration//GEN-END:variables

}
