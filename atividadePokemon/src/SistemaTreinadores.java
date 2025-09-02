import java.util.ArrayList;
import java.util.Scanner;

public class SistemaTreinadores {
    ArrayList<Treinador> treinadores;

    Scanner sc = new Scanner(System.in);

    public SistemaTreinadores(){
        this.treinadores = new ArrayList<>();
    }

    void cadastrarTreinador(Treinador x){
            treinadores.add(x);
    }

    void exibirTreinadores(){
        System.out.println("Lista de treinadores:\n\n");
        for (Treinador t : treinadores){
            t.exibirInfoTreinador();
            }
        }

    void excluirTreinador(Treinador x){
        treinadores.remove(x);
    }

    void listaTreinadores(){
        if(treinadores.isEmpty()){
            System.out.println("Nenhum treinador encontrado");
            return;
        }
        System.out.println("Lista de treinadores:");
        int index = 1;
        for (Treinador t : treinadores){
            System.out.printf(index + ". " +t.getNome()+" - " + t.getIdade()+ " anos\n" );
        }
    }

    Treinador selecionarTreinadorPorMenu(Scanner sc){
        if (treinadores.isEmpty()) {
            System.out.println("Nenhum treinador cadastrado!");
            return null;
        }

        listaTreinadores();
        System.out.print("Digite o número do treinador que deseja: ");
        int escolha = sc.nextInt();
        System.out.println("\n");

        if (escolha < 1 || escolha > treinadores.size()) {
            System.out.println("Índice inválido!");
            return null;
        }

        return treinadores.get(escolha - 1);
    }

    public void removerTreinadorPorIndice(int indice) {
        if (treinadores.isEmpty()) {
            System.out.println("Não há treinadores cadastrados!");
        } else if (indice < 1 || indice > treinadores.size()) {
            System.out.println("Número inválido!");
        } else {
            Treinador removido = treinadores.remove(indice - 1);
            System.out.println("Treinador " + removido.getNome() + " foi removido com sucesso!");
        }
    }
}


