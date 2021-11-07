package src.Curso_01_Java_JRE_JDK.D_LaçosDeRepetição;

public class TestaSomatoria {
    public static void main(String[] args) {
        int contador = 0;
        int total = 0;

        while (contador <= 10) {
            // total = total + contador;
            total += contador;
            System.out.println(total);
            contador++;
        }
        // 0 vez = total = total  + 0 = 0;
        // 1 vez = total = total  + 1 = 1;
        // 2 vez = total = 1  + 2     = 3;
        // 3 vez = total = 3  + 3     = 6;
        // 4 vez = total = 6  + 4     = 10;
        // 5 vez = total = 10  + 5    = 15;        
        // 6 vez = total = 15  + 6    = 21;  
        // 7 vez = total = 21  + 7    = 28; 
        // 8 vez = total = 28  + 8    = 36; 
        // 9 vez = total = 36  + 9    = 45;  
       // 10 vez = total = 45  + 10   = 55;                                 
    }
}
