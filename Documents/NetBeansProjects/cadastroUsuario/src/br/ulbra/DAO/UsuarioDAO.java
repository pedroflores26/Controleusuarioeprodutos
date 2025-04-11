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
            stmt = con.prepareStatement("INSERT INTO usuario (nomeusu, emailusu, senhausu, foneusu, cpfusu,cepusu , logradourousu , numerousu , bairrousu , cidadeusu , estadousu) VALUES (?,?,?,?,?,?,?,?,?,?,?)");

            stmt.setString(1, u.getNomeusu());
            stmt.setString(2, u.getEmailusu());
            stmt.setString(3, u.getSenhausu());
            stmt.setString(4, u.getFoneusu());
            stmt.setString(5, u.getCpfusu());
            stmt.setString(6, u.getCepusu());
            stmt.setString(7, u.getLogradourousu());
            stmt.setString(8, u.getNumerousu());
            stmt.setString(9, u.getBairrousu());
            stmt.setString(10, u.getCidadeusu());
            stmt.setString(11, u.getEstado());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        
         
}
    }
     public boolean validarCPF(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("[^\\d]", "");

        // CPF precisa ter 11 dígitos
        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) return false;

        try {
            int soma1 = 0, soma2 = 0;
            for (int i = 0; i < 9; i++) {
                int digito = Integer.parseInt(cpf.substring(i, i + 1));
                soma1 += digito * (10 - i);
                soma2 += digito * (11 - i);
            }

            int dv1 = 11 - (soma1 % 11);
            if (dv1 >= 10) dv1 = 0;
            soma2 += dv1 * 2;

            int dv2 = 11 - (soma2 % 11);
            if (dv2 >= 10) dv2 = 0;

            return cpf.equals(cpf.substring(0, 9) + dv1 + dv2);
        } catch (Exception e) {
            return false;
        }
    }
      public void salvarusu(Usuario usuario) {
        String sql = "INSERT INTO usuarios (pkidusu, nomeusu, emailusu, senhausu, foneusu, cpfusu, cepusu, " +
                     "logradourousu, numerousu, bairrousu, cidadeusu, estadousu) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

       
}
}



