import javax.swing.JOptionPane;

public class CircuitoDeResistencias {
    public static void main(String[] args) {
        double[] resistencias = new double[4];
        for (int i = 0; i < 4; i++) {
            String valorStr = JOptionPane.showInputDialog("Digite o valor da resistência " + (i + 1) + " (em Ohms):");
            resistencias[i] = Double.parseDouble(valorStr);
        }

        double resistenciaEquivalente = resistencias[0] + resistencias[1] + resistencias[2] + resistencias[3];
        double maior = resistencias[0];
        double menor = resistencias[0];

        for (int i = 1; i < resistencias.length; i++) {
            if (resistencias[i] > maior) maior = resistencias[i];
            if (resistencias[i] < menor) menor = resistencias[i];
        }

        String mensagem = String.format(
            "Resistência equivalente: %.2f Ohms\nMaior resistência: %.2f Ohms\nMenor resistência: %.2f Ohms",
            resistenciaEquivalente, maior, menor
        );
        JOptionPane.showMessageDialog(null, mensagem);
    }
}