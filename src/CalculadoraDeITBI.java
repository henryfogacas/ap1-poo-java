import javax.swing.JOptionPane;

public class CalculadoraDeITBI {
    public static void main(String[] args) {
        String transacaoStr = JOptionPane.showInputDialog("Digite o valor de transação do imóvel:");
        String venalStr = JOptionPane.showInputDialog("Digite o valor venal do imóvel:");
        String impostoStr = JOptionPane.showInputDialog("Digite a porcentagem do imposto ITBI:");

        double valorTransacao = Double.parseDouble(transacaoStr);
        double valorVenal = Double.parseDouble(venalStr);
        double percImposto = Double.parseDouble(impostoStr);

        double baseCalculo = Math.max(valorTransacao, valorVenal);
        double valorItbi = baseCalculo * (percImposto / 100);

        String mensagem = String.format(
            "Base de cálculo: R$ %.2f\nValor do ITBI: R$ %.2f",
            baseCalculo, valorItbi
        );
        JOptionPane.showMessageDialog(null, mensagem);
    }
}