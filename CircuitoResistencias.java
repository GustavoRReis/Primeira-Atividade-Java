import java.util.Scanner;

public class CircuitoResistencias {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor da resistência R1 (em ohms): ");
            double R1 = scanner.nextDouble();
            
            System.out.println("Digite o valor da resistência R2 (em ohms): ");
            double R2 = scanner.nextDouble();
            
            System.out.println("Digite o valor da resistência R3 (em ohms): ");
            double R3 = scanner.nextDouble();
            
            System.out.println("Digite o valor da resistência R4 (em ohms): ");
            double R4 = scanner.nextDouble();
            
            double resistenciaEquivalente = R1 + R2 + R3 + R4;
            
            double maiorResistencia = Math.max(Math.max(R1, R2), Math.max(R3, R4));
            double menorResistencia = Math.min(Math.min(R1, R2), Math.min(R3, R4));
            
            System.out.println("Resistência Equivalente (em ohms): " + resistenciaEquivalente);
            System.out.println("Maior Resistência (em ohms): " + maiorResistencia);
            System.out.println("Menor Resistência (em ohms): " + menorResistencia);
        }
    }
}
