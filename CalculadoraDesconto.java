import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

     
        System.out.print("Digite a porcentagem de desconto: ");
        double porcentagemDesconto = scanner.nextDouble();

        double desconto = (valorProduto * porcentagemDesconto) / 100;
        double precoFinal = valorProduto - desconto;

        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Preço final do produto: R$ " + precoFinal);

        scanner.close();
    }
}
