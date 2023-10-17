package list.operacoesBasicas;

public class Tarefa {

    //attribute
    private String description;

    public Tarefa(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "description='" + description + '\'' +
                '}';
    }
}
