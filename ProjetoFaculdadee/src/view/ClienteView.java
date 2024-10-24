package view;

import model.Cliente;

public class ClienteView {

    public void exibirCliente(Cliente cliente) {
        System.out.println("ID do Cliente: " + cliente.getIdCliente());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Tipo de Cliente: " + cliente.getTipoCliente());
        System.out.println("CNPJ: " + cliente.getCnpj());
        System.out.println("ID do Telefone: " + cliente.getTelefoneIdTelefone());
    }
}