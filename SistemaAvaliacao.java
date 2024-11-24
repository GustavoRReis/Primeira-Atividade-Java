import javax.swing.JOptionPane;

public class SistemaAvaliacao {
    public static void main(String[] args) {
        try {
            String notaProva1Str = JOptionPane.showInputDialog("Digite a nota da primeira prova:");
            double notaProva1 = Double.parseDouble(notaProva1Str);

            String notaProva2Str = JOptionPane.showInputDialog("Digite a nota da segunda prova:");
            double notaProva2 = Double.parseDouble(notaProva2Str);

            String notaTrabalhoStr = JOptionPane.showInputDialog("Digite a nota do trabalho:");
            double notaTrabalho = Double.parseDouble(notaTrabalhoStr);

            double media = (notaProva1 + notaProva2 + notaTrabalho) / 3;

            String status = (media >= 6) ? "Aprovado" : "Reprovado";

            String mensagem = String.format(
                "Média: %.2f%nStatus: %s",
                media, status
            );
            JOptionPane.showMessageDialog(null, mensagem, "Resultado da Avaliação", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira notas válidas (números).", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
