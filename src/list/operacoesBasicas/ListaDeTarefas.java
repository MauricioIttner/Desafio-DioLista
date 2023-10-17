package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    //attribute
    private List<Tarefa> toDoList;

    public ListaDeTarefas() {
        this.toDoList = new ArrayList<>();
    }

    public void adicionarTarefa(String description) {
        toDoList.add(new Tarefa(description));
    }

    public void removerTarefa(String description) {
        List<Tarefa> taskForRemove = new ArrayList<>();
        for (Tarefa t : toDoList) {
            if (t.getDescription().equalsIgnoreCase(description))
                taskForRemove.add(t);
        }
        toDoList.removeAll(taskForRemove);
    }

    public int getTotalNumberOfTasks(){
        return toDoList.size();
    }

    public void getDescriptionTask(){
        System.out.println(toDoList);
    }


    public static void main(String[] args) {
        ListaDeTarefas toDoList = new ListaDeTarefas();

        System.out.println("O numero total de elementos da lista é: " + toDoList.getTotalNumberOfTasks());
        toDoList.adicionarTarefa("Task 1");
        toDoList.adicionarTarefa("Task 1");
        toDoList.adicionarTarefa("Task 2");
        System.out.println("O numero total de elementos da lista é: " + toDoList.getTotalNumberOfTasks());
        toDoList.removerTarefa("Task 1");
        System.out.println("O numero total de elementos da lista é: " + toDoList.getTotalNumberOfTasks());
        toDoList.getDescriptionTask();
    }
}
