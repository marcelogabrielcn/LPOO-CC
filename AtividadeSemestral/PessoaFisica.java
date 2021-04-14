package AtividadeSemestral;

public class PessoaFisica {
    private String cpf = "Ainda não Informado";

    private boolean cpfValido(String txtCpf) {
        boolean status = false;
        // ###----------------------------------------###
        // sua lógica de validação do CPF deve estar aqui

        // ###----------------------------------------###
        return status;
    }

    // Getters e Setters

    public String getCpf() {
        return cpf;
    }

    // Ao inserir dado no CPF, validar antes de preencher
    public void setCpf(String cpf) {
        if (this.cpfValido(cpf))
            this.cpf = cpf;
        else
            System.out.println("[Problemas com CPF informado!]");
    }

}
