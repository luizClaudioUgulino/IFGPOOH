public class App {
    public static void main(String[] args) throws Exception {
        
        ContaCorrente cc = new ContaCorrente("carlos", "101231213", 2000);

        if(cc.verificaSaldoNegativo() == true){
System.out.println("valor negativo");
        }else{
System.out.println("Valor não negativo");
        }

    

    }
}
