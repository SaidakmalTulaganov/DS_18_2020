/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import operation.TovarOperationImpl;
import types.Tovar;

/**
 *
 * @author saida
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form form
     */
    public Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dlgAdd = new javax.swing.JDialog();
        lblName = new javax.swing.JLabel();
        lblKol = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblPriceInfo = new javax.swing.JLabel();
        cmbName = new javax.swing.JComboBox<>();
        btnCancel = new javax.swing.JButton();
        spnKol = new javax.swing.JSpinner();
        scrPrice = new javax.swing.JScrollBar();
        btnAddTovar = new javax.swing.JButton();
        pnlConstruct = new javax.swing.JPanel();
        rdbNoParam = new javax.swing.JRadioButton();
        rdbYesParam = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        lbl = new javax.swing.JLabel();
        txt = new javax.swing.JTextField();
        tlBar = new javax.swing.JToolBar();
        btnAdd = new javax.swing.JButton();
        spr1 = new javax.swing.JToolBar.Separator();
        btnDecide = new javax.swing.JButton();
        spr2 = new javax.swing.JToolBar.Separator();
        btnExit = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        dlgAdd.setTitle("Окно ввода");
        dlgAdd.setName("dlgAdd"); // NOI18N

        lblName.setText("Наименование");
        lblName.setName("lblName"); // NOI18N

        lblKol.setText("Количество");
        lblKol.setName("lblKol"); // NOI18N

        lblPrice.setText("Цена");
        lblPrice.setName("lblPrice"); // NOI18N

        lblPriceInfo.setText("50");
        lblPriceInfo.setName("lblPriceInfo"); // NOI18N

        cmbName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Тетрадь", "Ручка", "Карандаш" }));
        cmbName.setName("cmbName"); // NOI18N
        cmbName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNameActionPerformed(evt);
            }
        });

        btnCancel.setText("Отмена");
        btnCancel.setName("btnCancel"); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        spnKol.setModel(new javax.swing.SpinnerNumberModel(10, 1, 30, 2));
        spnKol.setName("spnKol"); // NOI18N

        scrPrice.setMaximum(110);
        scrPrice.setMinimum(5);
        scrPrice.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrPrice.setValue(50);
        scrPrice.setName("scrPrice"); // NOI18N
        scrPrice.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrPriceAdjustmentValueChanged(evt);
            }
        });

        btnAddTovar.setText("Добавить");
        btnAddTovar.setName("btnAddTovar"); // NOI18N
        btnAddTovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTovarActionPerformed(evt);
            }
        });

        pnlConstruct.setBorder(javax.swing.BorderFactory.createTitledBorder("Конструктор"));
        pnlConstruct.setName("pnlConsturct"); // NOI18N

        rdbNoParam.setSelected(true);
        rdbNoParam.setText("без параметров");
        rdbNoParam.setName("rdbNoParam"); // NOI18N

        rdbYesParam.setText("с параметрами");
        rdbYesParam.setName("rdbYesParam"); // NOI18N

        javax.swing.GroupLayout pnlConstructLayout = new javax.swing.GroupLayout(pnlConstruct);
        pnlConstruct.setLayout(pnlConstructLayout);
        pnlConstructLayout.setHorizontalGroup(
            pnlConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConstructLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(rdbNoParam)
                .addGap(18, 18, 18)
                .addComponent(rdbYesParam)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnlConstructLayout.setVerticalGroup(
            pnlConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConstructLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbNoParam)
                    .addComponent(rdbYesParam))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dlgAddLayout = new javax.swing.GroupLayout(dlgAdd.getContentPane());
        dlgAdd.getContentPane().setLayout(dlgAddLayout);
        dlgAddLayout.setHorizontalGroup(
            dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKol, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbName, 0, 171, Short.MAX_VALUE)
                            .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPriceInfo)
                                .addComponent(spnKol, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(pnlConstruct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnAddTovar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addGap(45, 45, 45))
        );
        dlgAddLayout.setVerticalGroup(
            dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(cmbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKol)
                    .addComponent(spnKol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(lblPriceInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlConstruct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTovar)
                    .addComponent(btnCancel))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Работа№1");
        setName("form"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "№ п/п", "Название", "Цена", "Количество", "Сумма"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.setName("tbl"); // NOI18N
        jScrollPane2.setViewportView(tbl);

        lbl.setText("Общая сумма товара");
        lbl.setName("lbl"); // NOI18N

        txt.setEditable(false);
        txt.setName("txt"); // NOI18N

        tlBar.setRollover(true);
        tlBar.setName("tlBar"); // NOI18N

        btnAdd.setText("Добавить");
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setName("btnAdd"); // NOI18N
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        tlBar.add(btnAdd);

        spr1.setName("spr1"); // NOI18N
        tlBar.add(spr1);

        btnDecide.setText("Вычислить");
        btnDecide.setFocusable(false);
        btnDecide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDecide.setName("btnDecide"); // NOI18N
        btnDecide.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDecide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecideActionPerformed(evt);
            }
        });
        tlBar.add(btnDecide);

        spr2.setName("spr2"); // NOI18N
        tlBar.add(spr2);

        btnExit.setText("Выход");
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setName("btnExit"); // NOI18N
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        tlBar.add(btnExit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addComponent(tlBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tlBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    TovarOperationImpl tovarOperation = new TovarOperationImpl();
    static DefaultTableModel model = new DefaultTableModel();
    
    private void btnAddTovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTovarActionPerformed
        dlgAdd.setVisible(false);
        // д.б. код для проверки полей на правильность ввода
        Tovar el;
        if (rdbYesParam.isSelected()) {
            el = new Tovar(cmbName.getSelectedItem().toString(), (int) spnKol.getValue(), scrPrice.getValue());
        } else {
            el = new Tovar();
            el.setName(cmbName.getSelectedItem().toString());
            el.setKol((int) spnKol.getValue());
            el.setPrice(scrPrice.getValue());
        }
        doVivod(tovarOperation.addNewTovar(el));
    }

    private void doVivod(List<Tovar> lstTovar){
        doClearTable();
        int i = 1;
        for(Tovar tovar: lstTovar){
            Object[] rowData = new Object[5];
            rowData[0] = i++;
            rowData[1] = tovar.getName();
            rowData[2] = tovar.getPrice();
            rowData[3] = tovar.getKol();
            rowData[4] = tovar.getPrice() * tovar.getKol();
            model.addRow(rowData);
        }
    }

    private void doClearTable(){
        while (model.getRowCount()>0){
            model.removeRow(0);
        }
    }//GEN-LAST:event_btnAddTovarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        dlgAdd.setSize(300, 320);
        dlgAdd.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDecideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecideActionPerformed
        txt.setText(Integer.toString(tovarOperation.getSumOfTovar()));
    }//GEN-LAST:event_btnDecideActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        model = (DefaultTableModel)tbl.getModel();
        doVivod(tovarOperation.getListOfTovar());
    }//GEN-LAST:event_formWindowOpened

    private void scrPriceAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrPriceAdjustmentValueChanged
        lblPriceInfo.setText(Integer.toString((int) scrPrice.getValue()));
    }//GEN-LAST:event_scrPriceAdjustmentValueChanged

    private void cmbNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNameActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {
        dlgAdd.setVisible(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddTovar;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDecide;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cmbName;
    private javax.swing.JDialog dlgAdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblKol;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPriceInfo;
    private javax.swing.JPanel pnlConstruct;
    private javax.swing.JRadioButton rdbNoParam;
    private javax.swing.JRadioButton rdbYesParam;
    private javax.swing.JScrollBar scrPrice;
    private javax.swing.JSpinner spnKol;
    private javax.swing.JToolBar.Separator spr1;
    private javax.swing.JToolBar.Separator spr2;
    private javax.swing.JTable tbl;
    private javax.swing.JToolBar tlBar;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
