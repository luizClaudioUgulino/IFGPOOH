

import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while( loop == true){
        Object[] opcoes = {"Acessar", "Criar conta", "Sair"};
        int escolha = JOptionPane.showOptionDialog(null, "Sejá bem vido ao Banco L, Escolha uma opção:", "Opções", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        
    
            switch(escolha){
                            case 0:
                               opcoes01();
                                break;
                            case 1:
                                
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


    static void opcoes01(){

        String entrada = JOptionPane.showInputDialog(null, "Digite numero da conta:");



        Object[] opcoes = {"ver extrato","sacar","Depositar","Transferir", "Sair"};
        int escolha = JOptionPane.showOptionDialog(null, "Sejá bem vido, vai querer:", "Opções", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        
                        
    }
    
    static void Opcoes02(){

        Object[] opcoes = {"Fisica", "Juridica","Retornar"};
        int escolha = JOptionPane.showOptionDialog(null, "Desejá criar uma conta Pessoa:", "Opções", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        



    }


}

