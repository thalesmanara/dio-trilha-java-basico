public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        System.out.println("Digite o salário pretendiodo pelo candidato:");
        double 
    }
    static void analisarCandidatura (double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA POPOSTA");
        }
        else{
            System.out.println("AGUARDANDO O RESULTADO DOS SDEMAIS CANDIDATOS");
        }
    }
}
