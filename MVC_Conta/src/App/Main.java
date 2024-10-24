package View;

public class Main {
    public static void main(String[] args) {
        // Criando um exemplo de Conta
        Conta conta = new Conta("João Silva", "1234", "56789", "Pessoa Física", "Ativa");

        // Criando o controller e a view
        ContaController controller = new ContaController(conta);
        ContaView view = new ContaView(controller);

        // Exibindo o menu para interação
        view.exibirMenu();
    }
}
