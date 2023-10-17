package comparableXcomparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------");

        ArrayList<Livro> livros = new ArrayList<Livro>() {
            {
                add(new Livro("Java - Guia do Programador", "Li", 2015));
                add(new Livro("Desenvolvimento Real De Software",
                        "Raoul Gabriel Urma e Richard Warburton", 2021));
                add(new Livro("Microserviços pronto para produção", "Susan J. Fowler", 2017));
                add(new Livro("Etendendo Algoritmos", "Aditya Y.", 2017));
                add(new Livro("Kotlin em Ação", "Dmitry Jemerov e Svetlana Isakova", 2017));
            }
        };
        System.out.println("Livros após a ordenção natural (Título): ");
        Collections.sort(livros);
        for(Livro livro : livros){
            System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " - " + livro.getAno());
        }

        System.out.println("-------------------------------------------");

        System.out.println("Livros após a ordenação por ano: ");
        Collections.sort(livros, new CompararAno());
        for(Livro livro : livros){
            System.out.println(livro.getAno() + " - " + livro.getTitulo() + " - " + livro.getAutor());
        }

        System.out.println("-------------------------------------------");

        System.out.println("Livros após a ordenação por autor: ");
        Collections.sort(livros, new CompararAutor());
        for(Livro livro : livros){
            System.out.println(livro.getAutor() + " - " + livro.getTitulo() + " - " + livro.getAno());
        }

        System.out.println("-------------------------------------------");

        System.out.println("Livros ap[os a ordenação por ano, autor e título: ");
        Collections.sort(livros, new CompararAnoAutorTitulo());
        for(Livro livro : livros){
            System.out.println(livro.getAno() + " - " + livro.getAutor() + " - " + livro.getTitulo());
        }
    }
}
