package view;

import model.Departamento;
import java.util.List;

public class DepartamentoView {
    public void exibirDepartamento(Departamento departamento) {
        System.out.println(departamento);
    }

    public void exibirDepartamentos(List<Departamento> departamentos) {
        for (Departamento dept : departamentos) {
            System.out.println(dept);
        }
    }
}