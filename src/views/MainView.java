/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author lenovo
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form vista1
     */
    public MainView() {
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

        system = new javax.swing.ButtonGroup();
        MAIN = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_main = new javax.swing.JLabel();
        btn_change = new javax.swing.JButton();
        pnl_select = new javax.swing.JPanel();
        radio_dec = new javax.swing.JRadioButton();
        radio_hex = new javax.swing.JRadioButton();
        radio_oct = new javax.swing.JRadioButton();
        radio_bin = new javax.swing.JRadioButton();
        pnl_results = new javax.swing.JPanel();
        lbl_dec = new javax.swing.JLabel();
        lbl_hex = new javax.swing.JLabel();
        lbl_oct = new javax.swing.JLabel();
        lbl_bin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnl_var = new javax.swing.JPanel();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_cf = new javax.swing.JButton();
        btn_ce = new javax.swing.JButton();
        btn_a = new javax.swing.JButton();
        btn_b = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_d = new javax.swing.JButton();
        btn_e = new javax.swing.JButton();
        btn_f = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        MAIN.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_main.setBackground(new java.awt.Color(0, 0, 0));
        lbl_main.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N
        lbl_main.setForeground(new java.awt.Color(255, 255, 255));
        lbl_main.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_change.setBackground(new java.awt.Color(0, 0, 0));
        btn_change.setForeground(new java.awt.Color(255, 255, 255));
        btn_change.setText("Convert");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btn_change)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl_main, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_change)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_select.setBackground(new java.awt.Color(51, 51, 51));
        pnl_select.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        radio_dec.setBackground(new java.awt.Color(51, 51, 51));
        system.add(radio_dec);
        radio_dec.setForeground(new java.awt.Color(255, 255, 255));
        radio_dec.setText("DEC");

        radio_hex.setBackground(new java.awt.Color(51, 51, 51));
        system.add(radio_hex);
        radio_hex.setForeground(new java.awt.Color(255, 255, 255));
        radio_hex.setText("HEX");

        radio_oct.setBackground(new java.awt.Color(51, 51, 51));
        system.add(radio_oct);
        radio_oct.setForeground(new java.awt.Color(255, 255, 255));
        radio_oct.setText("OCT");

        radio_bin.setBackground(new java.awt.Color(51, 51, 51));
        system.add(radio_bin);
        radio_bin.setForeground(new java.awt.Color(255, 255, 255));
        radio_bin.setText("BIN");

        javax.swing.GroupLayout pnl_selectLayout = new javax.swing.GroupLayout(pnl_select);
        pnl_select.setLayout(pnl_selectLayout);
        pnl_selectLayout.setHorizontalGroup(
            pnl_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_selectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio_dec)
                    .addComponent(radio_hex)
                    .addComponent(radio_oct)
                    .addComponent(radio_bin))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnl_selectLayout.setVerticalGroup(
            pnl_selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_selectLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(radio_dec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio_hex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio_oct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio_bin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_results.setBackground(new java.awt.Color(51, 51, 51));
        pnl_results.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_dec.setBackground(new java.awt.Color(0, 0, 0));
        lbl_dec.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lbl_dec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_dec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_hex.setBackground(new java.awt.Color(0, 0, 0));
        lbl_hex.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lbl_hex.setForeground(new java.awt.Color(255, 255, 255));
        lbl_hex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_oct.setBackground(new java.awt.Color(0, 0, 0));
        lbl_oct.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lbl_oct.setForeground(new java.awt.Color(255, 255, 255));
        lbl_oct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_bin.setBackground(new java.awt.Color(0, 0, 0));
        lbl_bin.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        lbl_bin.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DEC");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HEX");

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("OCT");

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BIN");

        javax.swing.GroupLayout pnl_resultsLayout = new javax.swing.GroupLayout(pnl_results);
        pnl_results.setLayout(pnl_resultsLayout);
        pnl_resultsLayout.setHorizontalGroup(
            pnl_resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_resultsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pnl_resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_bin, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(lbl_oct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_hex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_dec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_resultsLayout.setVerticalGroup(
            pnl_resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_resultsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(lbl_dec, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_hex, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(lbl_oct, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_resultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_bin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_var.setBackground(new java.awt.Color(51, 51, 51));
        pnl_var.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_1.setBackground(new java.awt.Color(0, 0, 0));
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setText("1");

        btn_2.setBackground(new java.awt.Color(0, 0, 0));
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setText("2");

        btn_3.setBackground(new java.awt.Color(0, 0, 0));
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setText("3");

        btn_4.setBackground(new java.awt.Color(0, 0, 0));
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setText("4");

        btn_5.setBackground(new java.awt.Color(0, 0, 0));
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setText("5");

        btn_6.setBackground(new java.awt.Color(0, 0, 0));
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setText("6");

        btn_7.setBackground(new java.awt.Color(0, 0, 0));
        btn_7.setForeground(new java.awt.Color(255, 255, 255));
        btn_7.setText("7");

        btn_8.setBackground(new java.awt.Color(0, 0, 0));
        btn_8.setForeground(new java.awt.Color(255, 255, 255));
        btn_8.setText("8");

        btn_9.setBackground(new java.awt.Color(0, 0, 0));
        btn_9.setForeground(new java.awt.Color(255, 255, 255));
        btn_9.setText("9");

        btn_cf.setBackground(new java.awt.Color(0, 0, 0));
        btn_cf.setForeground(new java.awt.Color(255, 255, 255));
        btn_cf.setText("C");

        btn_ce.setBackground(new java.awt.Color(0, 0, 0));
        btn_ce.setForeground(new java.awt.Color(255, 255, 255));
        btn_ce.setText("CE");

        btn_a.setBackground(new java.awt.Color(0, 0, 0));
        btn_a.setForeground(new java.awt.Color(255, 255, 255));
        btn_a.setText("A");

        btn_b.setBackground(new java.awt.Color(0, 0, 0));
        btn_b.setForeground(new java.awt.Color(255, 255, 255));
        btn_b.setText("B");

        btn_c.setBackground(new java.awt.Color(0, 0, 0));
        btn_c.setForeground(new java.awt.Color(255, 255, 255));
        btn_c.setText("C");

        btn_d.setBackground(new java.awt.Color(0, 0, 0));
        btn_d.setForeground(new java.awt.Color(255, 255, 255));
        btn_d.setText("D");

        btn_e.setBackground(new java.awt.Color(0, 0, 0));
        btn_e.setForeground(new java.awt.Color(255, 255, 255));
        btn_e.setText("E");

        btn_f.setBackground(new java.awt.Color(0, 0, 0));
        btn_f.setForeground(new java.awt.Color(255, 255, 255));
        btn_f.setText("F");

        btn_0.setBackground(new java.awt.Color(0, 0, 0));
        btn_0.setForeground(new java.awt.Color(255, 255, 255));
        btn_0.setText("0");

        javax.swing.GroupLayout pnl_varLayout = new javax.swing.GroupLayout(pnl_var);
        pnl_var.setLayout(pnl_varLayout);
        pnl_varLayout.setHorizontalGroup(
            pnl_varLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_varLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_varLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_varLayout.createSequentialGroup()
                        .addGroup(pnl_varLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_cf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ce, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(btn_0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_varLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_varLayout.createSequentialGroup()
                                .addComponent(btn_7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_9))
                            .addGroup(pnl_varLayout.createSequentialGroup()
                                .addComponent(btn_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_3))
                            .addGroup(pnl_varLayout.createSequentialGroup()
                                .addComponent(btn_4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_varLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnl_varLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_a, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_d, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_varLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_varLayout.createSequentialGroup()
                                .addComponent(btn_b)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_c))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_varLayout.createSequentialGroup()
                                .addComponent(btn_e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_f)))))
                .addContainerGap())
        );
        pnl_varLayout.setVerticalGroup(
            pnl_varLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_varLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_varLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_1)
                    .addComponent(btn_2)
                    .addComponent(btn_3)
                    .addComponent(btn_0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_varLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_4)
                    .addComponent(btn_5)
                    .addComponent(btn_6)
                    .addComponent(btn_cf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_varLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_7)
                    .addComponent(btn_8)
                    .addComponent(btn_9)
                    .addComponent(btn_ce))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_varLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_a)
                    .addComponent(btn_b)
                    .addComponent(btn_c))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_varLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_d)
                    .addComponent(btn_e)
                    .addComponent(btn_f))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MAINLayout = new javax.swing.GroupLayout(MAIN);
        MAIN.setLayout(MAINLayout);
        MAINLayout.setHorizontalGroup(
            MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAINLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MAINLayout.createSequentialGroup()
                        .addComponent(pnl_var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MAINLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_results, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MAINLayout.setVerticalGroup(
            MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAINLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_results, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN, javax.swing.GroupLayout.PREFERRED_SIZE, 332, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MAIN;
    public javax.swing.JButton btn_0;
    public javax.swing.JButton btn_1;
    public javax.swing.JButton btn_2;
    public javax.swing.JButton btn_3;
    public javax.swing.JButton btn_4;
    public javax.swing.JButton btn_5;
    public javax.swing.JButton btn_6;
    public javax.swing.JButton btn_7;
    public javax.swing.JButton btn_8;
    public javax.swing.JButton btn_9;
    public javax.swing.JButton btn_a;
    public javax.swing.JButton btn_b;
    public javax.swing.JButton btn_c;
    public javax.swing.JButton btn_ce;
    public javax.swing.JButton btn_cf;
    public javax.swing.JButton btn_change;
    public javax.swing.JButton btn_d;
    public javax.swing.JButton btn_e;
    public javax.swing.JButton btn_f;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbl_bin;
    public javax.swing.JLabel lbl_dec;
    public javax.swing.JLabel lbl_hex;
    public javax.swing.JLabel lbl_main;
    public javax.swing.JLabel lbl_oct;
    private javax.swing.JPanel pnl_results;
    private javax.swing.JPanel pnl_select;
    private javax.swing.JPanel pnl_var;
    public javax.swing.JRadioButton radio_bin;
    public javax.swing.JRadioButton radio_dec;
    public javax.swing.JRadioButton radio_hex;
    public javax.swing.JRadioButton radio_oct;
    private javax.swing.ButtonGroup system;
    // End of variables declaration//GEN-END:variables
}
