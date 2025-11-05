import javax.swing.JOptionPane;

public class GeradorDeTabuada {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Digite um número para ver sua tabuada:");
        int numero = Integer.parseInt(numeroStr);

        StringBuilder tabuada = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            tabuada.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
        }

        JOptionPane.showMessageDialog(null, tabuada.toString());
    }
}