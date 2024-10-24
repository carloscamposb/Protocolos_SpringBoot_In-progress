package controller;

import model.Cargo;
import view.CargoView;

public class CargoController {

    private Cargo modelo;
    private CargoView view;

    // Construtor com ambos: modelo e view
    public CargoController(Cargo modelo, CargoView view) {
        this.modelo = modelo;
        this.view = view;
    }

    // Métodos para atualizar a view a partir do modelo
    public void exibirDetalhesCargo() {
        view.imprimirDetalhesCargo(modelo.getIdCargo(), modelo.getTipoCargo().name());
    }

    // Métodos para atualizar o modelo
    public void setTipoCargo(String tipoCargo) {
        modelo.setTipoCargo(enums.TipoCargo.valueOf(tipoCargo));
    }

    public void setIdCargo(int idCargo) {
        modelo.setIdCargo(idCargo);
    }

    public int getIdCargo() {
        return modelo.getIdCargo();
    }

    public enums.TipoCargo getTipoCargo() {
        return modelo.getTipoCargo();
    }
}
