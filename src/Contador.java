import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int param1, param2;

        System.out.println("*********************************");
        System.out.println("      BEM VINDO AO CONTADOR      ");
        System.out.println("*********************************");

        System.out.print("Digite o primeiro número:");
        param1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        param2 = sc.nextInt();

        System.out.println("*********************************");
        System.out.println("        COMEÇANDO CONTAGEM       ");
        System.out.println("*********************************");

        try {
            contar(param1, param2);

        } catch (ParametrosInvalidosException e) { 
            System.out.println("****************************");
            System.out.println("            Erro            ");
            System.out.println(e.getMessage());

        }

            System.out.println("*************************");
            System.out.println("          FIM            ");
            System.out.println("*************************");
    }

        static void contar(int param1, int param2) throws ParametrosInvalidosException {

            if (param1 > param2) {
                throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");

            } for(int i = param1; i <= param2; i++) {
            System.out.println("Número: " + i);

            }
        }
}