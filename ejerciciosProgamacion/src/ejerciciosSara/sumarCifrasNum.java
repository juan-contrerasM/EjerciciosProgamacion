package ejerciciosSara;

public class sumarCifrasNum {
    public static void main(String[] args) {
        int n=543;
        n=sumarCifras(n);
        System.out.println(n);
    }

    private static int sumarCifras(int n) {
        if(n/10==0){
            return (n%10);
        }
        else{
            return sumarCifras(n/10)+n%10;
        }
    }
}
