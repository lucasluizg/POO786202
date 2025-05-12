package ads.poo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Disciplina {

    private String codigo;
    private String disciplina;
    private String dias;
    private int horas;

    Scanner sc = new Scanner(System.in);

    public void informacaoCodigo () {
        System.out.print("Informe o código da Disciplina: ");
        codigo = sc.nextLine();
        System.out.println("Código da disciplina: " + codigo);
    }

    public void informacaoDisciplina () {
        System.out.print("Informe a disciplina: ");
        disciplina = sc.nextLine();
        System.out.println("Disciplina: " + disciplina);
    }

    public void informacaoDias () {
        System.out.print("Informe os dias da disciplina : ");
        dias = sc.nextLine();
        System.out.println("Dias da disciplina: " + dias);
    }

    public void informacaoHoras () {
        System.out.print("Informe as horas da disciplina: ");
        horas = sc.nextInt();
        System.out.println("Horas da disciplina: " + horas);
    }

}
