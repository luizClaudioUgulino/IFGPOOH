public class Conta extends Cliente {
    
    public Conta(String nome, double saldo) {
        super(nome);
        this.saldo = saldo;
        //TODO Auto-generated constructor stub
    }

    private double saldo;

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }


    public boolean sacar(double valor){
        if(valor > this.saldo){
            return false;
        }else if(this.saldo > valor){
            this.saldo = this.saldo - valor;
            return true;
        }
       return false;
    }

    public boolean depositar(double valor){
        this.saldo = this.saldo + valor;
        return true;
    }



}
