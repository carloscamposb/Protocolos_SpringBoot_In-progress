package Controller;


public class ContaController {
    private Conta conta;

    // Construtor
    public ContaController(Conta conta) {
        this.conta = conta;
    }

    // Métodos para controlar a busca
    public Conta buscarContaPorCPF(String cpf) {
        return conta.buscarContaPorCPF(cpf);
    }

    public Conta buscarContaAgencia(String agencia, String numeroConta) {
        return conta.buscarContaAgencia(agencia, numeroConta);
    }

    // Outros métodos de controle podem ser adicionados
}
