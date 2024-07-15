
import java.util.Scanner;

public class AçaíDosGremista {

    public static void main(String[] args) {
        // Variáveis para armazenar o sabor e o tamanho escolhidos
        String sabor = "";
        String tamanho = "";

        // Variável para o valor total do pedido
        double valorTotal = 0;

        // Scanner para a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Mensagem de boas-vindas
        System.out.println("******************");
        System.out.println("Bem-vindo ao Açaí Gremista!");
        System.out.println("******************");

        // Loop para processar pedidos
        while (true) {
            // Escolha do sabor
            System.out.println("Escolha o sabor do seu Açaí (Iogurte com Açaí/Açaí Turbinado):");
            sabor = scanner.nextLine();

            // Validação do sabor
            if (!sabor.equalsIgnoreCase("Açaí Turbinado") && !sabor.equalsIgnoreCase("Iogurte com Açaí")) {
                System.out.println("Sabor inválido. Tente novamente.");
                continue;
            }

            // Escolha do tamanho
            System.out.println("Escolha o tamanho do seu Açaí (300ml/500ml/1L):");
            tamanho = scanner.nextLine();

            // Validação do tamanho
            if (!tamanho.equalsIgnoreCase("300ml") && !tamanho.equalsIgnoreCase("300ml") && !tamanho.equalsIgnoreCase("1L")) {
                System.out.println("Tamanho inválido. Tente novamente.");
                continue;
            }

            // Cálculo do valor do pedido
            double valorPedido = 0;
            if (sabor.equalsIgnoreCase("Iogurte com Açaí")) {
                if (tamanho.equalsIgnoreCase("300ml")) {
                    valorPedido = 9.00;
                } else if (tamanho.equalsIgnoreCase("500ml")) {
                    valorPedido = 14.00;
                } else {
                    valorPedido = 18.00;
                }
            } else {
                if (tamanho.equalsIgnoreCase("P")) {
                    valorPedido = 11.00;
                } else if (tamanho.equalsIgnoreCase("M")) {
                    valorPedido = 16.00;
                } else {
                    valorPedido = 20.00;
                }
            }

            // Acumulador de valores
            valorTotal += valorPedido;

            // Impressão do pedido
            System.out.println("Você pediu um Açaí " + sabor + " de tamanho " + tamanho + " por R$ " + valorPedido);

            // Pergunta para novo pedido
            System.out.println("Deseja pedir mais alguma coisa? (S/N)");
            String resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }
        }

        // Impressão do valor total
        System.out.println("O valor total do seu pedido é: R$ " + valorTotal);

        // Mensagem de despedida
        System.out.println("Obrigado por comprar no AçaíDosGremista!");
        System.out.println("******************");
    }
}
