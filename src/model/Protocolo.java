// src/model/Protocolo.java
package model;

import java.util.Date;
import enums.Status;
import enums.TipoProtocolo;

public class Protocolo {

    // Atributos
    private int idProtocolo;
    private long numeroProtocolo;
    private Date dataAbertura;
    private Date dataPrazo;
    private String descricao;
    private TipoProtocolo tipoProtocolo;
    private Status status;

    // Construtor
    public Protocolo(int idProtocolo, long numeroProtocolo, Date dataAbertura, Date dataPrazo, String descricao,
                     TipoProtocolo tipoProtocolo, Status status) {
        this.idProtocolo = idProtocolo;
        this.numeroProtocolo = numeroProtocolo;
        this.dataAbertura = dataAbertura;
        this.dataPrazo = dataPrazo;
        this.descricao = descricao;
        this.tipoProtocolo = tipoProtocolo;
        this.status = status;
    }

    // Getters e Setters
    public int getIdProtocolo() {
        return idProtocolo;
    }

    public void setIdProtocolo(int idProtocolo) {
        this.idProtocolo = idProtocolo;
    }

    public long getNumeroProtocolo() {
        return numeroProtocolo;
    }

    public void setNumeroProtocolo(long numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(Date dataPrazo) {
        this.dataPrazo = dataPrazo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoProtocolo getTipoProtocolo() {
        return tipoProtocolo;
    }

    public void setTipoProtocolo(TipoProtocolo tipoProtocolo) {
        this.tipoProtocolo = tipoProtocolo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

