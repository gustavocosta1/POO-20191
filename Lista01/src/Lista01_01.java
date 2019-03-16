import java.util.Scanner;

public class Lista01_01 {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        double velocidade;
        System.out.print("Digite a velocidade em m/s: ");
        velocidade=aux.nextDouble();
        System.out.println("A velocidade em km/h é: "+velocidade*3.6);
    }
}
