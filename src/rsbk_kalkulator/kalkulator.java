package rsbk_kalkulator;

public class kalkulator extends javax.swing.JFrame {
    float nilai, hitung, hasil;
    String tulis = "";
    String angka = "";
    String tanda = "+";
    
    public kalkulator() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnreset = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnsamadengan = new javax.swing.JButton();
        btnbagi = new javax.swing.JButton();
        btnkali = new javax.swing.JButton();
        btnkurang = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        txthitung = new javax.swing.JTextField();
        txthasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setMinimumSize(new java.awt.Dimension(255, 440));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnreset.setBackground(new java.awt.Color(255, 0, 0));
        btnreset.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnreset.setText("CE");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, 50));

        btn0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 170, 50));

        btn1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 50, 50));

        btn2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 50, 50));

        btn3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 50, 50));

        btn4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 50, 50));

        btn5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 50, 50));

        btn6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 50, 50));

        btn7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, 50));

        btn8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 50, 50));

        btn9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 50, 50));

        btnsamadengan.setBackground(new java.awt.Color(51, 255, 51));
        btnsamadengan.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnsamadengan.setText("=");
        btnsamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsamadenganActionPerformed(evt);
            }
        });
        getContentPane().add(btnsamadengan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 50, 50));

        btnbagi.setBackground(new java.awt.Color(255, 255, 0));
        btnbagi.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnbagi.setText("/");
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });
        getContentPane().add(btnbagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 50, 50));

        btnkali.setBackground(new java.awt.Color(255, 255, 0));
        btnkali.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnkali.setText("x");
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnkali, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 50, 50));

        btnkurang.setBackground(new java.awt.Color(255, 255, 0));
        btnkurang.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnkurang.setText("-");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });
        getContentPane().add(btnkurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 50, 50));

        btntambah.setBackground(new java.awt.Color(255, 255, 0));
        btntambah.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        getContentPane().add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 50, 50));

        txthitung.setEditable(false);
        txthitung.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        txthitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthitungActionPerformed(evt);
            }
        });
        getContentPane().add(txthitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 230, 50));

        txthasil.setEditable(false);
        txthasil.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txthasil.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        getContentPane().add(txthasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 230, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        tanda = "+";
        txthitung.setText("");
        txthasil.setText("");
        angka = "";
        tulis = "";
        hasil = 0;
        hitung = 0;
        
    }//GEN-LAST:event_btnresetActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if (angka.equals("0")){
            tulis += "";
            angka = "0";
            txthitung.setText(tulis);
        }
        else if (tanda.equals("=")){
            hasil=0;
            tanda = "+";
            tulis = "0";
            angka = "0";
            txthitung.setText(tulis);
            txthasil.setText("");
        }
        else if (!(angka.equals("")&&tanda.equals("/"))){
            tulis += "0";
            angka += "0";
            hitung *= 10;
            hitung += 0;
            txthitung.setText(tulis);
        } 
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (tanda.equals("=")){
            hasil=0;
            tanda = "+";
            tulis = "1";
            angka = "1";
            txthitung.setText(tulis);
            txthasil.setText("");
        }
        else if (angka.equals("0")){
            String substring = tulis.substring(0,tulis.length()-1);
            tulis = substring + "1";
            angka = "1";
            txthitung.setText(tulis);
        }
        else{
            tulis += "1";
            angka += "1";
            txthitung.setText(tulis);
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (tanda.equals("=")){
            hasil=0;
            tanda = "+";
            tulis = "2";
            angka = "2";
            txthitung.setText(tulis);
            txthasil.setText("");
        }
        else if (angka.equals("0")){
            String substring = tulis.substring(0,tulis.length()-1);
            tulis = substring + "2";
            angka = "2";
            txthitung.setText(tulis);
        }
        else{
            tulis += "2";
            angka += "2";
            txthitung.setText(tulis);
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (tanda.equals("=")){
            hasil=0;
            tanda = "+";
            tulis = "3";
            angka = "3";
            txthitung.setText(tulis);
            txthasil.setText("");
        }
        else if (angka.equals("0")){
            String substring = tulis.substring(0,tulis.length()-1);
            tulis = substring + "3";
            angka = "3";
            txthitung.setText(tulis);
        }
        else{
            tulis += "3";
            angka += "3";
            txthitung.setText(tulis);
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (tanda.equals("=")){
            hasil=0;
            tanda = "+";
            tulis = "4";
            angka = "4";
            txthitung.setText(tulis);
            txthasil.setText("");
        }
        else if (angka.equals("0")){
            String substring = tulis.substring(0,tulis.length()-1);
            tulis = substring + "4";
            angka = "4";
            txthitung.setText(tulis);
        }
        else{
            tulis += "4";
            angka += "4";
            txthitung.setText(tulis);
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (tanda.equals("=")){
            hasil=0;
            tanda = "+";
            tulis = "5";
            angka = "5";
            txthitung.setText(tulis);
            txthasil.setText("");
        }
        else if (angka.equals("0")){
            String substring = tulis.substring(0,tulis.length()-1);
            tulis = substring + "5";
            angka = "5";
            txthitung.setText(tulis);
        }
        else{
            tulis += "5";
            angka += "5";
            txthitung.setText(tulis);
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (tanda.equals("=")){
            hasil=0;
            tanda = "+";
            tulis = "6";
            angka = "6";
            txthitung.setText(tulis);
            txthasil.setText("");
        }
        else if (angka.equals("0")){
            String substring = tulis.substring(0,tulis.length()-1);
            tulis = substring + "6";
            angka = "6";
            txthitung.setText(tulis);
        }
        else{
            tulis += "6";
            angka += "6";
            txthitung.setText(tulis);
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (tanda.equals("=")){
            hasil=0;
            tanda = "+";
            tulis = "7";
            angka = "7";
            txthitung.setText(tulis);
            txthasil.setText("");
        }
        else if (angka.equals("0")){
            String substring = tulis.substring(0,tulis.length()-1);
            tulis = substring + "7";
            angka = "7";
            txthitung.setText(tulis);
        }
        else{
            tulis += "7";
            angka += "7";
            txthitung.setText(tulis);
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (tanda.equals("=")){
            hasil=0;
            tanda = "+";
            tulis = "8";
            angka = "8";
            txthitung.setText(tulis);
            txthasil.setText("");
        }
        else if (angka.equals("0")){
            String substring = tulis.substring(0,tulis.length()-1);
            tulis = substring + "8";
            angka = "8";
            txthitung.setText(tulis);
        }
        else{
            tulis += "8";
            angka += "8";
            txthitung.setText(tulis);
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (tanda.equals("=")){
            hasil=0;
            tanda = "+";
            tulis = "9";
            angka = "9";
            txthitung.setText(tulis);
            txthasil.setText("");
        }
        else if (angka.equals("0")){
            String substring = tulis.substring(0,tulis.length()-1);
            tulis = substring + "9";
            angka = "9";
            txthitung.setText(tulis);
        }
        else{
            tulis += "9";
            angka += "9";
            txthitung.setText(tulis);
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnsamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsamadenganActionPerformed
        if (!angka.equals("")){
        switch (tanda) {
            case "/":
                tanda = "=";
                tulis += "=";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung /= nilai;
                hasil += hitung;
                txthasil.setText(String.valueOf(hasil));
                angka = "";
                hitung =0;
                break;
            case "*":
                tanda = "=";
                tulis += "=";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung *= nilai;
                hasil += hitung;
                txthasil.setText(String.valueOf(hasil));
                angka = "";
                hitung = 0;
                break;
            case "-":
                tanda = "=";
                tulis += "=";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung = nilai;
                hasil -= hitung;
                txthasil.setText(String.valueOf(hasil));
                angka = "";
                hitung = 0;
                break;
            case "+":
                tanda = "=";
                tulis += "=";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung = nilai;
                hasil += hitung;
                txthasil.setText(String.valueOf(hasil));
                angka = "";
                hitung = 0;
                break;
            default:
                break;
        }}
        
    }//GEN-LAST:event_btnsamadenganActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
        if (!angka.equals("")||tanda.equals("=")){
        switch (tanda) {
            case "=":
                txthasil.setText("");
                tanda = "/";
                tulis = Float.toString(hasil)+"/";
                txthitung.setText(tulis);
                hitung = hasil;
                angka = "";
                hasil = 0;
                break;
            case "/":
                tanda = "/";
                tulis += "/";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung /= nilai;
                angka = "";
                break;
            case "*":
                tanda = "/";
                tulis += "/";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung *= nilai;
                angka = "";
                break;
            case "-":
                tanda = "/";
                tulis += "/";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                nilai *= -1;
                hitung = nilai;
                angka = "";
                break;
            case "+":
                tanda = "/";
                tulis += "/";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung = nilai;
                angka = "";
                break;
            default:
                break;
        }}
    }//GEN-LAST:event_btnbagiActionPerformed

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
        if (!angka.equals("")||tanda.equals("=")){
        switch (tanda) {
            case "=":
                txthasil.setText("");
                tanda = "*";
                tulis = Float.toString(hasil)+"x";
                txthitung.setText(tulis);
                hitung = hasil;
                angka = "";
                hasil = 0;
                break;
            case "/":
                tanda = "*";
                tulis += "x";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung /= nilai;
                angka = "";
                break;
            case "*":
                tanda = "*";
                tulis += "x";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung *= nilai;
                angka = "";
                break;
            case "-":
                tanda = "*";
                tulis += "x";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                nilai *= -1;
                hitung = nilai;
                angka = "";
                break;
            case "+":
                tanda = "*";
                tulis += "x";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung = nilai;
                angka = "";
                break;
            default:
                break;
        }}
    }//GEN-LAST:event_btnkaliActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
        if (!angka.equals("")||tanda.equals("=")){
        switch (tanda) {
            case "=":
                txthasil.setText("");
                tanda = "-";
                tulis = Float.toString(hasil)+"-";
                txthitung.setText(tulis);
                angka = "";
                hitung = 0;
                break;
            case "/":
                tanda = "-";
                tulis += "-";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung /= nilai;
                hasil += hitung;
                angka = "";
                hitung = 0;
                break;
            case "*":
                tanda = "-";
                tulis += "-";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung *= nilai;
                hasil += hitung;
                angka = "";
                hitung = 0;
                break;
            case "-":
                tanda = "-";
                tulis += "-";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung = nilai;
                hasil -= hitung;
                angka = "";
                hitung = 0;
                break;
            case "+":
                tanda = "-";
                tulis += "-";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung = nilai;
                hasil += hitung;
                angka = "";
                hitung = 0;
                break;
            default:
                break;
        }}
    }//GEN-LAST:event_btnkurangActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        if (!angka.equals("")||tanda.equals("=")){
        switch (tanda) {
            case "=":
                txthasil.setText("");
                tanda = "+";
                tulis = Float.toString(hasil)+"+";
                txthitung.setText(tulis);
                angka = "";
                hitung =0;
                break;
            case "/":
                tanda = "+";
                tulis += "+";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung /= nilai;
                hasil += hitung;
                angka = "";
                hitung = 0;
                break;
            case "*":
                tanda = "+";
                tulis += "+";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung *= nilai;
                hasil += hitung;
                angka = "";
                hitung = 0;
                break;
            case "-":
                tanda = "+";
                tulis += "+";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung = nilai;
                hasil -= hitung;
                angka = "";
                hitung = 0;
                break;
            case "+":
                tanda = "+";
                tulis += "+";
                txthitung.setText(tulis);
                nilai = Float.parseFloat(angka);
                hitung = nilai;
                hasil += hitung;
                angka = "";
                hitung = 0;
                break;
            default:
                break;
        }}
    }//GEN-LAST:event_btntambahActionPerformed

    private void txthitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthitungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthitungActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnbagi;
    private javax.swing.JButton btnkali;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsamadengan;
    private javax.swing.JButton btntambah;
    private javax.swing.JTextField txthasil;
    private javax.swing.JTextField txthitung;
    // End of variables declaration//GEN-END:variables
}
