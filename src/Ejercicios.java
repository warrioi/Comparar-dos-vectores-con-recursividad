public class Ejercicios {
    public static String invertirPalabra (String palabra, int longitud){
        if(longitud==0)
        {
            return palabra.charAt (longitud)+"";
        }
        else
        {
            return palabra.charAt (longitud) + (invertirPalabra(palabra, longitud-1));
        }
    }
    /*
     Metodorecursivo para comprar dos enteros elemento por elemento
     vector 1={5 , 6 , 2}
     vector 2={2 , 9 , 2}
     diferen = 3 - 3 + 0 = 0
    */
    private static int compararVectores(int[] vector1 , int[] vector2 , int indice){
        int sumaDiferencias;
        if (indice == vector1.length - 1){
        sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]);
        }else {
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]) + compararVectores(vector1, vector2, indice +1);
        }
        return sumaDiferencias;
    }
    /*
    metodo auxiliiar
    */
    public static boolean compararVectores(int[] vector1 , int[] vector2 ){
        return compararVectores( vector1, vector2,0) == 0;
    }
}
