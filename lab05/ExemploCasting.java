package lab05;

public class ExemploCasting {
    public static void main(String[] args) {
        double j = 2.5;
        //float k = 5.2 + j;
        //Dará erro, pois o j é do tipo double.
        float k = 5.2f + (float)j;
        //Devo dizer que 5.2 é float e forçar o j ser float.

    }

}
