public class Vendedor extends Atendente {

    private int qtdVendas;

    public Vendedor(String nome, String email, String senha, boolean admin) {
        super(nome, email, senha, false);
    }


    public void realizarVenda() {
        if (estaLogado()) {
            qtdVendas ++;
            System.out.println("Venda realizada com sucesso!");
        }else{
            System.out.println("Realize login antes.");
        }
    }

    public int qtdVendas(){
        return qtdVendas;
    }

}
