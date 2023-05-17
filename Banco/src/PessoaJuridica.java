public class PessoaJuridica extends Conta {
    
    public PessoaJuridica(String nome,String cnpj, double saldo,String numeroConta) {
        super(nome, saldo,  numeroConta);
        //TODO Auto-generated constructor stub
        this.cnpj = cnpj;
    }

    private String cnpj;

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    

}
