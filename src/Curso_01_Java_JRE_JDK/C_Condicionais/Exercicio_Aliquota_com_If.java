package src.Curso_01_Java_JRE_JDK.C_Condicionais;

public class Exercicio_Aliquota_com_If {
    public static void main(String[] args) {
        double salario = 4000.00;

        if(salario >= 1900.00 && salario <= 2800){
            System.out.println("O IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
        }
        if(salario >= 2800.01 && salario <= 3751.00){
            System.out.println("O IR é de 15% e pode deduzir R$ 350");
        }
        if(salario >= 3751.01 && salario <= 4664.00){
            System.out.println("O IR é de 22.5% e pode deduzir R$ 636");
        }
        
        
        



    }
    
}
