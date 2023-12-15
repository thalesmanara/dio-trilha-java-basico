/**
 * <h1>ContaTerminal</h1>
 * Esse é o primeiro projeto do curso de Java da Dio
 * 
 * Ele é uma simulação de uma conta bancária, onde o programa pede para o usuário
 * inserir algumas informações de uma conta fictícia e depois os exibe no terminal.
 * 
 * <p>
 * <b>Note:</b> Leia atentamente a documentação
 * 
 * @author Thales Manara
 * @version 1.0
 * @since 14/10/2023
 */

 import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner escanear = new Scanner(System.in);

        //Aqui abaixo definirei as variáveis
        int numeroConta = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo;

        /*Começarei a exibir as mensagens pedindo as informações e as atribuindo
        às variáveis usando um Scanner */

        System.out.println("Digite as informações a seguir!");
        System.out.println("Informe o número da conta:");
        numeroConta = escanear.nextInt();
        System.out.println("Digite o número da agência:");
        agencia = escanear.next();
        System.out.println("Digite o nome do cliente:");
        nomeCliente = escanear.next();
        System.out.println("Digite o saldo da conta:");
        saldo = escanear.nextDouble();

        //Finalmente exibirei uma mensagem final exibindo todos os dados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia  + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
