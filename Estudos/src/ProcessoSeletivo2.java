import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        for(String candidato : candidatos){
            boolean atendeu = atender();
            System.out.println("O candidato " + candidato + " atendeu a ligação? " + atendeu);
        }
    }

    static boolean atender() {
        //return new Random().nextInt(3) == 1;
        return ThreadLocalRandom.current().nextInt(1,3) == 1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número " + (indice + 1) + " é o " + candidatos[indice]);
        }

        for (String candidato : candidatos){
            System.out.println("O candidato " + candidato + " foi selecionado");
        }
    }

    static void selecionarCandidatos() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatoAtual = 0;
        int candidatosSelecionados = 0;

        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            double salarioPretendido = gerarValorPretendido();
            String candidato = candidatos[candidatoAtual];

            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " pretende o salário de R$"  + salarioPretendido + " e foi selecionado para a vaga");
            }
            else
                System.out.println("O candidato " + candidato + " pretende o salário de R$"  + salarioPretendido + " e não foi selecionado para a vaga");
            candidatoAtual++;
        }

    }

    static double gerarValorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
