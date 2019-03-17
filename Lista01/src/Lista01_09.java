import java.util.Scanner;

public class Lista01_09 {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        int pares = 0,impares = 0,soma = 0,cont,entrada;
        for(cont=0;cont<2;cont++) {
            System.out.print("Digite um numero: ");
            entrada = aux.nextInt();
            if(entrada % 2 == 0){
                pares += 1;
            }
            else{
                impares += 1;
            }
            soma += entrada;
        }
        System.out.println("Pares: "+pares+". Impares: "+impares+". Soma: "+soma);
    }
}
