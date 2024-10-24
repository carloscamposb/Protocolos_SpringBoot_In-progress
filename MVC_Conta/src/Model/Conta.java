public class Conta {
    private int idConta;
    private int titularId;
    private int ClienteId;
    private String titular;
    private String agencia;
    private String numeroConta;
    private String tipoCliente;
    private String statusDaConta;

    // Construtor
    public Conta(String titular, String agencia, String numeroConta, String tipoCliente, String statusDaConta) {
        this.titular = titular;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipoCliente = tipoCliente;
        this.statusDaConta = statusDaConta;
    }

    // Getters e Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getStatusDaConta() {
        return statusDaConta;
    }

    public void setStatusDaConta(String statusDaConta) {
        this.statusDaConta = statusDaConta;
    }

    // Métodos de busca
    public Conta buscarContaPorCPF(String cpf) {
        // Simulação de busca por CPF
        if(cpf.equals("12345678900")) {
            return this; // Apenas um exemplo, normalmente teria busca em um banco de dados
        }
        return null;
    }

    public Conta buscarContaAgencia(String agencia, String numeroConta) {
        // Simulação de busca por agência e número de conta
        if(this.agencia.equals(agencia) && this.numeroConta.equals(numeroConta)) {
            return this;
        }
        return null;
    }
}
