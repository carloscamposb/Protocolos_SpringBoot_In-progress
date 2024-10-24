package app;

import controller.DepartamentoController;
import view.DepartamentoView;

public class Main {
    public static void main(String[] args) {
        DepartamentoView view = new DepartamentoView();
        DepartamentoController controller = new DepartamentoController(view);

        controller.listarDepartamentos();
    }
}