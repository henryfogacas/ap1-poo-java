import javax.swing.JOptionPane;

public class SistemasDeLogin {
    public static void main(String[] args) {
        final String LOGIN_CORRETO = "java8";
        final String SENHA_CORRETA = "java8";
        int tentativas = 3;
        boolean acessoConcedido = false;

        for (int i = 1; i <= tentativas; i++) {
            String login = JOptionPane.showInputDialog("Tentativa " + i + " de " + tentativas + "\nDigite o login:");
            String senha = JOptionPane.showInputDialog("Digite a senha:");

            if (LOGIN_CORRETO.equals(login) && SENHA_CORRETA.equals(senha)) {
                acessoConcedido = true;
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Tente novamente.");
            }
        }

        if (acessoConcedido) {
            JOptionPane.showMessageDialog(null, "Acesso concedido!");
        } else {
            JOptionPane.showMessageDialog(null, "Acesso bloqueado! Número de tentativas excedido.");
        }
    }
}