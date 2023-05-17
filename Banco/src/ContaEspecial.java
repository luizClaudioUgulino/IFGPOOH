public class ContaEspecial extends ContaCorrente {

    public ContaEspecial(String nome, String cpf, double saldo,double limiteSeque) {
        super(nome, cpf, saldo);
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

    public void valorRetirarSaque(double valor){

        

    }


}
