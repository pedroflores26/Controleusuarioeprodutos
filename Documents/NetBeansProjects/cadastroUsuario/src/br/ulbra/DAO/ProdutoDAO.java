
package br.ulbra.DAO;

import br.ulbra.config.ConnectionFactory;
import br.ulbra.entity.Produto;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ProdutoDAO {
    public void salvar(Produto p) throws SQLException {
         Connection con;
         con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO usuario (nomeprod	, dataCadprod	, categoriaprod	, valorunitprod, quantestoqueprod VALUES (?,?,?,?,?)");

            stmt.setString(1, p.getNomeProd());
            stmt.setString(2, p.getDataCadProd	());
            stmt.setString(3, p.getCategoriaProd());
            stmt.setDouble(4, p.getValorUnitProd());
            stmt.setInt(5, p.getQuantEstoqueProd());
            

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        
         
}
    }
        
}
