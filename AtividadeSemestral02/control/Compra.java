package AtividadeSemestral02.control;

import AtividadeSemestral02.model.Livro;
import AtividadeSemestral02.model.Loja;

import java.util.ArrayList;

public class Compra {
    Loja lj = new Loja();

    ArrayList<Livro> cesta = new ArrayList<Livro>();

    private double precoTotal;
    private int indiceCompra;

    //Métodos
    public int getOpcao(){

        return 0;
    }

    private boolean verificaOpcao(int i){
        return false;
    }
}
