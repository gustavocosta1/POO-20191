import java.util.Calendar;
import java.util.Scanner;

public class Lista01_02 {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        int ano_atual = cal.get(Calendar.YEAR);
        int nasc;
        System.out.print("Digite o ano de nascimento: ");
        nasc = aux.nextInt();
        System.out.println("Idade: "+(ano_atual - nasc));
    }
}
