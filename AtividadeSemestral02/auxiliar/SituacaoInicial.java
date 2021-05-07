package AtividadeSemestral02.auxiliar;

import AtividadeSemestral02.model.Livro;
import AtividadeSemestral02.model.Loja;

public class SituacaoInicial {

    //Metodos
    public static void montarLojaLivros(Loja l){
        Livro l1 = new Livro(1, 1, 18.50, "Patriarcas e Profetas");
        Livro l2 = new Livro(2, 1, 15.70, "Profetas e Reis");
        Livro l3 = new Livro(3, 1, 22.30, "O Desejado de Todas as Nações");
        Livro l4 = new Livro(4, 1, 14.70, "Atos dos Apostolos");
        Livro l5 = new Livro(5, 1, 19.20, "O Grande Conflito");
        Loja loja1 = new Loja();
        loja1.addAcervo(l1, l2, l3, l4, l5);
    }
}
