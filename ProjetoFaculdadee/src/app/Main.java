package app;

import model.Cliente;
import enums.TipoCliente;
import controller.ClienteController;
import view.ClienteView;

public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente(1, "Nome do Cliente", "000.000.000-00", "cliente@exemplo.com", TipoCliente.PESSOA_FISICA, "00.000.000/0001-00", 101);

        // Criando o controlador e view
        ClienteController controller = new ClienteController(cliente);
        ClienteView view = new ClienteView();

        // Exibir informações iniciais
        view.exibirCliente(cliente);

        // Atualizar o e-mail do cliente e exibir novamente
        controller.atualizarEmail("novoemail@exemplo.com");
        System.out.println("\n--- Após atualização de e-mail ---");
        controller.mostrarInformacoes();
    }
}
