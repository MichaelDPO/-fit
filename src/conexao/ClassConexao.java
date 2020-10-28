/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane
/**
 *
 * @author micha
 */
public class ClassConexao {
    
    public static Connection conectar() {
        
        Connection con = null;
        final String URL = "jdbc:mysql://localhost:3306/fitstab?useTimezone=true&serverTimezone=UTC";;
        final String USER = "root";
        final String PASS = "25574531mM*";
        
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
            return con;
        } catch (SQLException e) {
            return null;
        }
        
    }
    //aa/a/
    public static void desconectar(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
