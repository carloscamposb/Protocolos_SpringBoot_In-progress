package enums;

public enum TipoDepartamento {
    DPB("Departamento de Produtos Bancários"),
    DEF("Departamento de Empréstimo e Financiamento"),
    DC("Departamento de Contas");

    private final String descricao;

    TipoDepartamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoDepartamento fromString(String tipo) {
        try {
            return TipoDepartamento.valueOf(tipo.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Tipo de departamento inválido: " + tipo);
        }
    }
}