import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
  
		System.out.println("==================================================");
		System.out.println("                     CONTADOR                     ");
		System.out.println("==================================================");

		Scanner terminal = new Scanner(System.in);
		
		// Entrada de Dados - Solicitando que o usuário insira os valores dos dois parâmetros que serão usados na lógica de contagem
        System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		System.out.println("==================================================");

		try {
			// Chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
			System.out.println("==================================================");
		
		}catch (ParametrosInvalidosException ex) {
			// Chamado para imprimir a mensagem de exceção caso se aplique
            System.out.println(ex.getMessage());
					System.out.println("==================================================");
        }	
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		// Validando se parametroUm é MAIOR que parametroDois para lançar a exceção caso seja
		if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser MENOR que o segundo.");
        }

		System.out.println("==================================================");
		System.out.println("                     CONTAGEM                     ");
		System.out.println("==================================================");

		int contagem = parametroDois - parametroUm;
		// Saída de Dados - Lógica para imprimir uma sequência de números, que será definida pela variável contagem
        for( int i = 1; i <= contagem; i++) {
            System.out.println("Número -> " + i);
        }
	}
}
