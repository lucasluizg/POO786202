package ads.poo;
import java.util.Scanner;

class App {
    public static void main(String[] args) {

        Caneta bic = new Caneta();

        Scanner cor = new Scanner(System.in);
        Scanner nivel = new Scanner(System.in);
        Scanner tamanho = new Scanner(System.in);

        System.out.print("Informe a cor da caneta: ");
        bic.definirCor(cor.nextLine());

        System.out.print("Informe o nível de tinta: ");
        bic.definirNivelTinta(nivel.nextDouble());

        System.out.print("Informe o tamanho do desenho: ");
        bic.tamanhoDesenho(tamanho.nextInt());

        System.out.println("A caneta está aberta? " + bic.isAberta());
        bic.abrirFechar();
        System.out.println("Alterando estado...");
        System.out.println("A caneta está aberta? " + bic.isAberta());

        System.out.println("A cor e: " + bic.obterCor());

        System.out.println("O nivel de tinta e: " + bic.obterNivelTinta());

        System.out.println("O tamanho do desenho e: " + bic.numTamDesenho());

        System.out.println("O desenho:\n" + bic.obterDesenho());
    }
}