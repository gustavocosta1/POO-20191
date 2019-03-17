import java.util.Scanner;

public class Lista01_06 {
    public static void main(String[] args) {
        double diaria = 60, taxa;
        int diarias;
        String nome;
        Scanner aux = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        nome = aux.nextLine();
        System.out.print("Digite o numero de diárias: ");
        diarias = aux.nextInt();
        if(diarias > 15) {
            taxa = 5.50;
        }
        else if(diarias == 15) {
            taxa = 6;
        }
        else {
            taxa = 8;
        }
        System.out.println("Cliente: "+nome+". Valor total: "+((diaria*diarias)+(diarias*taxa)));
    }
}
