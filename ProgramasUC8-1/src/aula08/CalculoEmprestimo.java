import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoEmprestimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Entrada de dados
            System.out.println("*Cálculo de Juros Compostos para Empréstimo*");
            System.out.print("Valor solicitado (R$): ");
            double valorEmprestimo = scanner.nextDouble();

            System.out.print("Quantidade de prestações (meses): ");
            int numeroPrestacoes = scanner.nextInt();

            // Validação de entrada7
            if (numeroPrestacoes <= 0) {
                throw new IllegalArgumentException("Quantidade de prestações deve ser maior que zero.");
            } else if (valorEmprestimo <= 0) {
                throw new IllegalArgumentException("Valor do empréstimo deve ser maior que zero.");
            }   
            
            // Cálculo do valor total e das parcelas
            double taxaJuros = numeroPrestacoes <= 12 ? 0.025 : 0.035;
            CalculoEmprestimoClasse calculo = new CalculoEmprestimoClasse(valorEmprestimo, numeroPrestacoes, taxaJuros);
            double valorTotal = calculo.calcularMontante();
            double valorParcela = calculo.calcularValorParcela();

            // Apresentação dos resultados
            System.out.println("\n*Resumo do Empréstimo:*");
            System.out.printf("Valor total: R$ %.2f\n", valorTotal);
            System.out.printf("Valor da parcela: R$ %.2f\n", valorParcela);

            // Confirmação do usuário
            System.out.print("\nConfirmar valores? (S/N): ");
            String confirmacao = scanner.next().toUpperCase();

            if (confirmacao.equals("S")) {
                System.out.println("\n*Empréstimo confirmado!*");
            } else {
                System.out.println("\n*Empréstimo cancelado.*");
            }
        } catch (InputMismatchException e) {
            System.out.println("\n*Erro:* Entrada inválida. Digite apenas números.");
        } catch (IllegalArgumentException e) {
            System.out.println("\n*Erro:* " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

class CalculoEmprestimoClasse {

    private double valorEmprestimo;
    private int numeroPrestacoes;
    private double taxaJuros;

    public CalculoEmprestimoClasse(double valorEmprestimo, int numeroPrestacoes, double taxaJuros) {
        this.valorEmprestimo = valorEmprestimo;
        this.numeroPrestacoes = numeroPrestacoes;
        this.taxaJuros = taxaJuros;
    }

    public double calcularMontante() {
        return valorEmprestimo * Math.pow(1 + taxaJuros, numeroPrestacoes);
    }

    public double calcularValorParcela() {
        double montante = calcularMontante();
        return montante / numeroPrestacoes;
    }
}