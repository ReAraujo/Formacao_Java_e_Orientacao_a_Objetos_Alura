package src.B_Sintaxe_Variaveis_e_Fluxo;

public class TestaConversao {
    public static void main(String[] args) {
        double salario = 1270.50;
        //int valor = salario; um tipo int não comporta um tipo double 
        double valor1 = 3; // double recebe um número inteiro

        // Casting/Encaixe - Convertendo tipos primitivos de variáveis:
        int valor2 = (int) salario;
        System.out.println(valor2);

    }
    
}
