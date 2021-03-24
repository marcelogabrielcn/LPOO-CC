package lab03;

public class Teste02 {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.ano = 2017;
        c.placa = "EUD7993";
        c.modelo = "Classic";

        System.out.println(c.modelo + ", " + c.ano + " , placa: " + c.placa);
    }
}
