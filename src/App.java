import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double horasTrabalhadas;
        double valorHora;
        double salarioBruto;

        System.out.println("Digite A quantidades de horas trabalhadas: ");
        horasTrabalhadas = entrada.nextDouble();
        System.out.println("Digite o valor da Hora trabalhada: ");
        valorHora = entrada.nextDouble();

        salarioBruto = valorHora * horasTrabalhadas;

        System.out.println(" ");
        System.out.println("Salário : ");
        System.out.println("Horas: " + horasTrabalhadas);
        System.out.println("Valor da hora: " + valorHora);
        System.out.println("Salario Bruto = " + salarioBruto);

        entrada.close();
    }
}
