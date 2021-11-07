package src.Curso_01_Java_JRE_JDK.D_LaçosDeRepetição;

public class TestaLacosEncadeados2 {
    public static void main(String[] args) {        
        for (int linha = 1; linha < 10 ; linha++) {
            for (int coluna = 0; coluna <= linha; coluna++) {
                System.out.print("*");                
            }
            System.out.println();
        }
    }
}