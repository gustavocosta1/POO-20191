import java.util.ArrayList;
import java.util.Scanner;

public class Lista01_05 {
    public static void main(String[] args) {
        ArrayList<String> mes = new ArrayList();
        byte num;Scanner aux = new Scanner(System.in);
        mes.add("Janeiro");mes.add("Fevereiro");mes.add("Março");
        mes.add("Abril");mes.add("Maio");mes.add("Junho");
        mes.add("Julho");mes.add("Agosto");mes.add("Setembro");
        mes.add("Outubro");mes.add("Novembro");mes.add("Dezembro");
        System.out.print("Digite o numero correspondente: ");
        num = aux.nextByte();
        if(num > 0) {
            System.out.println(mes.get(num - 1));
        }
    }
}
