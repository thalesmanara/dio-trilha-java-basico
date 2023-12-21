import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class Excecoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        try{
            //Pegando os dados do aluno
            System.out.println("Digite o nome do aluno:");
            String nome = leitor.next();

            System.out.println("Digite o sobrenome do aluno:");
            String sobrenome = leitor.next();

            System.out.println("Digite a idade do aluno:");
            int idade = leitor.nextInt();

            System.out.println("Digite a altura do aluno:");
            double altura = leitor.nextDouble();

            //Exibindo os dados no terminal
            System.out.println("Olá, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Tenho " + altura + "cm de altura");
        }
        catch(InputMismatchException e){
            System.out.println("A variável altura e idade precisaam ser numéricos!");
        }


    }
}
