package src.Curso_01_Java_JRE_JDK.B_Sintaxe_Variaveis_e_Fluxo;

public class TestaVariaveis {
    public static void main(String[] args) {
        // Tipo de variável: int (tipo inteiro)
        int idade = 31;
        System.out.println(idade + " anos");

        idade = 30 + 10;
        System.out.println(idade + " anos");

        System.out.printf("A idade é %d", idade);

        // Tipo de variável: double (tipo ponto flutuante - decimal)
        double salario1 = 7800;
        System.out.printf("\nMeu salário é de %.2f", salario1);

        double salario2 = 1270.50;
        int valor = (int) salario2;
        System.out.println(valor);

        double divisao = 3.41 / 2;
        System.out.println("\n" + divisao);

        int outraDivisao = 5 / 2;
        System.out.println(outraDivisao);

        double novaTentativa = 5 / 2 ; // para receber um resultado em double, é preciso completar o valor como double também 
                                       // -> 5.0 / 2 (podendo ser somente um dos operadores)
        System.out.println(novaTentativa);

        float pontoFlutuante = 3.14f;
    
        // O tipo Byte cabe nele 8 bits
        // O tipo short cabe nele 16 bits 
        // O tipo int cabe nele 32 bits 
        // O tipo float cabe nele 32 bits - no tipo float você precisa adicionar o 'f' após o número para o reconhecer
            // = 3.14f
        // O tipo long cabe nele 64 bits - no tipo long você precisa adicionar o 'l' após o número para o reconhecer
            // = 32516546543l
    }
}
