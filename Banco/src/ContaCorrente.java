public class ContaCorrente extends PessoaFisica {

    
    
    public ContaCorrente(String nome, String cpf, double saldo,String numeroConta) {
        super(nome, cpf, saldo, numeroConta);
        //TODO Auto-generated constructor stub
    }

    public boolean verificaSaldoNegativo(){
        if( getSaldo() < 0){
            return false;
        }else{
            return true;
        } 
    }


}
