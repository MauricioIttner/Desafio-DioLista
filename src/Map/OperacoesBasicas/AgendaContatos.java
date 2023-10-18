package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agdContato = new AgendaContatos();

        agdContato.adicionarContato("Camila", 123456);
        agdContato.adicionarContato("Camila", 5665);
        agdContato.adicionarContato("Camila Cavalcante", 11111111);
        agdContato.adicionarContato("Camila DIO", 5648997);
        agdContato.adicionarContato("Maria Silva", 11111111);
        agdContato.adicionarContato("Camila", 44444);

        agdContato.exibirContato();

        agdContato.removerContato("Maria Silva");
        agdContato.exibirContato();

        System.out.println("O numero é: " + agdContato.pesquisarPorNome("Camila DIO"));

    }
}
