/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fitstab.view;

import conexao.ClassConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;;
/**
 *
 * @author micha
 */
public class TelaAtualizarCliente extends javax.swing.JInternalFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void atualizar() {
       String Sql = "UPDATE tbusuario SET nomeClienteB = ? , cpfClienteB = ?,rgClienteB = ?,estadoCivilClienteB = ?,sexoClienteB = ?,dataNascimentoClienteB = ?,celularClienteB = ?,emailClienteB = ?"
                + ",ruaClienteB = ?,bairroClienteB = ?,cidadeClienteB = ?,estadoClienteB = ?,cepClienteB = ?"
                + " where idClienteB = ?";
        try {
            if (txtClienteID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Favor cadastrar usuario");
            } else {
                pst = con.prepareStatement(Sql);

                pst.setString(1, txtNomeAtualizarCliente.getText());
                pst.setString(2, txtCpfAtualizarCliente.getText());
                pst.setString(3, txtRGAtualizarCliente.getText());
                pst.setString(4, comboEstadoCivilAtualizarCliente.getSelectedItem().toString());
                pst.setString(5, comboAtualizarSexoCliente.getSelectedItem().toString());
                pst.setString(6, txtDataNascAtualizarCliente.getText());
                pst.setString(7, txtCelularAtualizarCliente.getText());
                pst.setString(8, txtEmailAtualizarCliente.getText());
                pst.setString(9, txtRuaAtualizarCliente.getText());
                pst.setString(10, txtBairroAtualizarCliente.getText());
                pst.setString(11, txtCidadeAtualizarCliente.getText());
                pst.setString(12, txtEstadoAtualizarCliente.getText());
                pst.setString(13, txtCepAtualizarCliente.getText());
                pst.setString(14, txtClienteID.getText());

                JOptionPane.showMessageDialog(null, "Campos Atulizados com Sucesso"
                        + "");
                pst.executeUpdate();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar." + e);
        }
    }

    public void consultar() {
        String sql = "SELECT * FROM tbusuario where idClienteB =?";
        try {

            pst = con.prepareStatement(sql);
            pst.setString(1, txtClienteID.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtNomeAtualizarCliente.setText(rs.getString(2));
                txtCpfAtualizarCliente.setText(rs.getString(3));
                txtRGAtualizarCliente.setText(rs.getString(4));
                comboEstadoCivilAtualizarCliente.setSelectedItem(rs.getString(5));
                comboAtualizarSexoCliente.setSelectedItem(rs.getString(6));
                txtDataNascAtualizarCliente.setText(rs.getString(7));
                txtCelularAtualizarCliente.setText(rs.getString(8));
                txtEmailAtualizarCliente.setText(rs.getString(9));
                txtRuaAtualizarCliente.setText(rs.getString(10));
                txtBairroAtualizarCliente.setText(rs.getString(11));
                txtCidadeAtualizarCliente.setText(rs.getString(12));
                txtEstadoAtualizarCliente.setText(rs.getString(13));
                txtCepAtualizarCliente.setText(rs.getString(14));
            

                pst.close();
                comboEstadoCivilAtualizarCliente.setEnabled(true);
                comboAtualizarSexoCliente.setEnabled(true);
                txtNomeAtualizarCliente.setEditable(true);
                txtCpfAtualizarCliente.setEditable(true);
                txtRGAtualizarCliente.setEditable(true);
                comboEstadoCivilAtualizarCliente.setEditable(false);
                comboAtualizarSexoCliente.setEditable(false);
                txtDataNascAtualizarCliente.setEditable(true);
                txtCelularAtualizarCliente.setEditable(true);
                txtEmailAtualizarCliente.setEditable(true);
                txtRuaAtualizarCliente.setEditable(true);
                txtBairroAtualizarCliente.setEditable(true);
                txtCidadeAtualizarCliente.setEditable(true);
                txtEstadoAtualizarCliente.setEditable(true);
                txtCepAtualizarCliente.setEditable(true);
                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public TelaAtualizarCliente() {
        initComponents();
        con = ClassConexao.conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmailAtualizarCliente = new javax.swing.JTextField();
        comboAtualizarSexoCliente = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        comboEstadoCivilAtualizarCliente = new javax.swing.JComboBox<>();
        txtCepAtualizarCliente = new javax.swing.JTextField();
        txtCpfAtualizarCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtAtualizarPesquisarCliente = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtRuaAtualizarCliente = new javax.swing.JTextField();
        txtCidadeAtualizarCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEstadoAtualizarCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bntAtualizarCliente = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtNomeAtualizarCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCelularAtualizarCliente = new javax.swing.JTextField();
        txtRGAtualizarCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtClienteID = new javax.swing.JTextField();
        txtDataNascAtualizarCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBairroAtualizarCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        txtEmailAtualizarCliente.setEditable(false);

        comboAtualizarSexoCliente.setEditable(true);
        comboAtualizarSexoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino\t", "Indefinido" }));
        comboAtualizarSexoCliente.setEnabled(false);

        jLabel12.setText("Cep");
        jLabel12.setEnabled(false);

        comboEstadoCivilAtualizarCliente.setEditable(true);
        comboEstadoCivilAtualizarCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casado", "Solteiro" }));
        comboEstadoCivilAtualizarCliente.setEnabled(false);

        txtCepAtualizarCliente.setEditable(false);

        txtCpfAtualizarCliente.setEditable(false);

        jLabel13.setText("Nome");
        jLabel13.setEnabled(false);

        jLabel1.setText("CPF");
        jLabel1.setEnabled(false);

        txtAtualizarPesquisarCliente.setText("Pesquisar");
        txtAtualizarPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtualizarPesquisarClienteActionPerformed(evt);
            }
        });

        jLabel14.setText("Digite o ID");

        txtRuaAtualizarCliente.setEditable(false);

        txtCidadeAtualizarCliente.setEditable(false);

        jLabel7.setText("E-Mail");
        jLabel7.setEnabled(false);

        jLabel8.setText("Rua");
        jLabel8.setEnabled(false);

        txtEstadoAtualizarCliente.setEditable(false);

        jLabel9.setText("Bairro");
        jLabel9.setEnabled(false);

        bntAtualizarCliente.setText("Atualizar Cliente");
        bntAtualizarCliente.setEnabled(false);
        bntAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAtualizarClienteActionPerformed(evt);
            }
        });

        jLabel10.setText("Cidade");
        jLabel10.setEnabled(false);

        txtNomeAtualizarCliente.setEditable(false);

        jLabel11.setText("Estado");
        jLabel11.setEnabled(false);

        txtCelularAtualizarCliente.setEditable(false);

        txtRGAtualizarCliente.setEditable(false);

        jLabel2.setText("RG");
        jLabel2.setEnabled(false);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel15.setText("Tela Atualizar Cliente");

        txtDataNascAtualizarCliente.setEditable(false);

        jLabel3.setText("Estado Cilvil");
        jLabel3.setEnabled(false);

        jLabel4.setText("Sexo");
        jLabel4.setEnabled(false);

        jLabel5.setText("Data Nascimento");
        jLabel5.setEnabled(false);

        txtBairroAtualizarCliente.setEditable(false);

        jLabel6.setText("Celular");
        jLabel6.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtAtualizarPesquisarCliente)
                        .addGap(95, 95, 95)
                        .addComponent(bntAtualizarCliente)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(67, 67, 67)
                                .addComponent(txtNomeAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(79, 79, 79)
                                .addComponent(txtCpfAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(85, 85, 85)
                                .addComponent(txtRGAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(36, 36, 36)
                                .addComponent(comboEstadoCivilAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(63, 63, 63)
                                .addComponent(txtCelularAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(66, 66, 66)
                                .addComponent(txtEmailAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(75, 75, 75)
                                                .addComponent(comboAtualizarSexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(9, 9, 9)
                                                .addComponent(txtDataNascAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel12)
                                        .addGap(59, 59, 59))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRuaAtualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(txtBairroAtualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(txtCidadeAtualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(txtEstadoAtualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(txtCepAtualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))))
                        .addContainerGap(9, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtClienteID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAtualizarPesquisarCliente)
                    .addComponent(bntAtualizarCliente))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtNomeAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtRuaAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtCpfAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtBairroAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtRGAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCidadeAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtEstadoAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(comboEstadoCivilAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtCepAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(comboAtualizarSexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtDataNascAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtCelularAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(txtEmailAtualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAtualizarPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtualizarPesquisarClienteActionPerformed
        consultar();
        bntAtualizarCliente.setEnabled(true);
    }//GEN-LAST:event_txtAtualizarPesquisarClienteActionPerformed

    private void bntAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAtualizarClienteActionPerformed
        atualizar();
    }//GEN-LAST:event_bntAtualizarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAtualizarCliente;
    private javax.swing.JComboBox<String> comboAtualizarSexoCliente;
    private javax.swing.JComboBox<String> comboEstadoCivilAtualizarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton txtAtualizarPesquisarCliente;
    private javax.swing.JTextField txtBairroAtualizarCliente;
    private javax.swing.JTextField txtCelularAtualizarCliente;
    private javax.swing.JTextField txtCepAtualizarCliente;
    private javax.swing.JTextField txtCidadeAtualizarCliente;
    private javax.swing.JTextField txtClienteID;
    private javax.swing.JTextField txtCpfAtualizarCliente;
    private javax.swing.JTextField txtDataNascAtualizarCliente;
    private javax.swing.JTextField txtEmailAtualizarCliente;
    private javax.swing.JTextField txtEstadoAtualizarCliente;
    private javax.swing.JTextField txtNomeAtualizarCliente;
    private javax.swing.JTextField txtRGAtualizarCliente;
    private javax.swing.JTextField txtRuaAtualizarCliente;
    // End of variables declaration//GEN-END:variables
}
