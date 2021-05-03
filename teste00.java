package AtividadeSemestral01;

import java.util.Scanner;

public class teste01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o CPF: ");
        String cpfteste = teclado.nextLine();
        char[] cpf = cpfteste.toCharArray();

        // Verificar 1o digito
        int mult = 10;
        int soma = 0;
        int d1;
        for (char num : cpf){
            if (mult >= 2) {
                System.out.println(num);
                int val = Integer.parseInt(String.valueOf(num));
                int res = val * mult;
                System.out.println(res);
                soma = soma + res;
                mult--;
            }
        }
        d1 = 11 - (soma % 11);

        // Verificar 2o digito
        int mult2 = 11;
        int soma2 = 0;
        int d2;
        for (char num : cpf){
            if (mult2 >= 2){
                System.out.println(num);
                int val2 = Integer.parseInt(String.valueOf(num));
                int res2 = val2 * mult2;
                System.out.println(res2);
                soma2 += res2;
                mult2--;
            }
        }
        d2 = 11 - (soma2 % 11);

        System.out.println(cpfteste);
        System.out.println(soma);
        System.out.println(d1);
        System.out.println(soma2);
        System.out.println(d2);
    }
}
