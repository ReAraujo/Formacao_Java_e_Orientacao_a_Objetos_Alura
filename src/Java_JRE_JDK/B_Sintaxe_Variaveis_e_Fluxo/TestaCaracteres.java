package src.Java_JRE_JDK.B_Sintaxe_Variaveis_e_Fluxo;

public class TestaCaracteres {
    public static void main(String[] args) {
        // O tipo char trabalha com caracteres - ele guarda um único caractere - 16 bits
        char letra = 'A'; // usa-se as aspas simples para guardar
        System.out.println(letra);

        char valor = 65; // = 'A' - 66 = 'B' - tabela ASCII
        System.out.println(valor);

        // valor = valor + 1; // Quando o Java trabalha com dois tipos fazendo uma operação, ele vai retornar o resultado no maior dos tipos dele
                              // A variável valor é do tipo char e o 1 é um valor inteiro
                              // O tipo inteiro é maior do que o tipo char, porém um inteiro não cabe em um char como um char cabe 
                              // em um inteiro
        valor = (char) (valor + 1);                      
        System.out.println(valor);

        // String com letra maiúscula não é como os tipos int, double, que guardam valor dentro deles
        // String é um tipo referência - Orientação a Objetos

        String palavra = "Mora";
        System.out.println(palavra);

        System.out.println(palavra + 2021);
        System.out.println(palavra + " " + 2021);

    }

}
