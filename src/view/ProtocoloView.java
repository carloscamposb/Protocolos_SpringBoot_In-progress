// src/view/ProtocoloView.java
package view;

import model.Protocolo;

public class ProtocoloView {

    public void displayProtocoloDetails(Protocolo protocolo) {
        System.out.println("ID do Protocolo: " + protocolo.getIdProtocolo());
        System.out.println("Número do Protocolo: " + protocolo.getNumeroProtocolo());
        System.out.println("Data de Abertura: " + protocolo.getDataAbertura());
        System.out.println("Data de Prazo: " + protocolo.getDataPrazo());
        System.out.println("Descrição: " + protocolo.getDescricao());
        System.out.println("Tipo de Protocolo: " + protocolo.getTipoProtocolo());
        System.out.println("Status: " + protocolo.getStatus());
    }
}
