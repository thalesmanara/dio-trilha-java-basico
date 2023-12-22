/**
 * <h1>Contador</h1>
 * Esse é o projeto de desafio do módulo de controle de fluxo
 * 
 * Neste algoritmo, solicitaremos ao usuário dois parâmetros do tipo inteiro, onde o primeiro será
 * subtraído do segundo para resultar no valor da variável contador.
 * A variável contador será usada como valor máximo dentro de um laço for que fará a impressão
 * de uma contagem básica de 1 até o contador.
 * Caso o primeiro parâmetro seja maior que o segundo, impossibilitando a subtração com resultado de 
 * valor positivo, o algoritmo deve lançar a exceção personalizada ParametrosInvalidosException.
 * 
 * <p>
 * <b>Note:</b> Leia atentamente a documentação
 * 
 * @author Thales Manara
 * @version 1.0
 * @since 22/12/2023
 */

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {

        //Aqui solicitamos ao usuário os parâmetros através de um Scanner
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = leitor.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = leitor.nextInt();
		
        //No bloco try/catch chamamos o método contar e tratamos a exceção ParametrosInvalidosException
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro para que o contador funcione");
        }
		
	}

    /* Neste método validamos se os parametros estão em conformidade com a lógica. Caso positivo, fazemos 
    a subtração do segundo pelo primeiro e a contagem dentro de um laço for. Caso negativo, lançamos
    a exceção ParametrosInvalidosException que será tratada no bloco catch do método main */
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        else{
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++){
                System.out.println(i);
            }
        }
	}
}