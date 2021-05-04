package AtividadeSemestral01;

public class PessoaFisica {
    private String cpf = "Ainda não informado!";
    private String nome = "";

    // Métodos personalizados
    public boolean cpfValido(String txtCpf){
        boolean status = false;
        char[] cpf = txtCpf.toCharArray();

        // Verificar 1o digito
        int mult = 10;
        int soma = 0;
        int d1;
        for (char num : cpf) {
            if (mult >= 2) {
                int val = Integer.parseInt(String.valueOf(num));
                int res = val * mult;
                soma = soma + res;
                mult--;
            }
        }
        d1 = 11 - (soma % 11);
        if (d1 > 9) {
            d1 = 0;
        }

        // Verificar 2o digito
        int mult2 = 11;
        int soma2 = 0;
        int d2;
        for (char num : cpf) {
            if (mult2 >= 2) {
                int val2 = Integer.parseInt(String.valueOf(num));
                int res2 = val2 * mult2;
                soma2 += res2;
                mult2--;
            }
        }
        d2 = 11 - (soma2 % 11);
        if (d2 > 9) {
            d2 = 0;
        }

        // Verificando d1 e d2
        if (String.valueOf(d1).equals(String.valueOf(cpf[9])) && (String.valueOf(d2).equals(String.valueOf(cpf[10])))) {
            status = true;
        }
        return status;
    }

    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    // Antes de inserir um cpf, verificar se é válido.
    public void setCpf(String cpf) {
        if (this.cpfValido(cpf)){
            this.cpf = cpf;
            System.out.println("CPF Válido!");
        } else{
            System.out.println("[Problemas com CPF informado!]");
        }
    }
}
