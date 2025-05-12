package ads.poo;
import java.util.Scanner;

public class Batedeira {

    private boolean ligada = false;
    private int velocidade;

    Scanner sc = new Scanner(System.in);

    public void ligar() {
        System.out.println("Ligar batedeira?");
        String resposta = sc.nextLine();
        resposta = resposta.toLowerCase();

        if (resposta.equals("sim")) {
            ligada = !ligada;
        }
    }

    public void acao() {
        if (ligada == true) {
            System.out.print("Escolha a velocidade: ");
            velocidade = sc.nextInt();
        }
        System.out.print("Velocidade: " + velocidade);
    }


}
