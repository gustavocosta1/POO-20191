import java.util.Scanner;

public class Lista01_08 {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        int lista[]=null;
        byte cont; int entrada;
        int media = 0,maior = 0,menor = 0;
        for(cont = 0; cont<10;cont++){
            System.out.print("Digite um numero: ");
            entrada = aux.nextInt();
            media += entrada;
            if(entrada > maior) {
                maior = entrada;
            }
            if(cont == 0) {
                menor = entrada;
            }
            else if(entrada < menor) {
                menor = entrada;
            }
        }
        System.out.println("Media: "+(media/cont)+". Maior: "+maior+". Menor: "+menor);
    }
}
