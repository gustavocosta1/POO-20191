import java.util.Scanner;

public class Lista01_03 {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        float nota1,nota2,nota3;
        System.out.print("Digite a nota da primeira prova: ");
        nota1 = aux.nextFloat();
        System.out.print("Digite a nota da segunda prova: ");
        nota2 = aux.nextFloat();
        System.out.print("Digite a nota da terceira prova: ");
        nota3 = aux.nextFloat();
        System.out.println("Media final: "+((nota1*0.2)+(nota2*0.3)+(nota3*0.5)));
    }
}