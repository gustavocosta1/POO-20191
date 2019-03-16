import java.util.Scanner;

public class Lista01_04 {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        float nota1,nota2,nota3,nota4,total;
        System.out.print("Digite a nota da primeira prova: ");
        nota1 = aux.nextFloat();
        System.out.print("Digite a nota da segunda prova: ");
        nota2 = aux.nextFloat();
        System.out.print("Digite a nota da terceira prova: ");
        nota3 = aux.nextFloat();
        System.out.print("Digite a nota da quarta prova: ");
        nota4 = aux.nextFloat();
        total = (nota1+nota2+nota3+nota4)/4;
        if(total>=7.0) {
            System.out.println("Aprovado");
        }
        else if(total<7.0 && total>=5.0){
            System.out.println("Final");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
