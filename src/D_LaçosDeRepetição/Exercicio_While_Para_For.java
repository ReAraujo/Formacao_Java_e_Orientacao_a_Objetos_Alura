package src.D_LaçosDeRepetição;

public class Exercicio_While_Para_For {
    public static void main(String[] args) {
        int contador = 0;
        System.out.println("Laço - While:");
        while(contador <= 10){
            System.out.println(contador);
            contador++;
        }

        System.out.println("Laço - For");
        for (int i = 0; i <=10; i++) {
            System.out.println(i);    
        }
    }
    
}
