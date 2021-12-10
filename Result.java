package Numeros_Diferentes;

import java.util.Arrays;
import java.util.List;

public class Result {

public static void main(String[] args) {

    List<Integer> x = Arrays.asList(5,3,5,2,5);
   

    System.out.println("Tareas: ");
    x.stream().forEach(System.out::print);
    System.out.println("");
    System.out.println("Cantidad = " +Result.cantidadMinimaDeDias(x) + " Números diferentes");

}
    
    public static int cantidadMinimaDeDias(List<Integer> x) {
        // Write your code here
        int nDiferentes = 0;
        int nIguales = 0;

        for (int i = 0; i < x.size(); i++) {
                if (x.get(0).intValue() == x.get(i).intValue()) {
                    nIguales++;
                }else if((x.get(0).intValue() != x.get(i).intValue())){
                    nDiferentes++;
                }
            } 
            if (nIguales == 0 || nIguales >= 1) {
                nIguales = 1;
            }

        return nDiferentes + nIguales;            
    }
}
