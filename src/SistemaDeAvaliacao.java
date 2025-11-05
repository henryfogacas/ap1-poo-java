import javax.swing.JOptionPane;

public class SistemaDeAvaliacao {
    public static void main(String[] args) {
        String prova1Str = JOptionPane.showInputDialog("Digite a nota da Prova 1:");
        String prova2Str = JOptionPane.showInputDialog("Digite a nota da Prova 2:");
        String trabalhoStr = JOptionPane.showInputDialog("Digite a nota do Trabalho:");

        double prova1 = Double.parseDouble(prova1Str);
        double prova2 = Double.parseDouble(prova2Str);
        double trabalho = Double.parseDouble(trabalhoStr);

        double media = (prova1 + prova2 + trabalho) / 3;

        String resultado = media >= 6 ? "Aprovado" : "Reprovado";

        String mensagem = String.format(
            "Média: %.2f\nSituação: %s",
            media, resultado
        );
        JOptionPane.showMessageDialog(null, mensagem);
    }
}