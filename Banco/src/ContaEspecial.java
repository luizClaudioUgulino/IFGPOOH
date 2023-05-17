public class ContaEspecial extends ContaCorrente {

    public ContaEspecial(String nome, String cpf, double saldo,double limiteSeque,String numeroConta) {
        super(nome, cpf, saldo, numeroConta);
        this.limiteSeque = limiteSeque;
        //TODO Auto-generated constructor stub
    }
    
    private double limiteSeque;

    public void setLimiteSeque(double limiteSeque) {
        this.limiteSeque = limiteSeque;
    }

    public double getLimiteSeque() {
        return limiteSeque;
    }

    public void valorRetirarSaqueCheque(double valor){

        double valorRetirarCheque = getSaldo() - valor;

        if(valorRetirarCheque < 0){



        }else{



        }



    }


}
