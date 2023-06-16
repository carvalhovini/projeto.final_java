import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando algumas tarefas
        Tarefa tarefa1 = new Tarefa("Fazer compras", "Comprar itens do mercado", LocalDate.of(2023, 6, 20));
        Tarefa tarefa2 = new Tarefa("Estudar", "Preparar para a prova", LocalDate.of(2023, 6, 30));

        // Criando lista de tarefas
        ListaDeTarefas listaTarefas = new ListaDeTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa(tarefa1);
        listaTarefas.adicionarTarefa(tarefa2);

        // Exibindo as tarefas da lista
        System.out.println("Lista de tarefas:");
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa(tarefa1);

        // Exibindo as tarefas atualizadas
        System.out.println("Lista de tarefas após remoção:");
        listaTarefas.exibirTarefas();

        // Criando um usuário
        Usuario usuario = new Usuario("user123", "senha123", "user@example.com");

        // Exibindo informações do usuário
        System.out.println("Informações do usuário:");
        System.out.println("Username: " + usuario.getUsername());
        System.out.println("Email: " + usuario.getEmail());
    }
}
