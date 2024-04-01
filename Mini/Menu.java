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

    public Operacao solicitarOpcao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Liste os Herois para ver os cadastrados e Adicione o seu!");
        System.out.print("Escolha o que fazer: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                return Operacao.ADICIONAR;
            case 2:
                return Operacao.LISTAR;
            case 3:
                return Operacao.SAIR;
            default:
                return null;
        }
    }
}
