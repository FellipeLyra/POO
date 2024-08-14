import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locadora locadora = new Locadora("Locadora ABC", "Rua Exemplo", "1762-817", null, null, null);

        while (true) {
            System.out.println("Bem-vindo à locadora de veículos!");
            System.out.println("1. Cadastrar novo veículo");
            System.out.println("2. Cadastrar cliente");
            System.out.println("3. Realizar empréstimo");
            System.out.println("4. Finalizar empréstimo");
            System.out.println("5. Renovar empréstimo");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a marca do veículo: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite o modelo do veículo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Digite a placa do veículo: ");
                    String placa = scanner.nextLine();
                    System.out.print("Digite o ano do veículo: ");
                    int ano = scanner.nextInt();
                    System.out.print("Digite o valor da locação: ");
                    double valorLocacao = scanner.nextDouble();
                    System.out.print("Digite o valor da multa: ");
                    double valorMulta = scanner.nextDouble();
                 
                    System.out.println("Escolha o tipo de veículo:");
                    System.out.println("1. Popular");
                    System.out.println("2. SUV");
                    System.out.println("3. Luxo");
                    int tipoVeiculo = scanner.nextInt();
      

                    Carros carro = null;

                    switch (tipoVeiculo) {
                        case 1:
                            System.out.print("Possui ar-condicionado (true/false)? ");
                            boolean arCondicionado = scanner.nextBoolean();
                            carro = new Popular(marca, modelo, placa, ano, valorLocacao, valorMulta, arCondicionado);
                            break;
                        case 2:
                            System.out.print("Digite o tamanho do porta-malas: ");
                            String tamanhoPortaMalas = scanner.nextLine();
                            System.out.print("Digite o tipo de tração: ");
                            String tipoTracao = scanner.nextLine();
                            System.out.print("Digite o tipo de combustível: ");
                            String tipoCombustivel = scanner.nextLine();
                            carro = new SUV(marca, modelo, placa, ano, valorLocacao, valorMulta, tamanhoPortaMalas, tipoTracao, tipoCombustivel);
                            break;
                        case 3:
                            System.out.print("Digite a quantidade de airbags: ");
                            int quantidadeAirbags = scanner.nextInt();
                            System.out.print("Digite o tamanho do porta-malas: ");
                            String tamanhoPortaMalasLuxo = scanner.nextLine();
                            System.out.print("Possui GPS integrado (true/false)? ");
                            boolean gpsIntegrado = scanner.nextBoolean();
                            carro = new Luxo(marca, modelo, placa, ano, valorLocacao, valorMulta, quantidadeAirbags, tamanhoPortaMalasLuxo, gpsIntegrado);
                            break;
                        default:
                            System.out.println("Tipo de veículo inválido.");
                            continue;
                    }

                    locadora.casdastrarCarro(carro);
                    System.out.println("Veículo cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Digite o telefone do cliente: ");
                    String telefoneCliente = scanner.nextLine();
                    System.out.print("Digite o endereço do cliente: ");
                    String enderecoCliente = scanner.nextLine();

                    System.out.println("Escolha o tipo de cliente:");
                    System.out.println("1. Pessoa Física");
                    System.out.println("2. Empresa");
                    int tipoCliente = scanner.nextInt();
                

                    Cliente cliente = null;

                    switch (tipoCliente) {
                        case 1:
                            System.out.print("Digite o CPF: ");
                            String cpf = scanner.nextLine();
                            cliente = new Fisica(nomeCliente, telefoneCliente, enderecoCliente, cpf, false);
                            break;
                        case 2:
                            System.out.print("Digite o CNPJ: ");
                            String cnpj = scanner.nextLine();
                            System.out.print("Digite o nome do representante: ");
                            String nomeRepresentante = scanner.nextLine();
                            System.out.println("Nome do representante: ");
                            int qtdEmprestimos = scanner.nextInt();
                            cliente = new Juridica(nomeCliente, telefoneCliente, enderecoCliente, cnpj, nomeRepresentante, qtdEmprestimos);
                            break;
                        default:
                            System.out.println("Tipo de cliente inválido.");
                            continue;
                    }

                    locadora.cadastrarClientes(cliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.print("Digite a placa do carro a ser alugado: ");
                    String placaAluguel = scanner.nextLine();
                    System.out.print("Digite o nome do cliente: ");
                    String nomeClienteAluguel = scanner.nextLine();

                    locadora.registrarEmprestimo(placaAluguel, nomeClienteAluguel);
                    break;

                case 4:
                    System.out.print("Digite a placa do carro a ser devolvido: ");
                    String placaDevolucao = scanner.nextLine();
                    System.out.print("Digite o nome do cliente: ");
                    String nomeClienteDevolucao = scanner.nextLine();

                    locadora.finalizarEmprestimo(placaDevolucao, nomeClienteDevolucao);
                    break;

                case 5:
                    System.out.print("Digite a placa do carro a ser renovado: ");
                    String placaRenovacao = scanner.nextLine();
                    System.out.print("Digite o nome do cliente: ");
                    String nomeClienteRenovacao = scanner.nextLine();

                    locadora.renovarEmprestimo(placaRenovacao, nomeClienteRenovacao);
                    break;

                case 6:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}