package DTO;

public class Fornecedor extends Usuario{

    private int idFornecedor;
    private String cnpjFornecedor;
    private String nomeFantasiaFornecedor;
    private String razaoSocialFornecedor;
    private String cepFornecedor;
    private String enderecoFornecedor;
    private String telefoneFornecedor;
    private String emailFornecedor;

   public Fornecedor(int idFornecedor, String cnpjFornecedor, String nomeFantasiaFornecedor, String razaoSocialFornecedor, String cepFornecedor, String enderecoFornecedor, String telefoneFornecedor, String emailFornecedor, int idUsuario, String nomeUsuario, String emailUsuario, String senhaUsuario, String cpfUsuario, String enderecoUsuario, String telefoneUsuario, int idadeUsuario){
        super(idUsuario, nomeUsuario, emailUsuario, senhaUsuario, cpfUsuario, enderecoUsuario, telefoneUsuario, idadeUsuario);
        this.idFornecedor = idFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
        this.nomeFantasiaFornecedor = nomeFantasiaFornecedor;
        this.razaoSocialFornecedor = razaoSocialFornecedor;
        this.cepFornecedor = cepFornecedor;
        this.enderecoFornecedor = enderecoFornecedor;
        this.telefoneFornecedor = telefoneFornecedor;
        this.emailFornecedor = emailFornecedor;
    }

    public int getIdFornecedor(){
        return idFornecedor;
    }
    public void setIdFornecedor(int idFornecedor){
        this.idFornecedor = idFornecedor;
    }

    public String getCnpjFornecedor(){
        return cnpjFornecedor;
    }
    public void setCnpjFornecedor(String cnpjFornecedor){
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public String getNomeFantasiaFornecedor (){
        return nomeFantasiaFornecedor;
    }
    public void setNomeFantasiaFornecedor(String nomeFantasiaFornecedor){
        this.nomeFantasiaFornecedor = nomeFantasiaFornecedor;

    }

      public String getRazaoSocialFornecedor (){
        return razaoSocialFornecedor;
    }
    public void setRazaoSocialFornecedor(String razaoSocialFornecedor){
        this.razaoSocialFornecedor = razaoSocialFornecedor;
        
    }

    public String getCepFornecedor (){
        return cepFornecedor;
    }
    public void setCepFornecedor(String cepFornecedor){
        this.cepFornecedor = cepFornecedor;
        
    }

    public String getEnderecoFornecedor (){
        return enderecoFornecedor;
    }
    public void setEnderecoFornecedor(String enderecoFornecedor){
        this.enderecoFornecedor = enderecoFornecedor;
        
    }

    public String getTelefoneFornecedor (){
        return telefoneFornecedor;
    }
    public void setTelefoneFornecedor(String telefoneFornecedor){
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public String getEmailFornecedor (){
        return emailFornecedor;
    }
    public void setEmailFornecedor(String emailFornecedor){
        this.emailFornecedor = emailFornecedor;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Empresa: " + getNomeFantasiaFornecedor());
        System.out.println("CNPJ: " + getCnpjFornecedor());
    }
    
}
