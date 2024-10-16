// src/controller/ProtocoloController.java
package controller;

import model.Protocolo;
import view.ProtocoloView;

public class ProtocoloController {

    private Protocolo modelo;
    private ProtocoloView view;

    // Construtor
    public ProtocoloController(Protocolo modelo, ProtocoloView view) {
        this.modelo = modelo;
        this.view = view;
    }

    // Atualizar a descrição do Protocolo
    public void setDescricao(String descricao) {
        modelo.setDescricao(descricao);
    }

    // Exibir os detalhes do Protocolo na view
    public void atualizarView() {
        view.displayProtocoloDetails(modelo);
    }
}

