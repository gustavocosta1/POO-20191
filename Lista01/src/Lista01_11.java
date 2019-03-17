import java.util.Scanner;

public class Lista01_11 {
    public static void main(String[] args) {
        int cod_prod;
        double desc = 0.05 , total=0;
        Scanner aux = new Scanner(System.in);
        while(true) {
            System.out.print("Digite o codigo dos produtos desejados: ");
            cod_prod = aux.nextInt();
            if(cod_prod == 10) {
                total += 1.50;
            }
            else if(cod_prod == 11) {
                total += 1.80;
            }
            else if(cod_prod == 12) {
                total += 1.90;
            }
            else if(cod_prod == 20) {
                total += 10;
            }
            else if(cod_prod == 30) {
                total += 8;
            }
            else if(cod_prod == 50) {
                total += 2.50;
            }
            else {
                break;
            }
        }
        if(total > 50) {
            total -= total * desc;
        }
        System.out.println("Valor total: "+total);
    }
}