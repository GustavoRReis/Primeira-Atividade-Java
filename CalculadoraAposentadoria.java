import javax.swing.JOptionPane;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        try {
            String idadeStr = JOptionPane.showInputDialog("Digite a sua idade:");
            int idade = Integer.parseInt(idadeStr);

            String sexo = JOptionPane.showInputDialog("Digite o seu sexo (M/F):").toUpperCase();

            String anosContribuicaoStr = JOptionPane.showInputDialog("Digite o número de anos de contribuição:");
            int anosContribuicao = Integer.parseInt(anosContribuicaoStr);

            boolean podeAposentar = false;
            int anosFaltando = 0;
            String aposentadoriaTipo = "";

            switch (sexo) {
                case "M" -> {
                    if (idade >= 65 || anosContribuicao >= 35) {
                        podeAposentar = true;
                    } else {
                        if (idade < 65) {
                            anosFaltando = 65 - idade;
                            aposentadoriaTipo = "idade";
                        } else if (anosContribuicao < 35) {
                            anosFaltando = 35 - anosContribuicao;
                            aposentadoriaTipo = "tempo de contribuição";
                        }
                    }
                }
                case "F" -> {
                    if (idade >= 62 || anosContribuicao >= 30) {
                        podeAposentar = true;
                    } else {
                        if (idade < 62) {
                            anosFaltando = 62 - idade;
                            aposentadoriaTipo = "idade";
                        } else if (anosContribuicao < 30) {
                            anosFaltando = 30 - anosContribuicao;
                            aposentadoriaTipo = "tempo de contribuição";
                        }
                    }
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Sexo inválido. Por favor, insira 'M' ou 'F'.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            String mensagem;
            if (podeAposentar) {
                mensagem = "Você já pode se aposentar!";
            } else {
                mensagem = "Você ainda não pode se aposentar. Faltam " + anosFaltando + " ano(s) para a aposentadoria por " + aposentadoriaTipo + ".";
            }

            JOptionPane.showMessageDialog(null, mensagem, "Resultado da Aposentadoria", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
