package controller;

import model.Departamento;
import view.DepartamentoView;
import enums.TipoDepartamento;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoController {
    private final DepartamentoView view;

    public DepartamentoController(DepartamentoView view) {
        this.view = view;
    }

    // Simula a lista de departamentos sem banco de dados
    public List<Departamento> obterDepartamentosMock() {
        List<Departamento> departamentos = new ArrayList<>();

        departamentos.add(new Departamento(1, "Departamento 1", TipoDepartamento.DPB,
                "F001", 101, 201));
        departamentos.add(new Departamento(2, "Departamento 2", TipoDepartamento.DEF,
                "F002", 102, 202));
        departamentos.add(new Departamento(3, "Departamento 3", TipoDepartamento.DC,
                "F003", 103, 203));

        return departamentos;
    }

    public void listarDepartamentos() {
        List<Departamento> departamentos = obterDepartamentosMock();
        view.exibirDepartamentos(departamentos);
    }
}