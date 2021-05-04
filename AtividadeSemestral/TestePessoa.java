package AtividadeSemestral01;

import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o CPF: (sem pontos nem traço.)");
        String txtCpf = teclado.nextLine();

        if (!(txtCpf==null)){
            PessoaFisica p1 = new PessoaFisica();
            p1.setNome("Marcelo Gabriel");
            p1.setCpf(txtCpf);

            String txtFinal = "";
            txtFinal = "Nome: " + p1.getNome() + " CPF: " + p1.getCpf();
            System.out.println(txtFinal);
        }
        System.out.println("FIM DO TESTE");
    }
}
