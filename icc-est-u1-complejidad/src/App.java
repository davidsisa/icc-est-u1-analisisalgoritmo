import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        
        List<Integer> listaOriginal = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listaOriginal.add(random.nextInt(100) + 1);
        }
        
        List<Integer> lista0 = new ArrayList<>(listaOriginal);
        for (int i = 10; i < 100; i++) {
            lista0.add(random.nextInt(100) + 1); 
        }

        List<Integer> lista1 = new ArrayList<>(lista0);
        for (int i = 10; i < 1000; i++) {
            lista1.add(random.nextInt(100) + 1); 
        }

        List<Integer> lista2 = new ArrayList<>(lista1);
        for (int i = 10; i < 5000; i++) {
            lista2.add(random.nextInt(100) + 1); 
        }

        List<Integer> lista3 = new ArrayList<>(lista2);
        for (int i = 10; i < 10000; i++) {
            lista3.add(random.nextInt(100) + 1); 
        }

        List<Integer> lista4 = new ArrayList<>(lista3);
        for (int i = 10; i < 30000; i++) {
            lista4.add(random.nextInt(100) + 1); 
        }
        
    }
}
