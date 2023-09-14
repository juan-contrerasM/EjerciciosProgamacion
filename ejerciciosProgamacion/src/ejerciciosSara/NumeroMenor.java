package ejerciciosSara;

public class NumeroMenor {
    public static void main(String[] args) {
        int[] lista = { 1, 2, 3, 7,5,0};
        int inicio = 0;
        int fin = lista.length-1;
        inicio = recorreArreglo(lista, inicio, fin);
        System.out.println(inicio);
    }

    private static int recorreArreglo(int[] lista, int inicio, int fin) {
        int auxiliar=0;
        if ( inicio>fin){
            return lista[fin];
        }
        else {
            if(lista[inicio]<lista[fin]){
                auxiliar=lista[fin];
                lista[fin]=lista[inicio];
                lista[inicio]=auxiliar;
                return recorreArreglo(lista,inicio+1,fin);

            }
            else {
               return recorreArreglo(lista, inicio+1,fin);

            }

        }
    }
}
