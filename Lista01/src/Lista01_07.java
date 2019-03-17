import java.util.Scanner;

public class Lista01_07 {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        byte nota;
        System.out.print("Digite a nota: ");
        nota = aux.nextByte();
        if(nota >= 0 && nota <= 49) {
            System.out.println("Insuficiente.");
        }
        else if(nota >= 50 && nota <= 64) {
            System.out.println("Regular.");
        }
        else if (nota >= 65 && nota <= 84){
            System.out.println("Bom.");
        }
        else{
            System.out.println("Otimo.");
        }
    }
}
