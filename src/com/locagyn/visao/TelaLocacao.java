/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.locagyn.visao;

import com.locagyn.Enumarations.SituacaoDaLocacao;
import com.locagyn.Enumarations.TipoDeCombustivel;
import com.locagyn.LimitarCaracteres.LimitaCaracteres;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ruben
 */
public class TelaLocacao extends javax.swing.JFrame {

    /**
     * Creates new form TelaLocacao1
     */
    public TelaLocacao() {
        initComponents();
        setLocationRelativeTo(null);
        
        //Limitando Caracteres:
        //import com.locagyn.LimitarCaracteres.LimitaCaracteres;
        //jFormattedTextFieldDataFinal.setDocument(new LimitaCaracteres(12, LimitaCaracteres.TipoEntrada.DATA));
        //jFormattedTextFieldDataInicio.setDocument(new LimitaCaracteres(12, LimitaCaracteres.TipoEntrada.DATA));
        jTextFieldValorLocacao.setDocument(new LimitaCaracteres(12, LimitaCaracteres.TipoEntrada.NUMERODECIMAL));
        
//criando metodo para a combobox
        loadComboBox();
    }
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableLocacao = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelRazaoSocial = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldValorLocacao = new javax.swing.JTextField();
        jComboBoxSituacao = new javax.swing.JComboBox<>();
        jFormattedTextFieldDataInicio = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDataInicio1 = new javax.swing.JFormattedTextField();
        jButtonHome = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonLocar = new javax.swing.JButton();
        jButtonDevolver = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableLocacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICADOR", "DESCRIÇÃO", "URL", "LOGO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLocacao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableLocacao.setRowHeight(50);
        jTableLocacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLocacaoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableLocacao);

        jTextFieldID.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jLabelTelefone.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTelefone.setText("Situacao da Locacao");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabelCpf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelCpf.setText("Data de Inicio");

        jLabelRazaoSocial.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelRazaoSocial.setText("Data Final");

        jLabelNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelNome.setText("ID");

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelEmail.setText("Valor da Locacao");

        jTextFieldValorLocacao.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jTextFieldValorLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorLocacaoActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataInicioActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldDataInicio1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataInicio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCpf)
                    .addComponent(jLabel5)
                    .addComponent(jLabelRazaoSocial)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldDataInicio)
                    .addComponent(jFormattedTextFieldDataInicio1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(81, 81, 81)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTelefone)
                    .addComponent(jLabelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldValorLocacao, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(jComboBoxSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNome))
                    .addComponent(jLabelTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelEmail)
                        .addComponent(jTextFieldValorLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jFormattedTextFieldDataInicio1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelRazaoSocial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldDataInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButtonHome.setText("HOME");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        jButtonLocar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/locagyn/icones/search.png"))); // NOI18N
        jButtonLocar.setText("Locar");
        jButtonLocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLocarActionPerformed(evt);
            }
        });

        jButtonDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/locagyn/icones/add.png"))); // NOI18N
        jButtonDevolver.setText("Devolver");
        jButtonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevolverActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/locagyn/icones/exchange1.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButtonLocar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLocar)
                    .addComponent(jButtonDevolver)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOCACAO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableLocacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLocacaoMouseClicked
        // TODO add your handling code here:
        try {
            this.jTextFieldID.setText(jTableLocacao.getValueAt(jTableLocacao.getSelectedRow(), 0).toString());
            this.jTextFieldDataInicio.setText(jTableLocacao.getValueAt(jTableLocacao.getSelectedRow(), 1).toString());
            this.jTextFieldEndereco.setText(jTableLocacao.getValueAt(jTableLocacao.getSelectedRow(), 2).toString());
            String nomeArquivo = (String) this.jTableLocacao.getValueAt(jTableLocacao.getSelectedRow(), 2);
            jTextFieldEndereco.setText(nomeArquivo);
            ImageIcon iconLogo = new ImageIcon(nomeArquivo);
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(jLabelLogo.getWidth(), jLabelLogo.getHeight(), 1));
            jLabelLogo.setIcon(iconLogo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jTableLocacaoMouseClicked

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jTextFieldValorLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorLocacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorLocacaoActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
        TelaHome frame = new TelaHome();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonLocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLocarActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser fc = new JFileChooser();
            File logo = new File("./src/com/locagyn/logos");
            fc.setCurrentDirectory(logo);
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.showOpenDialog(this);
            File arquivo = fc.getSelectedFile();
            String nomeDoArquivo = arquivo.getPath();
            String nome = arquivo.getName();
            String url = logo.getPath();
            url += "/" + nome;
            System.out.println(url);
            jTextFieldEndereco.setText(url);
            ImageIcon iconLogo = new ImageIcon(nomeDoArquivo);
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(jLabelLogo.getWidth(), jLabelLogo.getHeight(), 1));
            jLabelLogo.setIcon(iconLogo);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Selecione a Imagem");
        }
    }//GEN-LAST:event_jButtonLocarActionPerformed

    private void jButtonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevolverActionPerformed
        // TODO add your handling code here:
        try {

            IMarcaControle incluirMarca = new MarcaControle(); // pog

            Marca objeto = new Marca(0, jTextFieldDataInicio.getText(), jTextFieldEndereco.getText());
            marcaControle.incluir(objeto);
            jTextFieldDataInicio.setText("");
            imprimirDadosNaGrid(incluirMarca.listagem());

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonDevolverActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:

        try {

            IMarcaControle incluirMarca = new MarcaControle(); // pog
            Marca objeto = new Marca(Integer.parseInt(jTextFieldID.getText()), jTextFieldDataInicio.getText(), jTextFieldEndereco.getText());
            marcaControle.alterar(objeto);
            imprimirDadosNaGrid(incluirMarca.listagem());
        } catch (Exception ex) {

        }
        jTextFieldDataInicio.setText("");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jFormattedTextFieldDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataInicioActionPerformed

    private void jFormattedTextFieldDataInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataInicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataInicio1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLocacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDevolver;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonLocar;
    private javax.swing.JComboBox<SituacaoDaLocacao> jComboBoxSituacao;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataInicio;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataInicio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRazaoSocial;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableLocacao;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldValorLocacao;
    // End of variables declaration//GEN-END:variables

    private void loadComboBox() {
       jComboBoxSituacao.setModel(new DefaultComboBoxModel<>(SituacaoDaLocacao.values())); 
    }
}