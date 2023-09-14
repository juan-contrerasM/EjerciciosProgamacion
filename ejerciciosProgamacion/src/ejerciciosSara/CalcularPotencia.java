package ejerciciosSara;

public class CalcularPotencia{
    public static void main(String[] args) {
        int base = 4;
        int exponente = 2;
        base=cacular( base, exponente);
        System.out.println(base);

    }

    private static int cacular(int base, int exponente) {
        if(exponente==0){
            return 1;
        }
        else {
            return cacular(base, exponente-1)*base;
        }
    }
}
