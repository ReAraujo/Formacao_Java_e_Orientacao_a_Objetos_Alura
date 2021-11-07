package src.D_LaçosDeRepetição;

public class Exercicio_MultiplosDe3 {
    public static void main(String[] args) {
        System.out.println("For com o if");
        for (int i = 0; i < 100; i++) {
            if(i % 3 == 0){
                System.out.println(i);
            }            
        }

        System.out.println("For sem o if");
        for (int i = 3; i < 100; i+= 3) {
            System.out.println(i);
        }
    }
}
