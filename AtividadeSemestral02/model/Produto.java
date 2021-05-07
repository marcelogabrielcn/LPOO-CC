package AtividadeSemestral02.model;

public abstract class Produto {
    private int cod;
    private int qtd;
    private double preco;

    // Metodo Construtor
    public Produto(int c, int q, double p){
        setCod(c);
        setQtd(q);
        setPreco(p);
    }

    // Getters e Setters
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
