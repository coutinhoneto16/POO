public class Atendente extends Funcionario {

    private float caixa;

    public Atendente(String nome, String email, String senha, boolean admin) {
        super(nome, email, senha, false);
    }


    public void receberPagamento(int valorVenda){
        if(estaLogado()){
            System.out.println("Vendas recebidas!");
            caixa += valorVenda;
        }else{
            System.out.println("Realize login antes.");
        }
    }

    public void fecharCaixa(){
        if(estaLogado()){
            System.out.println("Caixa Fechado! Valor Final: R$ " + caixa);
            caixa = 0;
        }
    }

    public float getCaixa() {
        return caixa;
    }

}
