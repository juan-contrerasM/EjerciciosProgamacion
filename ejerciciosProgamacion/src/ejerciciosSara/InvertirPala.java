package ejerciciosSara;

public class InvertirPala {
    public static void main(String[] args) {
        String palabra= "natalia" +
                "";
        int fin= 0;
        palabra=invertir(palabra,fin);
        System.out.println(palabra);
    }

    private static String invertir(String palabra, int fin) {

        if(fin==palabra.length()-1){
            return palabra.charAt(fin)+"";
        }
        else {
            return invertir(palabra, fin+1)+palabra.charAt(fin);
        }
    }


}
