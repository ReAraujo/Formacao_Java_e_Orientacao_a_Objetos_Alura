package src.Curso_01_Java_JRE_JDK.D_LaçosDeRepetição;

public class TestaWhile {
    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 10) {
            System.out.println(contador);
            // contador = contador + 1
            // contador += 1;
            contador ++;
        }
    }
}
