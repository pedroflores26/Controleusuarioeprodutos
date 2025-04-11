
package br.ulbra.entity;


public class Produto {
  private int idProd;  

  private String nomeProd ;  
  private String dataCadProd;  
  private String categoriaProd ;  
  private double valorUnitProd ;  
  private int quantEstoqueProd;  

    public Produto(int idProd) {
        this.idProd = idProd;
    }
  

    public Produto(int idProd, String nomeProd, String dataCadProd, String categoriaProd, double valorUnitProd, int quantEstoqueProd) {
        this.idProd = idProd;
        this.nomeProd = nomeProd;
        this.dataCadProd = dataCadProd;
        this.categoriaProd = categoriaProd;
        this.valorUnitProd = valorUnitProd;
        this.quantEstoqueProd = quantEstoqueProd;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getDataCadProd() {
        return dataCadProd;
    }

    public void setDataCadProd(String dataCadProd) {
        this.dataCadProd = dataCadProd;
    }

    public String getCategoriaProd() {
        return categoriaProd;
    }

    public void setCategoriaProd(String categoriaProd) {
        this.categoriaProd = categoriaProd;
    }

    public double getValorUnitProd() {
        return valorUnitProd;
    }

    public void setValorUnitProd(double valorUnitProd) {
        this.valorUnitProd = valorUnitProd;
    }

    public int getQuantEstoqueProd() {
        return quantEstoqueProd;
    }

    public void setQuantEstoqueProd(int quantEstoqueProd) {
        this.quantEstoqueProd = quantEstoqueProd;
    }
  
  public double calcularEstoque() {
        return valorUnitProd * quantEstoqueProd;

}
          // Método para exibir informações do produto
    public String exibirInformacoes() {
        return String.format("Produto: %s\nCategoria: %s\nPreço Unitário: R$ %.2f\nQuantidade em Estoque: %d\nValor Total em Estoque: R$ %.2f", 
                             this.nomeProd, this.categoriaProd, this.valorUnitProd, this.quantEstoqueProd, this.calcularEstoque());
    }
    
    public boolean validarNomeProd(String nomeProd) {
        // Verifica se o nome possui pelo menos 5 caracteres
        if (nomeProd.length() < 5) {
            System.out.println("Erro: O nome do produto deve conter pelo menos 5 caracteres.");
            return false;
        }

        // Verifica se o nome contém apenas letras
        if (!nomeProd.matches("[a-zA-Z\\s]+")) {
            System.out.println("Erro: O nome do produto não deve conter números ou caracteres especiais.");
            return false;
        }

        return true; // Nome válido
    }
}
  
  
  
  
  
  

