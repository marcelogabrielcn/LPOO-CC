package AtividadeSemestral01;

public class teste00 {
    public static void main(String[] args) {
        String palavraInicial = "Hello Word!";

        char[] letras = palavraInicial.toCharArray();

        //for (int i = 0; i < letras.length; i++) {
        //    System.out.println(letras[i]);
        //}

        for (char letra : letras) {
           System.out.println(letra);
        }

        System.out.println("quantidade de letras: " + letras.length);

    }
}
