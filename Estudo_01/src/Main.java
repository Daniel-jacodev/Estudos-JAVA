import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);
//        System.out.println("************************* \n" +
//                "NOME: DANIEL JACÓ\n"
//                "CPF: 111.111.111-11\n"
//                "VALOR EM CAIXA: %d", caixa);
        int caixa =  leitura.nextInt();
        String nome  =  leitura.next();
        int conta  =   leitura.nextInt();
        System.out.println("*************************\n" + "Nome: " + nome + "\n" + "Conta: " + conta + "\n" + "Valor: " + caixa);
        int opcao = 0;
        while(opcao != 4) {
            System.out.println("Digite sua opção" + "\n" + "1: VER SALDO" + "\n" + "2:Depositar Dinheiro" + "\n" + "3: Sacar Dinheiro" + "\n" + "4: Sair");
            opcao = leitura.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("Saldo: " + conta);
                    break;
                    case 2:
                        System.out.println("Digite o valor ");
            }
        }
    }
}