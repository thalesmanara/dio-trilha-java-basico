import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);

        //Criando o objeto tvCasa usando a classe SmartTV
        SmartTV tvCasa = new SmartTV();

        System.out.println("A tv está ligada? " + tvCasa.ligada);
        System.out.println("A TV está no volume: " + tvCasa.volume);
        System.out.println("A TV está no canal: " + tvCasa.canal);

        boolean continuar = true;
        int opcao = 0;

        //Aqui permitirei o usuário interagir com o objeto tvCasa
        while (continuar == true){
            System.out.println("\nDigite o que deseja fazer:");
            System.out.println("1 - Ligar a TV");
            System.out.println("2 - Desligar a TV");
            System.out.println("3 - Mudar o canal");
            System.out.println("4 - Aumentar o volume em 1");
            System.out.println("5 - Mostrar status da TV");
            System.out.println("6 - Terminar");
            opcao = escanear.nextInt();


            switch (opcao) {
                case 1: {
                    if (tvCasa.ligada == false) {
                        tvCasa.ligar();
                        System.out.println("Agora a TV está ligada");
                        break;
                    }
                    else {
                        System.out.println("A TV já está ligada");
                        break;
                    }
                }

                case 2: {
                    if (tvCasa.ligada == true) {
                        tvCasa.desligar();
                        System.out.println("Agora a TV está desligada");
                        break;
                    }
                    else {
                        System.out.println("A TV já está desligada");
                        break;
                    }
                }

                case 3: {
                    System.out.println("Digite para qual canal você deseja mudar: ");
                    int novoCanal = escanear.nextInt();
                    tvCasa.mudarCanal(novoCanal);
                    break;
                }

                case 4: {
                    tvCasa.aumentarVolume();
                    break;
                }

                case 5: {
                    System.out.println("A tv está ligada? " + tvCasa.ligada);
                    System.out.println("A TV está no volume: " + tvCasa.volume);
                    System.out.println("A TV está no canal: " + tvCasa.canal);
                    break;
                }

                case 6:{
                    continuar = false;
                    break;
                }

                default:
                    continuar = false;
                    break;
            }
        }



    }
    
}
