package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone){
        contatoSet.add(new Contato(nome, telefone));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato cont : contatoSet){
            if(cont.getNome().startsWith(nome)){
                contatosPorNome.add(cont);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoTelefone){
        Contato contatoAtualizado = null;
        for(Contato cont : contatoSet){
            if(cont.getNome().equalsIgnoreCase(nome)){
                cont.setTelefone(novoTelefone);
                contatoAtualizado = cont;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos contato = new AgendaContatos();

        contato.exibirContato();


        contato.adicionarContato("Camila ", 123456);
        contato.adicionarContato("Camila ", 0);
        contato.adicionarContato("Camila Pereira", 1111111111);
        contato.adicionarContato("Camila Cavalcante", 654897);
        contato.adicionarContato("Maria Silva ", 1111111111);

        contato.exibirContato();

        System.out.println(contato.pesquisarPorNome("Camila"));

        System.out.println("Contato Atualizado: " + contato.atualizarNumeroContato("Maria Silva", 555555));
    }

}
