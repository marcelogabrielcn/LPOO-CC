package AtividadeSemestral02.control;

import AtividadeSemestral02.model.Livro;
import AtividadeSemestral02.model.Loja;
import java.util.ArrayList;

public class Compra implements InterCompra{
    Loja lj = new Loja();

    ArrayList<Livro> cesta = new ArrayList<Livro>();

    private double precoTotal;
    private int indiceCompra;

    //Métodos
    public int getOpcao(){
        return 0;
    }

    private boolean verificaOpcao(int x){
        return false;
    }

    @Override
    public void iniciarCompra() {

    }

    @Override
    public void comprar(int x) {

    }

    @Override
    public void finalizarCompra() {

    }

    @Override
    public void mostrarCesta() {

    }
}
