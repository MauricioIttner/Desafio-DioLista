package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void addPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenadoPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        pessoasPorAltura.sort(new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordPessoas = new OrdenacaoPessoas();

        ordPessoas.addPessoa("Nome 1", 20, 1.65);
        ordPessoas.addPessoa("Nome 2", 22, 1.80);
        ordPessoas.addPessoa("Nome 3", 18, 1.90);
        ordPessoas.addPessoa("Nome 4", 13, 1.73);
        ordPessoas.addPessoa("Nome 5", 15, 1.68);

        System.out.println(ordPessoas.ordenadoPorIdade());
        System.out.println(ordPessoas.ordenadoPorAltura());
    }
}

