import java.util.Scanner;
public class Funcionario {

    private String nome;
    private String email;
    private String senha;
    private boolean logado = false;
    private final boolean admin;

    Scanner sc = new Scanner(System.in);

    public Funcionario(String nome, String email, String senha, boolean admin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void realizarLogin(){
        if(!logado) {
            System.out.println("Digite o seu email: ");
            String email = sc.nextLine();
            if (email.equals(this.getEmail())) {
                System.out.println("Digite o seu senha: ");
                String senha = sc.nextLine();
                if (senha.equals(this.getSenha())) {
                    System.out.println("Login realizado com sucesso!");
                    logado = true;
                } else {
                    System.out.println("Senha incorreta!");
                }
            } else {
                System.out.println("Email incorreto!");
            }
        }else{
            System.out.println("Já está logado!");
        }

    }

    public void realizarLogoff(){
        if(logado){
            System.out.println("Logoff realizado com sucesso!");
            logado = false;
        }else {
            System.out.println("Não está logado!");
        }
    }

    public void alterarDados() {
        System.out.println("Para alterar dados digite seu email: ");
        String email = sc.nextLine();
        if (email.equals(this.getEmail())) {
            System.out.println("Para alterar dados digite seu senha: ");
            String senha = sc.nextLine();
            if (senha.equals(this.getSenha())) {
                int opt;
                do {
                    System.out.println("Digite o dado que deseja alterar: ");
                    System.out.println("1 - Nome: ");
                    System.out.println("2 - Email:");
                    System.out.println("0 - Sair");
                    opt = sc.nextInt();
                    sc.nextLine();
                    switch (opt) {
                        case 1:
                            System.out.println("Digite o novo nome:");
                            setNome(sc.nextLine());
                            break;

                        case 2:
                            System.out.println("Digite o novo email:");
                            setEmail(sc.nextLine());
                            break;

                        default:
                            System.out.println("Digite um número entre 1 e 2!");
                    }
                } while (opt != 0);
            }
        }
    }

    public void alterarSenha() {
        System.out.println("Para trocar a senha digite seu email: ");
        String email = sc.nextLine();
        if (email.equals(this.getEmail())) {
            System.out.println("Digite sua senha para prosseguir: ");
            String senha = sc.nextLine();
            if (senha.equals(this.getSenha())) {
                System.out.println("Digite sua nova senha: ");
                setSenha(sc.nextLine());
            } else {
                System.out.println("Senha incorreta!");
            }
        }else{
            System.out.println("Email incorreto!");
        }
    }

    public boolean estaLogado(){
        return logado;
    }
}

