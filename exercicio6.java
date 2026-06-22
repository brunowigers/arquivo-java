import java.util.Scanner;
public class exercicioDescont {
    public static void main(String[] args) {

        Scaner scanner = new Scaner(System.in);
        System.out.println(x:"Digite o valor da compra");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 200){
            Double valorDescontado = valorCompra * 0.8;
            System.out.println("O valor da compra ficou R$" valorDescontado);
        }

    }
}