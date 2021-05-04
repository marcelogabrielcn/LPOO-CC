package AtividadeSemestral02.model;

import AtividadeSemestral02.control.Compra;

public class Cliente {
    private String nome;

    Compra c = new Compra();


    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
