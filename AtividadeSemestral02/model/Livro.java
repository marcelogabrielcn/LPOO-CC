package AtividadeSemestral02.model;

public final class Livro extends Produto{
    private String titulo;

    public Livro(int c, int q, double p, String t) {
        super(c, q, p);
        setTitulo(t);
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
