import java.util.Scanner;

public class Lista01_10 {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double num = aux.nextDouble(); int divisoes = 0;
        while(num >= 1) {
            num = num/2;
            divisoes += 1;
        }
        System.out.println("Resultado: "+num+". Quantidade de divisões efetuadas: "+divisoes);
    }
}
