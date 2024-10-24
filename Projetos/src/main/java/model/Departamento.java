package model;

import enums.TipoDepartamento;

public class Departamento {
    private int idDepartamento;
    private String nome;
    private TipoDepartamento tipo;
    private String codigoFuncionario;
    private int idProtocolo;
    private int idCliente;

    // Construtor
    public Departamento(int idDepartamento, String nome, TipoDepartamento tipo,
                        String codigoFuncionario, int idProtocolo, int idCliente) {
        this.idDepartamento = idDepartamento;
        this.nome = nome;
        this.tipo = tipo;
        this.codigoFuncionario = codigoFuncionario;
        this.idProtocolo = idProtocolo;
        this.idCliente = idCliente;
    }

    // Getters e Setters
    public int getIdDepartamento() { return idDepartamento; }
    public void setIdDepartamento(int idDepartamento) { this.idDepartamento = idDepartamento; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public TipoDepartamento getTipo() { return tipo; }
    public void setTipo(TipoDepartamento tipo) { this.tipo = tipo; }

    public String getCodigoFuncionario() { return codigoFuncionario; }
    public void setCodigoFuncionario(String codigoFuncionario) { this.codigoFuncionario = codigoFuncionario; }

    public int getIdProtocolo() { return idProtocolo; }
    public void setIdProtocolo(int idProtocolo) { this.idProtocolo = idProtocolo; }

    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + idDepartamento +
                ", nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", codigoFuncionario='" + codigoFuncionario + '\'' +
                ", idProtocolo=" + idProtocolo +
                ", idCliente=" + idCliente +
                '}';
    }
}