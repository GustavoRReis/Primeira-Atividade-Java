import java.util.Scanner;

public class SistemaLogin {

    public static void main(String[] args) {
        String loginCorreto = "admin";
        String senhaCorreta = "admin";

        try (Scanner scanner = new Scanner(System.in)) {
            String loginInserido, senhaInserida;
            int tentativas = 3;
            while (tentativas > 0) {
                System.out.println("Digite seu login:");
                loginInserido = scanner.nextLine();
                
                System.out.println("Digite sua senha:");
                senhaInserida = scanner.nextLine();
                
                if (loginInserido.equals(loginCorreto) && senhaInserida.equals(senhaCorreta)) {
                    System.out.println("Login realizado com sucesso!");
                    break;
                } else {
                    tentativas--;
                    if (tentativas > 0) {
                        System.out.println("Login ou senha incorretos. Você tem " + tentativas + " tentativa(s) restante(s).");
                    } else {
                        System.out.println("Você atingiu o número máximo de tentativas. Acesso bloqueado.");
                    }
                }
            }
        }
    }
}
