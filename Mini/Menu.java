package Mini;

import java.util.Scanner;

public class Menu {
    public void exibirMenu() {
        System.out.println("========== Menu ==========");
        System.out.println("1. Adicionar Herói");
        System.out.println("2. Listar Heróis");
        System.out.println("3. Sair");
        System.out.println("==========================");
    }

    public int solicitarOpcao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Liste os Herois para ver os cadastrados e Adicione o seu!");
        System.out.print("Escolha o que fazer: ");
        return scanner.nextInt();
    }
}
