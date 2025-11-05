import javax.swing.JOptionPane;

public class CalculadoraDeAposentadoria {
    public static void main(String[] args) {
        String idadeStr = JOptionPane.showInputDialog("Digite sua idade:");
        String sexo = JOptionPane.showInputDialog("Digite seu sexo (M/F):").toUpperCase();
        String anosContribStr = JOptionPane.showInputDialog("Digite os anos de contribuição:");

        int idade = Integer.parseInt(idadeStr);
        int anosContrib = Integer.parseInt(anosContribStr);

        int idadeMinima = sexo.equals("F") ? 62 : 65;
        int contribMinima = sexo.equals("F") ? 15 : 20;

        boolean podePorIdade = idade >= idadeMinima;
        boolean podePorContrib = anosContrib >= contribMinima;

        String mensagem;
        if (podePorIdade || podePorContrib) {
            mensagem = "Você já pode se aposentar!";
        } else {
            int faltaIdade = idadeMinima - idade;
            int faltaContrib = contribMinima - anosContrib;
            mensagem = "Ainda não pode se aposentar.\n" +
                       "Faltam " + (faltaIdade > 0 ? faltaIdade + " anos de idade.\n" : "") +
                       (faltaContrib > 0 ? faltaContrib + " anos de contribuição." : "");
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
}