package src.C_Condicionais;

public class TestaCondicionais_If_Boolean {
    public static void main(String[] args) {    
    System.out.println("Testando Condicionais2:");
        
        int idade = 16;
        int quantidadePessoas = 1;

        // Condicional If + operador || (ou):
        if(idade >= 18 || quantidadePessoas >= 2){
            System.out.println("Seja bem-vindo(a)!");
        }else{
            System.out.println("Infelizmente, você não poderá entrar!");
        }
        // || = operador 'ou' -> é o operador que basta uma das condições dar true (verdadeiro), que ele irá entrar no if()
        // && = operador 'e'  -> é o operador que as duas condições precisam ser true (verdadeiras) para entrar no if()

        // Condicional If + operador && (e):
        boolean acompanhado = true;
        // O verificador do Java para saber se é equivalente é o '==' - o '=' é de atribuição
        if(idade >= 18 && acompanhado){  // porém aqui, não será necessário o '==' visto que o acompanhado já possui o valor true
            System.out.println("Seja bem-vindo(a)!");
        }else{
            System.out.println("Infelizmente, você não poderá entrar!");
        }

        // Condicional If + operador && (e) adicionando condição booleana a uma variável booleana:
        boolean acompanhado1 = quantidadePessoas >= 2;
        System.out.println(acompanhado1);
        if(idade >= 18 && acompanhado1){  // porém aqui, não será necessário o '==' visto que o acompanhado já possui o valor true
            System.out.println("Seja bem-vindo(a)!");
        }else{
            System.out.println("Infelizmente, você não poderá entrar!");
        }

        // Os operadores lógicos devem ter no lado esquerdo e direito uma expressão booleana:
        // if (idade > 18 && idade < 65) {}
    }
}

