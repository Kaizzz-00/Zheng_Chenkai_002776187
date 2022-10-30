/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Doctor.Doctor;
import Doctor.Encounter;
import Doctor.doctorDirectory;
import Doctor.encounterHistory;
import Hospital.Hospital;
import Hospital.hospitalDirectory;
import Patient.Patient;
import Patient.patientDirectory;
import Patient.vitalSign;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kai
 */
public class admin_en_panel extends javax.swing.JPanel {

    /**
     * Creates new form admin_en_panel
     */
    encounterHistory eHistory;
    doctorDirectory dDirectory;
    patientDirectory pDirectory;
    hospitalDirectory hDirectory;
    public admin_en_panel(encounterHistory eHistory,doctorDirectory dDirectory,
    patientDirectory pDirectory,
    hospitalDirectory hDirectory) {
        initComponents();
        this.eHistory=eHistory;
        this.dDirectory=dDirectory;
        this.pDirectory=pDirectory;
        this.hDirectory=hDirectory;
        displayComb();
        displayTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        delBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        editBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDiag = new javax.swing.JTextField();
        docBox = new javax.swing.JComboBox<>();
        patBox = new javax.swing.JComboBox<>();
        hosBox = new javax.swing.JComboBox<>();
        txtBP = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPR = new javax.swing.JTextField();
        txtTemp = new javax.swing.JTextField();
        txtRR = new javax.swing.JTextField();

        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "EnDoctor", "EnPatient", "EnHospital", "EnDate", "EnDiagnose"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        editBtn.setText("Upadate");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Encounter Patient ");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Encounter Record");
        jLabel1.setToolTipText("");

        jLabel6.setText("Encounter Hospital");

        jLabel2.setText("Encounter Doctor ");

        jLabel9.setText("Encounter Date");

        jLabel10.setText("Encounter Diagnose");

        docBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docBoxActionPerformed(evt);
            }
        });

        txtBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBPActionPerformed(evt);
            }
        });

        jLabel17.setText("RespirationRate");

        jLabel16.setText("PulseRate");

        jLabel15.setText("BloodPressure");

        jLabel14.setText("Temperature");

        txtPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPRActionPerformed(evt);
            }
        });

        txtTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempActionPerformed(evt);
            }
        });

        txtRR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(docBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(patBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hosBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDate)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPR, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRR, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDiag))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hosBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPR, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRR, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiag, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        int slctRowIndex= jTable1.getSelectedRow();
        if (slctRowIndex<0)  {
            JOptionPane.showMessageDialog(this, "Please Select A Row To Edit.");
            return;
        }// if nothing was selected, then inform the user
        
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        Encounter en=(Encounter) model.getValueAt(slctRowIndex,0);
        
        txtBP.setText(String.valueOf(en.getEnVital().getBloodPressure()));
        txtPR.setText(String.valueOf(en.getEnVital().getPulseRate()));
        txtTemp.setText(String.valueOf(en.getEnVital().getTemperature()));
        txtRR.setText(String.valueOf(en.getEnVital().getRespirationRate()));
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String stringd = formatter.format(en.getEnDate());
        txtDate.setText(stringd);
        txtDiag.setText(en.getEnDiagnose());
    }//GEN-LAST:event_viewBtnActionPerformed

    private void docBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docBoxActionPerformed

    private void txtBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBPActionPerformed

    private void txtPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPRActionPerformed

    private void txtTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempActionPerformed

    private void txtRRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRRActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        String diagnose=txtDiag.getText();
        String sdate=txtDate.getText();
        String sbp=txtBP.getText();
        if (!(sbp.matches("[0-9]+") && sbp.length() > 1)) {
            JOptionPane.showMessageDialog(this, "Valid Blood Pressure Required");
            txtBP.setText(""); // validate the input email
            return;
        }
        Double BP=Double.parseDouble(sbp);
        String spr=txtPR.getText();
        if (!(spr.matches("[0-9]+") && spr.length() > 1)) {
            JOptionPane.showMessageDialog(this, "Valid Pulse Rate Required");
            txtPR.setText(""); // validate the input email
            return;
        }
        Integer PR=Integer.parseInt(spr);
        String stemp=txtTemp.getText();
        if (!(stemp.matches("[0-9]+") && stemp.length() > 1)) {
            JOptionPane.showMessageDialog(this, "Valid Temperature Required");
            txtTemp.setText(""); // validate the input email
            return;
        }
        Double TEMP=Double.parseDouble(stemp);
        String srr=txtRR.getText();
        if (!(srr.matches("[0-9]+") && srr.length() > 1)) {
            JOptionPane.showMessageDialog(this, "Valid Respiratory Rate Required");
            txtRR.setText(""); // validate the input email
            return;
        }
        Integer RR=Integer.parseInt(srr);
        
        Object slctDoc=docBox.getSelectedItem();
        Object slctPat=patBox.getSelectedItem();
        Object slctHos=hosBox.getSelectedItem();
        
        Encounter newE= eHistory.addnewEncounter();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            newE.setEnDate(sdf.parse(sdate));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Valid Date Format Required");
            Logger.getLogger(admin_pa_panel.class.getName()).log(Level.SEVERE, null, ex);
            txtDate.setText("");
            return;
        }
        
        
        newE.setEnDiagnose(diagnose);
        vitalSign vs=new vitalSign();
        vs.setBloodPressure(BP);
        vs.setPulseRate(PR);
        vs.setTemperature(TEMP);
        vs.setRespirationRate(RR);
        newE.setEnVital(vs);
        for (Doctor doc:dDirectory.getHistory())
        {
            if (doc.getName().equals(slctDoc.toString())){
            newE.setEnDoctor(doc);
            }
        }
        for(Patient pat:pDirectory.getHistory())
        {
            if (pat.getName().equals(slctPat.toString())){
            newE.setEnPatient(pat);
            }
        }
        for(Hospital hos:hDirectory.getDirectory())
        {
            if (hos.getHosName().equals(slctHos.toString())){
            newE.setEnHospital(hos);
            }
        }
        
        JOptionPane.showMessageDialog(this, "New Encounter Added.");
        txtBP.setText("");
        txtPR.setText("");
        txtTemp.setText("");
        txtRR.setText("");
        txtDiag.setText("");
        txtDate.setText("");
        
        displayTable();
        
    }//GEN-LAST:event_createBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        int slctRowIndex= jTable1.getSelectedRow();
        if (slctRowIndex<0)  {
            JOptionPane.showMessageDialog(this, "Please Select A Row To Edit.");
            return;
        }// if nothing was selected, then inform the user
        
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        Encounter newE=(Encounter) model.getValueAt(slctRowIndex,0);
        
        String diagnose=txtDiag.getText();
        String sdate=txtDate.getText();
        String sbp=txtBP.getText();
        if (!(sbp.matches("[0-9]+") && sbp.length() > 1)) {
            JOptionPane.showMessageDialog(this, "Valid Blood Pressure Required");
            txtBP.setText(""); // validate the input email
            return;
        }
        Double BP=Double.parseDouble(sbp);
        String spr=txtPR.getText();
        if (!(spr.matches("[0-9]+") && spr.length() > 1)) {
            JOptionPane.showMessageDialog(this, "Valid Pulse Rate Required");
            txtPR.setText(""); // validate the input email
            return;
        }
        Integer PR=Integer.parseInt(spr);
        String stemp=txtTemp.getText();
        if (!(stemp.matches("[0-9]+") && stemp.length() > 1)) {
            JOptionPane.showMessageDialog(this, "Valid Temperature Required");
            txtTemp.setText(""); // validate the input email
            return;
        }
        Double TEMP=Double.parseDouble(stemp);
        String srr=txtRR.getText();
        if (!(srr.matches("[0-9]+") && srr.length() > 1)) {
            JOptionPane.showMessageDialog(this, "Valid Respiratory Rate Required");
            txtRR.setText(""); // validate the input email
            return;
        }
        Integer RR=Integer.parseInt(srr);
        
        Object slctDoc=docBox.getSelectedItem();
        Object slctPat=patBox.getSelectedItem();
        Object slctHos=hosBox.getSelectedItem();
        
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            newE.setEnDate(sdf.parse(sdate));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Valid Date Format Required");
            Logger.getLogger(admin_pa_panel.class.getName()).log(Level.SEVERE, null, ex);
            txtDate.setText("");
            return;
        }
        
        
        newE.setEnDiagnose(diagnose);
        vitalSign vs=new vitalSign();
        vs.setBloodPressure(BP);
        vs.setPulseRate(PR);
        vs.setTemperature(TEMP);
        vs.setRespirationRate(RR);
        newE.setEnVital(vs);
        for (Doctor doc:dDirectory.getHistory())
        {
            if (doc.getName().equals(slctDoc.toString())){
            newE.setEnDoctor(doc);
            }
        }
        for(Patient pat:pDirectory.getHistory())
        {
            if (pat.getName().equals(slctPat.toString())){
            newE.setEnPatient(pat);
            }
        }
        for(Hospital hos:hDirectory.getDirectory())
        {
            if (hos.getHosName().equals(slctHos.toString())){
            newE.setEnHospital(hos);
            }
        }
        
        JOptionPane.showMessageDialog(this, "Encounter Profile Updated.");
        txtBP.setText("");
        txtPR.setText("");
        txtTemp.setText("");
        txtRR.setText("");
        txtDiag.setText("");
        txtDate.setText("");
        
        displayTable();
        
    }//GEN-LAST:event_editBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
        int slctRowIndex= jTable1.getSelectedRow();
        if (slctRowIndex<0)  {
            JOptionPane.showMessageDialog(this, "Please Select A Row To Delete.");
            return;
        }// if nothing was selected, then inform the user
        
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        Encounter se=(Encounter) model.getValueAt(slctRowIndex,0);
        
        eHistory.deleteEncounter(se);// to delete the selected profile, need to create a void
        JOptionPane.showMessageDialog(this, "Selected Profile Deleted.");
        displayTable();//refresh table
    }//GEN-LAST:event_delBtnActionPerformed
    private void displayComb(){
        for (Doctor doc:dDirectory.getHistory())
        {
            docBox.addItem(doc.getName());
        }
        for(Patient pat:pDirectory.getHistory())
        {
            patBox.addItem(pat.getName());
        }
        for(Hospital hos:hDirectory.getDirectory())
        {
            hosBox.addItem(hos.getHosName());
        }
    }
    private void displayTable() {
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        //create a model to display the profile history
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        
        for (Encounter en:eHistory.getHistory()){
            Object[] row = new Object[11];
            row[0]=en;
            //row[1]= pa.getName();
            row[1]= en.getEnPatient().getName();
            
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String stringd = formatter.format(en.getEnDate());
            row[2]= en.getEnHospital().getHosName();
            
            row[3]= stringd;
            
            row[4]= en.getEnDiagnose();
            // use a small array to display each attributes
            model.addRow(row);

            
            
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JComboBox<String> docBox;
    private javax.swing.JButton editBtn;
    private javax.swing.JComboBox<String> hosBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> patBox;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDiag;
    private javax.swing.JTextField txtPR;
    private javax.swing.JTextField txtRR;
    private javax.swing.JTextField txtTemp;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
