package AtividadeSemestral02.model;

import AtividadeSemestral02.control.Compra;

public final class Cliente {
    private String nome;
    public Compra c = new Compra();

    // Metodo Construtor
    public Cliente(String n){
        setNome(n);
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
