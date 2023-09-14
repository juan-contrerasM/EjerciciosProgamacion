package ejerciciosSara;

public class Numapariciones {
    public static void main(String[] args) {
        int [] lista={5,5,5,5};
        int inicio=0;
        int fin= lista.length-1;
        int element=5;
        element=contarRep(lista, inicio, fin, element);
        System.out.println(element);

    }

    private static int contarRep(int[] lista, int inicio, int fin, int element) {
        if(inicio>fin){
            return 0;
        } else if (lista[inicio]==element) {
            return contarRep(lista, inicio+1, fin, element)+1;
        }
        else {
            return  contarRep(lista, inicio+1, fin, element);
        }
    }
}
