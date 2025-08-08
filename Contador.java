public class Contador {

	public static void main(String[] args) {

        // Entrada de Dados - Solicitando que o usuário insira os valores dos dois parâmetros que serão usados na lógica de contagem  
		Scanner terminal = new Scanner(System.in);
		
        System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			// Chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException ex) {
			// Chamado para imprimir a mensagem de exceção caso se aplique
            System.out.println(ex.getMessage());
        }
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		// Validando se parametroUm é MAIOR que parametroDois para lançar a exceção caso seja
		if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser MENOR que o segundo.");
        }


		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}
