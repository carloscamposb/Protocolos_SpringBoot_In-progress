package controller;

import model.Cliente;

public class ClienteController {
    private final Cliente cliente;

    // Construtor
    public ClienteController(Cliente cliente) {
        this.cliente = cliente;
    }

    // Atualiza o email do cliente
    public void atualizarEmail(String novoEmail) {
        cliente.setEmail(novoEmail);
    }

    // Exibe as informações do cliente
    public void mostrarInformacoes() {
        System.out.println("ID do Cliente: " + cliente.getIdCliente());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Tipo de Cliente: " + cliente.getTipoCliente());
        System.out.println("CNPJ: " + cliente.getCnpj());
        System.out.println("ID do Telefone: " + cliente.getTelefoneIdTelefone());
    }
}
