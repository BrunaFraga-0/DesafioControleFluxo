import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
  
		System.out.println("============================================================");
		System.out.println("                          CONTADOR                          ");
		System.out.println("============================================================");

		Scanner terminal = new Scanner(System.in);
		int parametroUm = 0;
		int parametroDois = 0;
		boolean entradaValida = true;
		
		// Entrada de Dados - Solicitando que o usuário insira os valores duas variáveis que serão usadas na lógica de contagem
			// Incluindo um loop com do-while para repetir as perguntas caso o usuário preencha de forma errada os valores para as duas variáveis
		do {

			System.out.println("Digite o primeiro parâmetro: ");
			parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro: ");
			parametroDois = terminal.nextInt();
			System.out.println("============================================================");

			try {
				// Chamando o método contendo a lógica de contagem
				entradaValida = true;
				contar(parametroUm, parametroDois);
				System.out.println("============================================================");
		
			}catch (ParametrosInvalidosException ex) {
				// Chamado para imprimir a mensagem de exceção caso se aplique
				entradaValida = false;
            	System.out.println(ex.getMessage());
				System.out.println("============================================================");
			}

        } while (!entradaValida);	
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		// Validando se parametroUm é MAIOR que parametroDois para lançar a exceção caso seja
		if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("ATENÇÃO: O primeiro parâmetro deve ser MENOR que o segundo.");
        }

		System.out.println("============================================================");
		System.out.println("                          CONTAGEM                          ");
		System.out.println("============================================================");

		int contagem = parametroDois - parametroUm;
		// Saída de Dados - Lógica para imprimir uma sequência de números, que será definida pela variável contagem
        for( int i = 1; i <= contagem; i++) {
            System.out.println("Número -> " + i);
        }

		System.out.println("============================================================");
		System.out.println("               CONTAGEM CONCLUIDA COM SUCESSO!             ");	
	}
	
}
