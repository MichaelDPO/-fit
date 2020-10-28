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
import javax.swing.JOptionPane;

;

public class TelaAtualizarFuncionario extends javax.swing.JInternalFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void atualizar() {
        String Sql = "UPDATE tbFuncionario SET nomeFuncionarioB = ? , cpfFuncionarioB = ?,rgFuncionarioB = ?,estadoCivilFuncionarioB = ?,sexoFuncionarioB = ?,dataNascimentoFuncionarioB = ?,celularFuncionarioB = ?,emailFuncionarioB = ?"
                + ",ruaFuncionarioB = ?,bairroFuncionarioB = ?,cidadeFuncionarioB = ?,estadoFuncionarioB = ?,cepFuncionarioB = ?,especialidadeFuncionarioB = ? "
                + " where idFuncionarioB = ?";
        try {
            if (txtFuncionarioID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Favor cadastrar usuario");
            } else {
                pst = con.prepareStatement(Sql);

                pst.setString(1, txtNomeAtualizarFuncionario.getText());
                pst.setString(2, txtCpfAtualizarFuncionario.getText());
                pst.setString(3, txtRGAtualizarFuncionario.getText());
                pst.setString(4, comboEstadoCivilAtualizarFuncionario.getSelectedItem().toString());
                pst.setString(5, comboAtualizarSexoFuncionario.getSelectedItem().toString());
                pst.setString(6, txtDataNascAtualizarFuncionario.getText());
                pst.setString(7, txtCelularAtualizarFuncionario.getText());
                pst.setString(8, txtEmailAtualizarFuncionario.getText());
                pst.setString(9, txtRuaAtualizarFuncionario.getText());
                pst.setString(10, txtBairroAtualizarFuncionario.getText());
                pst.setString(11, txtCidadeAtualizarFuncionario.getText());
                pst.setString(12, txtEstadoAtualizarFuncionario.getText());
                pst.setString(13, txtCepAtualizarFuncionario.getText());
                pst.setString(14, txtEspecialidadeAtualizarFuncionario.getText());
                pst.setString(15, txtFuncionarioID.getText());

                JOptionPane.showMessageDialog(null, "Campos Atulizados com Sucesso"
                        + "");
                pst.executeUpdate();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar." + e);
        }
    }

    public void consultar() {
        String sql = "SELECT * FROM tbFuncionario where idFuncionarioB =?";
        try {

            pst = con.prepareStatement(sql);
            pst.setString(1, txtFuncionarioID.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtNomeAtualizarFuncionario.setText(rs.getString(2));
                txtCpfAtualizarFuncionario.setText(rs.getString(3));
                txtRGAtualizarFuncionario.setText(rs.getString(4));
                comboEstadoCivilAtualizarFuncionario.setSelectedItem(rs.getString(5));
                comboAtualizarSexoFuncionario.setSelectedItem(rs.getString(6));
                txtDataNascAtualizarFuncionario.setText(rs.getString(7));
                txtCelularAtualizarFuncionario.setText(rs.getString(8));
                txtEmailAtualizarFuncionario.setText(rs.getString(9));
                txtRuaAtualizarFuncionario.setText(rs.getString(10));
                txtBairroAtualizarFuncionario.setText(rs.getString(11));
                txtCidadeAtualizarFuncionario.setText(rs.getString(12));
                txtEstadoAtualizarFuncionario.setText(rs.getString(13));
                txtCepAtualizarFuncionario.setText(rs.getString(14));
                txtEspecialidadeAtualizarFuncionario.setText(rs.getString(15));

                pst.close();
                comboEstadoCivilAtualizarFuncionario.setEnabled(true);
                comboAtualizarSexoFuncionario.setEnabled(true);
                txtNomeAtualizarFuncionario.setEditable(true);
                txtCpfAtualizarFuncionario.setEditable(true);
                txtRGAtualizarFuncionario.setEditable(true);
                comboEstadoCivilAtualizarFuncionario.setEditable(false);
                comboAtualizarSexoFuncionario.setEditable(false);
                txtDataNascAtualizarFuncionario.setEditable(true);
                txtCelularAtualizarFuncionario.setEditable(true);
                txtEmailAtualizarFuncionario.setEditable(true);
                txtRuaAtualizarFuncionario.setEditable(true);
                txtBairroAtualizarFuncionario.setEditable(true);
                txtCidadeAtualizarFuncionario.setEditable(true);
                txtEstadoAtualizarFuncionario.setEditable(true);
                txtCepAtualizarFuncionario.setEditable(true);
                txtEspecialidadeAtualizarFuncionario.setEditable(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public TelaAtualizarFuncionario() {
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

        txtCidadeAtualizarFuncionario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtEstadoAtualizarFuncionario = new javax.swing.JTextField();
        txtEspecialidadeAtualizarFuncionario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bntAtualizarFuncionario = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtNomeAtualizarFuncionario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCelularAtualizarFuncionario = new javax.swing.JTextField();
        txtEmailAtualizarFuncionario = new javax.swing.JTextField();
        comboAtualizarSexoFuncionario = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        comboEstadoCivilAtualizarFuncionario = new javax.swing.JComboBox<>();
        txtCepAtualizarFuncionario = new javax.swing.JTextField();
        txtCpfAtualizarFuncionario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtAtualizarPesquisarFuncionario = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtRGAtualizarFuncionario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtFuncionarioID = new javax.swing.JTextField();
        txtDataNascAtualizarFuncionario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBairroAtualizarFuncionario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRuaAtualizarFuncionario = new javax.swing.JTextField();

        txtCidadeAtualizarFuncionario.setEditable(false);

        jLabel7.setText("E-Mail");
        jLabel7.setEnabled(false);

        jLabel8.setText("Rua");
        jLabel8.setEnabled(false);

        jLabel16.setText("Especialidade");
        jLabel16.setEnabled(false);

        txtEstadoAtualizarFuncionario.setEditable(false);

        txtEspecialidadeAtualizarFuncionario.setEditable(false);

        jLabel9.setText("Bairro");
        jLabel9.setEnabled(false);

        bntAtualizarFuncionario.setText("Atualizar Funcionario");
        bntAtualizarFuncionario.setEnabled(false);
        bntAtualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAtualizarFuncionarioActionPerformed(evt);
            }
        });

        jLabel10.setText("Cidade");
        jLabel10.setEnabled(false);

        txtNomeAtualizarFuncionario.setEditable(false);

        jLabel11.setText("Estado");
        jLabel11.setEnabled(false);

        txtCelularAtualizarFuncionario.setEditable(false);

        txtEmailAtualizarFuncionario.setEditable(false);

        comboAtualizarSexoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Indefinido" }));
        comboAtualizarSexoFuncionario.setEnabled(false);

        jLabel12.setText("Cep");
        jLabel12.setEnabled(false);

        comboEstadoCivilAtualizarFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casado\t", "Solteiro" }));
        comboEstadoCivilAtualizarFuncionario.setEnabled(false);

        txtCepAtualizarFuncionario.setEditable(false);

        txtCpfAtualizarFuncionario.setEditable(false);

        jLabel13.setText("Nome");
        jLabel13.setEnabled(false);

        jLabel1.setText("CPF");
        jLabel1.setEnabled(false);

        txtAtualizarPesquisarFuncionario.setText("Pesquisar");
        txtAtualizarPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtualizarPesquisarFuncionarioActionPerformed(evt);
            }
        });

        jLabel14.setText("Digite o ID");

        txtRGAtualizarFuncionario.setEditable(false);

        jLabel2.setText("RG");
        jLabel2.setEnabled(false);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel15.setText("Tela Atualizar Funcionario");

        txtDataNascAtualizarFuncionario.setEditable(false);

        jLabel3.setText("Estado Cilvil");
        jLabel3.setEnabled(false);

        jLabel4.setText("Sexo");
        jLabel4.setEnabled(false);

        jLabel5.setText("Data Nascimento");
        jLabel5.setEnabled(false);

        txtBairroAtualizarFuncionario.setEditable(false);

        jLabel6.setText("Celular");
        jLabel6.setEnabled(false);

        txtRuaAtualizarFuncionario.setEditable(false);

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
                        .addComponent(txtFuncionarioID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtAtualizarPesquisarFuncionario)
                        .addGap(95, 95, 95)
                        .addComponent(bntAtualizarFuncionario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(67, 67, 67)
                                .addComponent(txtNomeAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(79, 79, 79)
                                .addComponent(txtCpfAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(85, 85, 85)
                                .addComponent(txtRGAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(36, 36, 36)
                                .addComponent(comboEstadoCivilAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(63, 63, 63)
                                .addComponent(txtCelularAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(66, 66, 66)
                                .addComponent(txtEmailAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(75, 75, 75)
                                        .addComponent(comboAtualizarSexoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(9, 9, 9)
                                        .addComponent(txtDataNascAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel12))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtRuaAtualizarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                            .addComponent(txtBairroAtualizarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                            .addComponent(txtCidadeAtualizarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                            .addComponent(txtEstadoAtualizarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                            .addComponent(txtCepAtualizarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEspecialidadeAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtFuncionarioID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAtualizarPesquisarFuncionario)
                    .addComponent(bntAtualizarFuncionario))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtNomeAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtRuaAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtCpfAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtBairroAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtRGAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCidadeAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtEstadoAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(comboEstadoCivilAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtCepAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(comboAtualizarSexoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtDataNascAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txtEspecialidadeAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtCelularAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(txtEmailAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntAtualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAtualizarFuncionarioActionPerformed
        atualizar();
    }//GEN-LAST:event_bntAtualizarFuncionarioActionPerformed

    private void txtAtualizarPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtualizarPesquisarFuncionarioActionPerformed
        consultar();
        bntAtualizarFuncionario.setEnabled(true);
    }//GEN-LAST:event_txtAtualizarPesquisarFuncionarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAtualizarFuncionario;
    private javax.swing.JComboBox<String> comboAtualizarSexoFuncionario;
    private javax.swing.JComboBox<String> comboEstadoCivilAtualizarFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton txtAtualizarPesquisarFuncionario;
    private javax.swing.JTextField txtBairroAtualizarFuncionario;
    private javax.swing.JTextField txtCelularAtualizarFuncionario;
    private javax.swing.JTextField txtCepAtualizarFuncionario;
    private javax.swing.JTextField txtCidadeAtualizarFuncionario;
    private javax.swing.JTextField txtCpfAtualizarFuncionario;
    private javax.swing.JTextField txtDataNascAtualizarFuncionario;
    private javax.swing.JTextField txtEmailAtualizarFuncionario;
    private javax.swing.JTextField txtEspecialidadeAtualizarFuncionario;
    private javax.swing.JTextField txtEstadoAtualizarFuncionario;
    private javax.swing.JTextField txtFuncionarioID;
    private javax.swing.JTextField txtNomeAtualizarFuncionario;
    private javax.swing.JTextField txtRGAtualizarFuncionario;
    private javax.swing.JTextField txtRuaAtualizarFuncionario;
    // End of variables declaration//GEN-END:variables
}
