
package Aula04;

import java.util.Scanner;



 
public class Exercicio01 {
    
    public static void main(String[] args) {
        
        //Declarar variaveis 
        double base = 0;
        double altura = 0;
        double area = 0;
        
        //Adquirir informações do usuário
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Usuario digita o valor da base em cm:");
        base = lerTeclado.nextDouble();
        System.out.println("Agora,digita o valor da altura: ");
        altura = lerTeclado.nextDouble();
        
           
        
        //Processar informações
        area = base * altura;
        
        //Apresentar o resultado ao usuário
        System.out.println("A area dp retangulo e, cm2 sera de: " + area + "cm2");
        
    }
    
    
}
