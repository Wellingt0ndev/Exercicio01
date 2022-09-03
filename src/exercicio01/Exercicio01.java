package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
    float num1;
    float num2;
    float soma;
    float multiplicacao;
    float divisao;
    
    Scanner leitor = new Scanner(System.in);
    
        System.out.print("Digite o primeiro número: ");
        num1 = leitor.nextFloat();
        System.out.print("Digite o segundo número: ");
        num2 = leitor.nextFloat();
        
        soma = num1 + num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;
        
        System.out.println("A Soma de " + num1 + " + " + num2 + " é " + soma);
        System.out.println("A Multiplicação de " + num1 + " * " + num2 + " é " + multiplicacao);
        System.out.println("A Divisão de " + num1 + " / " + num2 + " é " + divisao);
        
    }
    
}
