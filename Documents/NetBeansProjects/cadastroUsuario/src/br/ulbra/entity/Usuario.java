
package br.ulbra.entity;


public class Usuario {
   private int  id;
   private String nome;
   private String email;
   private String senha;
   private String fone;
   private String cpf;
   private String cepusu;
   private String logradourousu;
   private String numerousu;
   private String bairrousu;
   private String cidadeusu;
   private String  estado;
   

public Usuario(){}

public Usuario(int id, String nomeusu, String emailusu, String senhausu, String foneusu, String cpfusu, String cepusu, String logradourousu,
               String numerousu, String bairrousu, String cidadeusu, String estado ) {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeusu() {
        return nome;
    }

    public void setNomeusu(String nome) {
        this.nome = nome;
    }

    public String getEmailusu() {
        return email;
    }

    public void setEmailusu(String email) {
        this.email = email;
    }

    public String getSenhausu() {
        return senha;
    }

    public void setSenhausu(String senha) {
        this.senha = senha;
    }

    public String getFoneusu() {
        return fone;
    }

    public void setFoneusu(String fone) {
        this.fone = fone;
    }

    public String getCpfusu() {
        return cpf;
    }

    public void setCpfusu(String cpf) {
        this.cpf = cpf;
    }

    public String getCepusu() {
        return cepusu;
    }

    public void setCepusu(String cepusu) {
        this.cepusu = cepusu;
    }

    public String getLogradourousu() {
        return logradourousu;
    }

    public void setLogradourousu(String logradourousu) {
        this.logradourousu = logradourousu;
    }

    public String getNumerousu() {
        return numerousu;
    }

    public void setNumerousu(String numerousu) {
        this.numerousu = numerousu;
    }

    public String getBairrousu() {
        return bairrousu;
    }

    public void setBairrousu(String bairrousu) {
        this.bairrousu = bairrousu;
    }

    public String getCidadeusu() {
        return cidadeusu;
    }

    public void setCidadeusu(String cidadeusu) {
        this.cidadeusu = cidadeusu;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


     public boolean validarSenha(String senha) {
        // Expressão regular para validar a senha
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

        // Verifica se a senha corresponde à expressão regular
        return senha.matches(regex);
    }
    
}
