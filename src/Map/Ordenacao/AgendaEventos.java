package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        /*//retorna todas as keys
        Set<LocalDate> dateSet = eventoMap.keySet();
        //retorna todos os valores
        Collection<Evento> values = eventoMap.values();*/

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá nada data: " + proximaData);
                break;
            }
        }
    }


    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2022, Month.APRIL, 15), "Evento 1", "Atração 1");
        agenda.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agenda.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 11), "Evento 3", "Atração 3");
        agenda.adicionarEvento(LocalDate.of(2023, 10, 19), "Evento 4", "Atração 4");
        agenda.exibirAgenda();

        agenda.obterProximoEvento();

    }
}
