import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Treinador treinadorEscolhido;
        SistemaTreinadores s = new SistemaTreinadores();


        int opcao;
        do {
            System.out.println("\n------------------- Menu -------------------");
            System.out.println("1 - Cadastrar treinador");
            System.out.println("2 - Mostra dados de treinador");
            System.out.println("3 - Adicionar pokemon a treinador");
            System.out.println("4 - Retirar pokemon de treinador");
            System.out.println("5 - Ganhar medalha de treinador");
            System.out.println("6 - Exibir lista de treinadores");
            System.out.println("7 - Excluir treinador");
            System.out.println("0 - Sair");
            System.out.println("---------------------------------------------");

            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do novo treinador: ");
                    sc.nextLine();
                    String nomeTreinador = sc.nextLine();
                    System.out.println("Digite a idade do novo treinador:");
                    int idadeTreinador = sc.nextInt();
                    s.cadastrarTreinador(new Treinador(nomeTreinador, idadeTreinador));
                    break;

                case 2:
                    treinadorEscolhido = s.selecionarTreinadorPorMenu(sc);
                    if (treinadorEscolhido != null) {
                        treinadorEscolhido.exibirInfoTreinador();
                    }
                    break;

                case 3:
                    treinadorEscolhido = s.selecionarTreinadorPorMenu(sc);
                    if (treinadorEscolhido != null) {
                        System.out.println("Digite o nome do pokemon: ");
                        sc.nextLine();
                        String nomePokemon = sc.nextLine();

                        System.out.println("Digite o tipo do pokemon: ");
                        String tipoPokemon = sc.nextLine();

                        System.out.println("Digite o nivel do pokemon: ");
                        int nivelPokemon = sc.nextInt();

                        Pokemon novoPokemon = new Pokemon(nomePokemon, tipoPokemon, nivelPokemon);
                        treinadorEscolhido.adicionarPokemon(novoPokemon);

                        System.out.println("Pokémon " + nomePokemon + " adicionado com sucesso ao treinador " + treinadorEscolhido.getNome() + "!");
                    }
                    break;

                case 4:
                    treinadorEscolhido = s.selecionarTreinadorPorMenu(sc);
                    if (treinadorEscolhido != null) {
                        System.out.println("Digite qual pokemon deseja remover da equipe: ");
                        treinadorEscolhido.mostrarPokemon();
                        int pokemon = sc.nextInt();
                        sc.nextLine();
                        treinadorEscolhido.removerPokemonPorIndice(pokemon);
                    }
                    break;

                case 5:
                    treinadorEscolhido = s.selecionarTreinadorPorMenu(sc);
                    if (treinadorEscolhido != null) {
                        System.out.println("Digite a medalha que ganhou: ");
                        sc.nextLine();
                        String medalha = sc.nextLine();
                        treinadorEscolhido.adicionarMedalhas(medalha);
                    }
                    break;

                case 6:
                    s.listaTreinadores();
                    break;

                case 7:
                    System.out.println("Digite o número do treinador que deseja remover:");
                    s.listaTreinadores();
                    int escolhaRemover = sc.nextInt();
                    s.removerTreinadorPorIndice(escolhaRemover);
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

    }
}
