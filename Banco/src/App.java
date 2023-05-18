

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<ContaCorrente> cc = new ArrayList<ContaCorrente>();
        ArrayList<ContaEspecial> ce = new ArrayList<ContaEspecial>();
        ArrayList<ContaPoupanca> cp = new ArrayList<ContaPoupanca>();
        ArrayList<PessoaJuridica> cj = new ArrayList<PessoaJuridica>();

        Scanner sc = new Scanner(System.in);
        boolean loop = true;
                

        while( loop == true){
        Object[] opcoes = {"Acessar", "Criar conta", "Sair"};
        int escolha = JOptionPane.showOptionDialog(null, "Sejá bem vido ao Banco L, Escolha uma opção:", "Opções", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        
    
            switch(escolha){
                            case 0:
                            String entrada = JOptionPane.showInputDialog(null, "Digite numero da conta:");




                                break;
                            case 1:
                            Object[] opcoes02 = {"Fisica", "Juridica","Retornar"};
                            int escolha02 = JOptionPane.showOptionDialog(null, "Desejá criar uma conta Pessoa:", "Opções", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes02, opcoes02[0]);
                            


                            if(escolha02  == 0){



                            }else if(escolha02 == 1){



                            }else if(escolha02 == 2){
                                
                            }


                                break;
                            case 2:
                                loop = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida!");
                                loop = false;
                                break;
                            }
        }
    }

    int ProcuraConta(String id){

     for(int x = 0 ; x <){


     }




        return 0;



    }

}

