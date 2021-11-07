package src.Java_JRE_JDK.C_Condicionais;

public class TestaCondicionais_If {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais:");
        
        int idade = 16;
        int quantidadePessoas = 3;

        if(idade >= 18){
            System.out.println("Você é maior de 18 anos!");
            System.out.println("Seja bem-vindo(a)!");
        }else{
            if(quantidadePessoas >= 2){
                System.out.println("Você não tem 18 anos, mas pode entrar pois está acompanhado.");
            } else{
                System.out.println("Você é menor de 18 anos!");
                System.out.println("Infelizmente, não poderá entrar!");
            }
        }

    }
    
}
