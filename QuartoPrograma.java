import java.util.Scanner;

class QuartoPrograma{
    public static void main(String[] arg) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero ");

        int valor = entrada.nextInt();
        System.out.println("O numero digitado foi " + valor);
    }
}