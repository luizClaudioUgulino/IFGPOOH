public class ContaCorrente extends PessoaFisica {

    public ContaCorrente(String nome, String cpf, double saldo) {
        super(nome, cpf, saldo);
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
