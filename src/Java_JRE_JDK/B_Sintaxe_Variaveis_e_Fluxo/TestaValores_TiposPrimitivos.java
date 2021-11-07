package src.Java_JRE_JDK.B_Sintaxe_Variaveis_e_Fluxo;

public class TestaValores_TiposPrimitivos {
    public static void main(String[] args) {
        int primeiroNumero = 5;
        int segundoNumero = 7;
        System.out.println(segundoNumero);

        segundoNumero = primeiroNumero; // A variável segundoNumero recebe o valor da variável primeiroNumero;
        System.out.println(segundoNumero);

        primeiroNumero = segundoNumero; // A variável primeiroNumero recebe o valor da variável segundoNumero;
        System.out.println("segundoNumero=" + segundoNumero);
        System.out.println("primeiroNumero=" + primeiroNumero);

        primeiroNumero = 10; // A variável recebe novo valor de conteúdo, se tornando o valor 10
        System.out.println(primeiroNumero);
        

        String saudacao = "Olá, meu nome é ";
        String nome = "Rômulo ";
        String continuacao = "e minha idade é ";
        int idade = 100;
        System.out.println(saudacao+nome+continuacao+idade);
    }
}
