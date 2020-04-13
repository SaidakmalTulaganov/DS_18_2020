package base;

import java.rmi.Naming;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import operation.TovarOperation;
import types.Tovar;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
    }
    
    static DefaultTableModel model = new DefaultTableModel();
    static TovarOperation tovarOperation = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgAdd = new javax.swing.JDialog();
        lblFloor = new javax.swing.JLabel();
        lblPlace = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblBonus = new javax.swing.JLabel();
        cmbFloor = new javax.swing.JComboBox<>();
        spnPlace = new javax.swing.JSpinner();
        scrClock = new javax.swing.JScrollBar();
        scrPrice = new javax.swing.JScrollBar();
        cmbBonus = new javax.swing.JComboBox<>();
        pnlConstruct = new javax.swing.JPanel();
        rdbYesParam = new javax.swing.JRadioButton();
        rdbNoParam = new javax.swing.JRadioButton();
        btnAddTovar = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblClockInfo = new javax.swing.JLabel();
        lblPriceInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        lbl = new javax.swing.JLabel();
        txt = new javax.swing.JTextField();
        tlBar = new javax.swing.JToolBar();
        btnAdd = new javax.swing.JButton();
        spr1 = new javax.swing.JToolBar.Separator();
        btnDel = new javax.swing.JButton();
        spr2 = new javax.swing.JToolBar.Separator();
        btnDecide = new javax.swing.JButton();
        spr3 = new javax.swing.JToolBar.Separator();
        btnExit = new javax.swing.JButton();

        dlgAdd.setTitle("Окно ввода");

        lblFloor.setText("Этаж");

        lblPlace.setText("Место");

        lblClock.setText("Часы");

        lblPrice.setText("Цена");

        lblBonus.setText("Бонусы и акции");

        cmbFloor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 этаж", "2 этаж", "3 этаж", "4 этаж", "5 этаж", "6 этаж" }));
        cmbFloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFloorActionPerformed(evt);
            }
        });

        spnPlace.setModel(new javax.swing.SpinnerNumberModel(10, 1, 50, 1));

        scrClock.setMaximum(250);
        scrClock.setMinimum(1);
        scrClock.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrClock.setValue(24);
        scrClock.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrClockAdjustmentValueChanged(evt);
            }
        });

        scrPrice.setMaximum(1010);
        scrPrice.setMinimum(300);
        scrPrice.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrPrice.setValue(500);
        scrPrice.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrPriceAdjustmentValueChanged(evt);
            }
        });

        cmbBonus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ставь на 10 часов, 11 - й бесплатно", "Ставь на 20 часов, 3 часа бесплатно", "Ставь на 10 дней, 1 день бесплатно" }));

        pnlConstruct.setBorder(javax.swing.BorderFactory.createTitledBorder("Оплата"));

        rdbYesParam.setText("Картой");

        rdbNoParam.setText("Наличными");

        javax.swing.GroupLayout pnlConstructLayout = new javax.swing.GroupLayout(pnlConstruct);
        pnlConstruct.setLayout(pnlConstructLayout);
        pnlConstructLayout.setHorizontalGroup(
            pnlConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConstructLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(rdbNoParam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbYesParam)
                .addGap(86, 86, 86))
        );
        pnlConstructLayout.setVerticalGroup(
            pnlConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConstructLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlConstructLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbNoParam)
                    .addComponent(rdbYesParam))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        btnAddTovar.setText("Добавить");
        btnAddTovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTovarActionPerformed(evt);
            }
        });

        btnCancel.setText("Отмена");

        lblClockInfo.setText("50");

        lblPriceInfo.setText("500");

        javax.swing.GroupLayout dlgAddLayout = new javax.swing.GroupLayout(dlgAdd.getContentPane());
        dlgAdd.getContentPane().setLayout(dlgAddLayout);
        dlgAddLayout.setHorizontalGroup(
            dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlConstruct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(dlgAddLayout.createSequentialGroup()
                                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFloor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dlgAddLayout.createSequentialGroup()
                                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spnPlace)
                                            .addComponent(cmbFloor, 0, 200, Short.MAX_VALUE)
                                            .addComponent(scrClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(scrPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(36, 36, 36)
                                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblClockInfo)
                                            .addComponent(lblPriceInfo)))
                                    .addComponent(cmbBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btnAddTovar)
                        .addGap(79, 79, 79)
                        .addComponent(btnCancel)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        dlgAddLayout.setVerticalGroup(
            dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgAddLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbFloor, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(lblFloor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPlace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spnPlace, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrClock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClockInfo))
                .addGap(18, 18, 18)
                .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgAddLayout.createSequentialGroup()
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBonus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbBonus, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(pnlConstruct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(dlgAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddTovar)
                            .addComponent(btnCancel)))
                    .addComponent(lblPriceInfo))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Парковка");
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
                "№", "Этаж", "Место", "Часы", "Цена", "Бонусы и акции"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);

        lbl.setText("Общая сумма");
        lbl.setName("lbl"); // NOI18N

        txt.setEditable(false);
        txt.setName("txt"); // NOI18N

        tlBar.setRollover(true);

        btnAdd.setText("Добавить");
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        tlBar.add(btnAdd);
        tlBar.add(spr1);

        btnDel.setText("Удалить");
        btnDel.setFocusable(false);
        btnDel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        tlBar.add(btnDel);
        tlBar.add(spr2);

        btnDecide.setText("Вычислить");
        btnDecide.setFocusable(false);
        btnDecide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDecide.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDecide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecideActionPerformed(evt);
            }
        });
        tlBar.add(btnDecide);
        tlBar.add(spr3);

        btnExit.setText("Выход");
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tlBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tlBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*TovarOperationImpl tovarOperation = new TovarOperationImpl();
    static DefaultTableModel model = new DefaultTableModel();*/
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        dlgAdd.setSize(500, 510);
        dlgAdd.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDecideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecideActionPerformed
        try{
            txt.setText(Integer.toString(tovarOperation.getSumOfTovar()));
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDecideActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void cmbFloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFloorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFloorActionPerformed

    private void scrClockAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrClockAdjustmentValueChanged
        lblClockInfo.setText(Integer.toString((int) scrClock.getValue()));
    }//GEN-LAST:event_scrClockAdjustmentValueChanged

    private void scrPriceAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrPriceAdjustmentValueChanged
        lblPriceInfo.setText(Integer.toString((int) scrPrice.getValue()));
    }//GEN-LAST:event_scrPriceAdjustmentValueChanged

    private void btnAddTovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTovarActionPerformed
        dlgAdd.setVisible(false);
        // д.б. код для проверки полей на правильность ввода
        Tovar el;
        if (rdbYesParam.isSelected()) {
            el = new Tovar(cmbFloor.getSelectedItem().toString(), (int) spnPlace.getValue(), scrClock.getValue(), scrPrice.getValue(), cmbBonus.getSelectedItem().toString());
        } else {
            el = new Tovar();
            el.setFloor(cmbFloor.getSelectedItem().toString());
            el.setPlace((int) spnPlace.getValue());
            el.setClock(scrClock.getValue());
            el.setPrice(scrPrice.getValue());
            el.setBonus(cmbBonus.getSelectedItem().toString());
        }
        try{
            doVivod(tovarOperation.addNewTovar(el));
        }catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Не удалось добавить. Попытайтесь повторить попытку :" + ex.getMessage() + ".", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddTovarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            tovarOperation = (TovarOperation)Naming.lookup("//localhost:1199/rmiTest02");
            model = (DefaultTableModel)tbl.getModel();
            doVivod(tovarOperation.getListOfTovar());
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        delete();
    }//GEN-LAST:event_btnDelActionPerformed

    private void delete() {
        if(tbl.getSelectedRowCount() != -1) {
            model.removeRow(tbl.getSelectedRow());
        }
    }
    
    private void doVivod(List<Tovar> lstTovar){
        doClearTable();
        int i = 1;
        for(Tovar tovar: lstTovar){
            Object[] rowData = new Object[7];
            rowData[0] = i++;
            rowData[1] = tovar.getFloor();
            rowData[2] = tovar.getPlace();
            rowData[3] = tovar.getClock();
            rowData[4] = tovar.getPrice() * tovar.getClock();
            rowData[5] = tovar.getBonus();
            model.addRow(rowData);
        }
    }

    private void doClearTable(){
        while (model.getRowCount()>0){
            model.removeRow(0);
        }
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
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cmbBonus;
    private javax.swing.JComboBox<String> cmbFloor;
    private javax.swing.JDialog dlgAdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblBonus;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblClockInfo;
    private javax.swing.JLabel lblFloor;
    private javax.swing.JLabel lblPlace;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPriceInfo;
    private javax.swing.JPanel pnlConstruct;
    private javax.swing.JRadioButton rdbNoParam;
    private javax.swing.JRadioButton rdbYesParam;
    private javax.swing.JScrollBar scrClock;
    private javax.swing.JScrollBar scrPrice;
    private javax.swing.JSpinner spnPlace;
    private javax.swing.JToolBar.Separator spr1;
    private javax.swing.JToolBar.Separator spr2;
    private javax.swing.JToolBar.Separator spr3;
    private javax.swing.JTable tbl;
    private javax.swing.JToolBar tlBar;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
