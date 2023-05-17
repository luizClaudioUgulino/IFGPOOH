public class PessoaFisica extends Conta{
    

    private String cpf;

    public PessoaFisica(String nome,String cpf, double saldo) {
        super(nome, saldo);
        this.cpf = cpf;
        //TODO Auto-generated constructor stub
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }



}
