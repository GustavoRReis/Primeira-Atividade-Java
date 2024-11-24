import javax.swing.JOptionPane;

public class CalculadoraITBI {
    public static void main(String[] args) {
        try {
            String valorTransacaoStr = JOptionPane.showInputDialog("Digite o valor de transação do imóvel (R$):");
            double valorTransacao = Double.parseDouble(valorTransacaoStr);

            String valorVenalStr = JOptionPane.showInputDialog("Digite o valor venal do imóvel (R$):");
            double valorVenal = Double.parseDouble(valorVenalStr);

            String porcentagemImpostoStr = JOptionPane.showInputDialog("Digite a porcentagem do imposto ITBI (%):");
            double porcentagemImposto = Double.parseDouble(porcentagemImpostoStr);

            double baseCalculo = Math.max(valorTransacao, valorVenal);

            double imposto = (baseCalculo * porcentagemImposto) / 100;

            String mensagem = String.format(
                "Base de cálculo (maior valor): R$ %.2f%n" +
                "Imposto ITBI a pagar: R$ %.2f",
                baseCalculo, imposto
            );
            JOptionPane.showMessageDialog(null, mensagem, "Cálculo do ITBI", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
