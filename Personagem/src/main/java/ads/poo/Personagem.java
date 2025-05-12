package ads.poo;

import java.util.Random;
import java.util.Scanner;

public class Personagem {

    private String name;
    private int life;
    private int strength;
    private int level;

    Scanner sc = new Scanner(System.in);

    public void dados() {
        System.out.print("Digite o nome do personagem: ");
        name = sc.nextLine();
        System.out.println("Nome do personagem: " + name);
        life = 100;
        System.out.println("Vida do personagem: " + life);
        level = 1;
        System.out.println("Nível do personagem: " + level);

        Random r = new Random();
        strength = r.nextInt(level * 5);
        System.out.println("Forca do personagem: " + strength);
    }
}
