package ejerciciosSara;

public class buscarElemento {
    public static void main(String[] args) {
        int n=9;
        int [] lista={0,7,8,9};

        int fin=lista.length-1;
        n= buscar(n, lista, fin);
        System.out.println(
                n
        );
    }

    private static int buscar(int n, int []lista, int  fin) {
        if(n==lista[fin]){
            return fin;

        }
        else {
            if(fin==0){
                return -1;
            }
           else {
                return buscar(n, lista, fin - 1);
            }

        }
    }
}
