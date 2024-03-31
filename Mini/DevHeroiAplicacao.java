package Mini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DevHeroiAplicacao {
    private List<Heroi> heroisCadastrados = new ArrayList<>();

    public void executar() {
        Menu Menu = new Menu();
        boolean sair = false;

        while (!sair) {
            Menu.exibirMenu();
            int opcao = Menu.solicitarOpcao();

            switch (opcao) {
                case 1:
                    adicionarHeroi();
                    break;
                case 2:
                    listarHerois();
                    break;
                case 3:
                    sair = true;
                    System.out.println("Uma pena que você vai embora. Mas volte logo!");
                    break;
                default:
                    System.out.println("Hey Super Esteja Atento. Se Esforce Mais e Tente Novamente.");
            }
        }
    }

    private void adicionarHeroi() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu herói: ");
        String nome = scanner.nextLine();

        for (Heroi heroi : heroisCadastrados) {
            if (heroi.getNome().equals(nome)) {
                System.out.println(
                        "Erro: Esse já é o herói preferido de alguém. Encontre outro pra você!");
                return;
            }
        }

        System.out.print("Qual superpoder do seu herói: ");
        String superpoder = scanner.nextLine();

        System.out.print("Agora qual seu nome para cadastrar seu herói: ");
        String usuario = scanner.nextLine();

        System.out.print("Quantos anos tem seu herói: ");
        int idade = scanner.nextInt();

        Heroi novoHeroi = new Heroi(nome, superpoder, usuario, idade);
        heroisCadastrados.add(novoHeroi);

        System.out.println("Agora esse é o seu Super Herói! Bem vindo(a) ao time!");
    }

    private void listarHerois() {
        if (heroisCadastrados.isEmpty()) {
            System.out.println("Não há heróis cadastrados.");
        } else {
            System.out.println("Lista de Heróis Cadastrados:");
            for (Heroi heroi : heroisCadastrados) {
                System.out.println("Nome: " + heroi.getNome());
                System.out.println("Superpoder: " + heroi.getSuperpoder());
                System.out.println("Idade: " + heroi.getIdade());
                System.out.println("-------------------------");
            }
        }
    }
}
