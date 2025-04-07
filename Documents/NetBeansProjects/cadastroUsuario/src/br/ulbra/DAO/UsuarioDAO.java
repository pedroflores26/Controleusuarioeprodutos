package br.ulbra.DAO;

import br.ulbra.config.ConnectionFactory;
import br.ulbra.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection con;

    public UsuarioDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }

    public boolean checkLogin(String emailusu, String senhausu) {

        String sql = "SELECT * FROM usuarioDAO WHERE emailusu = ? AND senhausu = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            // Substituindo os parâmetros na consulta SQL
            stmt.setString(1, emailusu);
            stmt.setString(2, senhausu);

            // Executa a consulta
            ResultSet rs = stmt.executeQuery();

            // Se encontrar algum usuário com o email e a senha fornecidos
            if (rs.next()) {
                // O login foi bem-sucedido
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Se não encontrar o usuário, o login falha
        return false;
    }

    public void salvar(Usuario u) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO cadastrousuario (nome, email, senha, fone, cpf,cepusu , logradourousu , numerousu , bairrousu , cidadeusu , estado) VALUES (?,?,?,?,?,?,?,?,?,?,?)");

            stmt.setString(2, u.getNome());
            stmt.setString(3, u.getEmail());
            stmt.setString(4, u.getSenha());
            stmt.setString(5, u.getFone());
            stmt.setString(6, u.getCpf());
            stmt.setString(7, u.getCepusu());
            stmt.setString(8, u.getLogradourousu());
            stmt.setString(9, u.getNumerousu());
            stmt.setString(10, u.getBairrousu());
            stmt.setString(11, u.getCidadeusu());
            stmt.setString(12, u.getEstado());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        
    

    
       
        String sql = "INSERT INTO USUARIO (nomeusu, emailusu, senhausu, foneusu, cpfusu, cepusu, logradourousu, "
                + "numerousu, bairrousu, cidadeusu, estadousu) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Definindo os parâmetros da consulta
            stmt.setString(1, Usuario.getNome());
            stmt.setString(2, usuario.getEmailusu());
            stmt.setString(3, usuario.getSenhausu());
            stmt.setString(4, usuario.getFoneusu());
            stmt.setString(5, usuario.getCpfusu());
            stmt.setString(6, usuario.getCepusu());
            stmt.setString(7, usuario.getLogradourousu());
            stmt.setString(8, usuario.getNumerousu());
            stmt.setString(9, usuario.getBairrousu());
            stmt.setString(10, usuario.getCidadeusu());
            stmt.setString(11, usuario.getEstadousu());

            // Executando a consulta
            stmt.executeUpdate();
            System.out.println("Usuário salvo com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao salvar o usuário: " + e.getMessage());
        }
    }

}
}

