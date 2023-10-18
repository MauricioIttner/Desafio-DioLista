package list.pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro li : livroList) {
                if (li.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(li);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal) {
        List<Livro> livroPorIntervaloDeAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro li : livroList) {
                if (li.getAnoPublicacao() >= anoInicial && li.getAnoPublicacao() <= anoFinal) {
                    livroPorIntervaloDeAnos.add(li);
                }
            }
        }
        return livroPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro li : livroList) {
                if (li.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = li;
                    break;
                }
            }
        }
        return livroPorTitulo;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CatalogoLivros magazine = new CatalogoLivros();

        magazine.adicionarLivro("Livro 1", "Autor 1", 2015);
        magazine.adicionarLivro("Livro 1", "Autor 2", 2016);
        magazine.adicionarLivro("Livro 2", "Autor 2", 2016);
        magazine.adicionarLivro("Livro 3", "Autor 3", 2017);
        magazine.adicionarLivro("Livro 4", "Autor 4", 2018);
        magazine.adicionarLivro("Livro 5", "Autor 5", 2019);
        magazine.adicionarLivro("Livro 6", "Autor 6", 2002);


        System.out.println("DIGITE O AUTOR: ");
        System.out.println(magazine.pesquisarPorAutor(sc.nextLine()));

        System.out.println("----------------------------------------------");

        System.out.println("DIGITE O ANO DE PUBLICACAO: ");
        System.out.println(magazine.pesquisarPorIntervaloDeAnos(sc.nextInt(), sc.nextInt()));
        sc.nextLine();

        System.out.println("----------------------------------------------");

        System.out.println("DIGITE O TITULO: ");
        System.out.println(magazine.pesquisarPorTitulo("Livro 3"));


    }
}
