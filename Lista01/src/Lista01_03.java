import java.util.Scanner;

public class Lista01_03 {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        double nota1,nota2,nota3;
        System.out.print("Digite a nota da primeira prova: ");
        nota1 = aux.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        nota2 = aux.nextDouble();
        System.out.print("Digite a nota da terceira prova: ");
        nota3 = aux.nextDouble();
        System.out.println("Media final: "+((nota1*0.2)+(nota2*0.3)+(nota3*0.5)));
    }
}