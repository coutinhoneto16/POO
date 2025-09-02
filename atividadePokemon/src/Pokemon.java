public class Pokemon {

    private String especie;
    private String tipo;
    private int nivel;

    public Pokemon(String especie, String tipo, int nivel) {
        this.especie = especie;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public void exibirPokemon() {
        System.out.println(especie +
                " - Tipo: " + tipo +
                " - Nivel: " + nivel);

    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
