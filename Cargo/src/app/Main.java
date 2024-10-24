package app;

import controller.CargoController;
import enums.TipoCargo;
import model.Cargo;
import view.CargoView;

public class Main {
    public static void main(String[] args) {
        // Criar o modelo
        Cargo cargo = new Cargo(1, TipoCargo.GERENTE);

        // Criar a view para mostrar os detalhes do cargo
        CargoView view = new CargoView();

        // Criar o controller para controlar a interação
        CargoController controller = new CargoController(cargo, view);

        // Exibir detalhes do cargo
        controller.exibirDetalhesCargo();

        // Atualizar dados do modelo via controller
        controller.setIdCargo(2);
        controller.setTipoCargo("ANALISTA");

        // Exibir os detalhes atualizados
        controller.exibirDetalhesCargo();
    }
}
