public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Neto", "coutinhoneto16", "123", false);
        Atendente atendente = new Atendente("Mari", "marisouzz4", "12345", false);
        Vendedor vendedor = new Vendedor("Pierre", "pierrenevesc", "321", false);


       gerente.realizarLogin();
       atendente.realizarLogin();
       atendente.receberPagamento(5000);
       gerente.gerarRelatorioFinanceiro(atendente);

    }
}
