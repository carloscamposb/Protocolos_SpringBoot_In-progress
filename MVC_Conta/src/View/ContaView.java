import java.util.Scanner;

public class ContaView {

    private ContaController controller;

    // Construtor
    public ContaView(ContaController controller) {
        this.controller = controller;
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Buscar conta por CPF");
        System.out.println("2. Buscar conta por Agência e Número da Conta");
        System.out.print("Escolha uma opção: ");
        
        int opcao = scanner.nextInt();
        scanner.nextLine();  // Consumir a linha

        switch (opcao) {
            case 1:
                System.out.print("Digite o CPF: ");
                String cpf = scanner.nextLine();
                Conta contaPorCPF = controller.buscarContaPorCPF(cpf);
                if (contaPorCPF != null) {
                    exibirConta(contaPorCPF);
                } else {
                    System.out.println("Conta não encontrada.");
                }
                break;
            case 2:
                System.out.print("Digite a Agência: ");
                String agencia = scanner.nextLine();
                System.out.print("Digite o Número da Conta: ");
                String numeroConta = scanner.nextLine();
                Conta contaPorAgencia = controller.buscarContaAgencia(agencia, numeroConta);
                if (contaPorAgencia != null) {
                    exibirConta(contaPorAgencia);
                } else {
                    System.out.println("Conta não encontrada.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    public void exibirConta(Conta conta) {
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Tipo de Cliente: " + conta.getTipoCliente());
        System.out.println("Status da Conta: " + conta.getStatusDaConta());
    }
}
