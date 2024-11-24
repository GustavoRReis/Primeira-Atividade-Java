import javax.swing.JOptionPane;

public class GeradorTabuada {
    public static void main(String[] args) {
        try {
            String numeroStr = JOptionPane.showInputDialog("Digite um número para gerar a tabuada:");
            int numero = Integer.parseInt(numeroStr);

            StringBuilder tabuada = new StringBuilder("Tabuada de " + numero + ":\n");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                tabuada.append(numero + " x " + i + " = " + resultado + "\n");
            }

            JOptionPane.showMessageDialog(null, tabuada.toString(), "Tabuada", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
