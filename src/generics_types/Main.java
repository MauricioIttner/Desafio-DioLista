package generics_types;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);

        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        for(String elemento : listaGenerics){
            System.out.println(elemento);
        }

        //quando não tiver generics tem que fazer o cast
        for(Object element : listaSemGenerics){
            String str = (String) element;
            System.out.println(str);
        }

    }
}