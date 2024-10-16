// src/app/Main.java
package app;

import model.Protocolo;
import enums.Status;
import enums.TipoProtocolo;
import view.ProtocoloView;
import controller.ProtocoloController;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Criar um Protocolo (Model)
        Protocolo protocolo = new Protocolo(1, 123456789L, new Date(), new Date(), "Solicitação de informação",
                TipoProtocolo.INFORMACAO, Status.NOVO);

        // Criar a View para exibir os dados do Protocolo
        ProtocoloView view = new ProtocoloView();

        // Criar o Controller
        ProtocoloController controller = new ProtocoloController(protocolo, view);

        // Exibir os detalhes iniciais do Protocolo
        controller.atualizarView();

        // Atualizar a descrição do Protocolo
        controller.setDescricao("Nova descrição de solicitação de informação");

        // Exibir os detalhes atualizados do Protocolo
        controller.atualizarView();
    }
}

