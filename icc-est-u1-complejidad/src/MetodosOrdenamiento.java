import java.util.ArrayList;
import java.util.Arrays;

public class MetodosOrdenamiento {


    public static int busquedaSecuencial(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Comparacion "+ (i+1) + " se compara " + valorBuscado +" con " +arreglo[i] + " posicion "+i);
            if (arreglo[i] == valorBuscado) {
                System.out.println("Comparaciones: " +(i+1));
                return i;
            }
        }
        return -1;
    }

    public static int busquedaBinaria(int[] arr, int valorBuscar){

        int inicio = 0;
        int fin = arr.length - 1;
        int i = 0;

        while(inicio<=fin) {

            i++;

            int mitad = inicio + (fin-inicio) /2;

            System.out.println("Comparacion " + (i) + " : " + valorBuscar + " comparado con " + arr[mitad] + "  /  " + "posicion: " + mitad) ;

            if(arr[mitad] == valorBuscar) {
                System.out.println();
                System.out.println("Se necesitaron " + i + " Comparaciones");
                System.out.println();
                return mitad;
            } else if (arr[mitad] < valorBuscar) {
                inicio = mitad +1;
            }else {
                fin = mitad -1;
            }


        }
        System.out.println("No se ah encontrado el valor buscado...");
        return -1;
    }

    //METODO DE ORDENAMIENTO BURBUJA
    public ArrayList<Integer> burbuja(ArrayList<Integer> arregloOriginal) {
        int n = arregloOriginal.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arregloOriginal.get(j) > arregloOriginal.get(j + 1)) {
                    int temp = arregloOriginal.get(j);
                    arregloOriginal.set(j, arregloOriginal.get(j + 1));
                    arregloOriginal.set(j + 1, temp);
                }
            }
        }
        return arregloOriginal;
    }


    //METODO DE ORDENAMIENTO SELECCION  
    public int[] seleccion(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {

            int indiceMinimoMaximo = i;

            for (int j = i + 1; j < n; j++) {
                if ((arreglo[j] < arreglo[indiceMinimoMaximo])) {
                    indiceMinimoMaximo = j;
                }
            }
            //INTERCAMBIO DE VALORES DEL ARREGLO
            int temp = arreglo[indiceMinimoMaximo];
            arreglo[indiceMinimoMaximo] = arreglo[i];
            arreglo[i] = temp;
        }
        return arreglo;
    }


    //METODO DE ORDENAMIENTO INSERCION
    public int[] insercion(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;

        for (int i = 1; i < n; i++) {

            int key = arreglo[i];
            int j = i - 1;

            //INTERCAMBIO DE VALORES
            while (j >= 0 && ((arreglo[j] > key))) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = key;
        }
        return arreglo;
    }


    //METODO DE ORDENAMIENTO BURBUJA-MEJORADO
    public int[] burbujaAjuste(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;
        boolean intercambiado;

        for (int i = 0; i < n - 1; i++) {

            intercambiado = false;

            for (int j = 0; j < n - i - 1; j++) {
                //INTERCAMBIO DE VALORES
                if ((arreglo[j] > arreglo[j + 1])) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambiado = true; 
                }
            }
            if (!intercambiado) {
                break;
            }
        }
        return arreglo;
    }
}