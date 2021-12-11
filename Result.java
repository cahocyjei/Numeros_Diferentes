package Numeros_Diferentes;

import java.util.Arrays;
import java.util.List;

public class Result {

public static void main(String[] args) {

    List<Integer> x = Arrays.asList(1,2,3,4);
   
    System.out.println(Result.cantidadMinimaDeDias(x));

}
    
    public static int cantidadMinimaDeDias(List<Integer> x) {
        // Write your code here
       int nDiferentes = 0;
       int nIguales = 0;


        nDiferentes = Math.toIntExact(x.stream().
        filter(n -> n.intValue() != x.get(0).intValue())
        .count());
        
        nIguales = Math.toIntExact(x.stream().
        filter(n -> n.intValue() == x.get(0).intValue())
        .count());

        if (nIguales > 0) {
            nDiferentes += 1;
        }

        return nDiferentes;
    }
}
