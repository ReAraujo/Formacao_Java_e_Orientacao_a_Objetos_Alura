package src.Curso_01_Java_JRE_JDK.D_LaçosDeRepetição;

public class TestaLacosEncadeados1 {
    public static void main(String[] args) {        
        for (int multiplicador = 1; multiplicador <= 10 ; multiplicador++) {
            for (int contador = 0; contador <= 10; contador++) {
                System.out.print(multiplicador * contador);
                System.out.print(" ");                
            }
            System.out.println();
        }
    }
}