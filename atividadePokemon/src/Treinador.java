import java.util.ArrayList;

public class Treinador {

    private final String nome;
    private final int idade;
    ArrayList<String> medalhas;
    ArrayList<Pokemon> equipe;


    public Treinador(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.medalhas = new ArrayList<>();
        this.equipe = new ArrayList<>();
    }

    public void exibirInfoTreinador(){
        System.out.println("Nome: " + nome +
                "\nIdade: " + idade);

        int i = 1;
        System.out.println("\nEquipe pokemon: ");
        mostrarPokemon();

        System.out.println("\nMedalhas obtidas: ");
        for (int j = 0; j < medalhas.size(); j++) {
            System.out.println((j + 1) + ". " + medalhas.get(j));
        }
        System.out.println("\n");
    }

    public void adicionarPokemon(Pokemon p){
        if(equipe.size() < 6){
            equipe.add(p);
        }else{
            System.out.println("Equipe cheia!");
        }
    }

    public void removerPokemonPorIndice(int indice) {
        if (equipe.isEmpty()) {
            System.out.println("A equipe está vazia!");
        } else if (indice < 1 || indice > equipe.size()) {
            System.out.println("Número inválido!");
        } else {
            Pokemon removido = equipe.remove(indice - 1);
            System.out.println(removido.getEspecie() + " foi removido da equipe!");
        }
    }

    public void mostrarPokemon(){
        int i = 1;
        for(Pokemon p : equipe){
            System.out.printf(i + ". ");
            p.exibirPokemon();
            i++;
        }
    }

    public void adicionarMedalhas(String medal){
        medalhas.add(medal);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
