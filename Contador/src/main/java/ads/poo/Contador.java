package ads.poo;
import java.util.Scanner;

public class Contador {

    Scanner sc = new Scanner(System.in);

    private int valor;

    public void obterValor() {
        System.out.print("Informe um valor: ");
        valor = sc.nextInt();
    }

    public void valorSomado() {
        valor++;
        System.out.println("Valor atual: " + valor);
    }

    public void valorAtualizado() {
        System.out.print("Insira contagem: ");
        int soma = sc.nextInt();
        while (soma == 1) {
            valor++;
            System.out.println("Valor atual: " + valor);
            System.out.print("Insira contagem: ");
            soma = sc.nextInt();
        }

        if (soma != 1) {
            System.out.print("Fim");
        }
    }
}
