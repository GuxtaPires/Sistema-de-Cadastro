import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        boolean autenticacao = false;

        while (autenticacao != true) {
            System.out.println("---------------------HairLetter---------------------");
            System.out.println("Olá, seja bem vindo(a) ao nosso sistema de cadastro");
            System.out.print("Informe seu nome de usuário: ");
            String usuario = sc.nextLine();
            System.out.print("Certo, " + usuario + " agora sua senha: ");
            String senha = sc.nextLine();
            System.out.print("Confirme sua senha: ");
            String confirmacao = sc.nextLine();

            if (confirmacao.equals(senha)){
                System.out.println("-----------------------------------------------");
                System.out.println("Parabéns! Você foi cadastrado no sistema.");
                autenticacao = true;
            }else{
                System.out.println("-----------------------------------------------");
                System.out.println("As senhas são diferentes, tente novamente.");
            }
        }
        sc.close();
    }
}
