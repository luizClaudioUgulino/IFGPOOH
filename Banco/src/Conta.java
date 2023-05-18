public class Conta extends Cliente {
    
    public Conta(String nome, double saldo, String numeroConta) {
        super(nome);
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        //TODO Auto-generated constructor stub
    }

    private double saldo;
    private String numeroConta;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

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
