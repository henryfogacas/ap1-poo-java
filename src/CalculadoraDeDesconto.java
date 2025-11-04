import java.util.Scanner;

public class CalculadoraDeDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a porcentagem de desconto: ");
        double percDesconto = scanner.nextDouble();

        double valorDesconto = valorProduto * (percDesconto / 100);
        double precoFinal = valorProduto - valorDesconto;

        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Preço final: R$ " + precoFinal);

        scanner.close();
    }
}