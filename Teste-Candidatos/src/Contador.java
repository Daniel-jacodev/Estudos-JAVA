import java.util.Scanner;

// Exceção personalizada para parâmetros inválidos
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
     
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        
        try {
           
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException e) {
           
            System.out.println(e.getMessage());
        }
    }
    
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verificando se o segundo parâmetro é maior que o primeiro
        if (parametroDois > parametroUm) {
            int contagem = parametroDois - parametroUm;
            
            // Realizando a contagem e imprimindo os números
            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i + 1));
            }
        } else {
            // Lançando a exceção caso o segundo parâmetro não seja maior que o primeiro
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}
