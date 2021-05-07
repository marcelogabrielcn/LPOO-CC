package AtividadeSemestral02.model;

import AtividadeSemestral02.control.InterLoja;
import java.util.ArrayList;

public class Loja implements InterLoja {
    ArrayList<Livro> acervo = new ArrayList<>();
    
    // Metodo Construtor
    public Loja(){
        
    }
    
    // Metodos Especiais
    public void addAcervo(Livro a, Livro b, Livro c, Livro d, Livro e){
        acervo.add(a);
        acervo.add(b);
        acervo.add(c);
        acervo.add(d);
        acervo.add(e);
    }

    @Override
    public void mostrarAcervo() {
        for (Livro objetoLivro : acervo){
            System.out.println("Livro: " + objetoLivro.getTitulo());
        }
    }
}
