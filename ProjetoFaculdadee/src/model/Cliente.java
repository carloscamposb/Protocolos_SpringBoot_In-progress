package model;
import enums.TipoCliente;
public class Cliente {
    private int idCliente;
    private String nome;
    private String cpf;
    private String email;
    private TipoCliente tipoCliente;
    private String cnpj;
    private int telefoneIdTelefone;

    // Construtor
    public Cliente(int idCliente, String nome, String cpf, String email, TipoCliente tipoCliente, String cnpj, int telefoneIdTelefone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.tipoCliente = tipoCliente;
        this.cnpj = cnpj;
        this.telefoneIdTelefone = telefoneIdTelefone;
    }

    // Getters
    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public String getCnpj() {
        return cnpj;
    }

    public int getTelefoneIdTelefone() {
        return telefoneIdTelefone;
    }

    // Setters (se necessário)
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setTelefoneIdTelefone(int telefoneIdTelefone) {
        this.telefoneIdTelefone = telefoneIdTelefone;
    }

}
