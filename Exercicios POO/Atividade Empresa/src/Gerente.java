import java.util.Scanner;
public class Gerente extends Vendedor {

    Scanner sc = new Scanner(System.in);

    public Gerente(String nome, String email, String senha, boolean admin) {
        super(nome, email, senha, true);
    }

    public void gerarRelatorioFinanceiro(Atendente atendente){
        if(estaLogado()){
            System.out.println("Caixa: " + atendente.getCaixa());
        }else{
            System.out.println("Realize login antes.");
        }
    }

    public void consultarVendas(Vendedor vendedor){
        if(estaLogado()) {
            System.out.println("Quantidade de Vendas: " + vendedor.qtdVendas());
        }else{
            System.out.println("Realize login antes.");
        }
    }
}

