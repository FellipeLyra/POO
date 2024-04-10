package Banco;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double x;
        double s;
        int num;
        int tipo;
        String conta;
        String conta2;
        ArrayList<Pessoa> clientes = new ArrayList<Cliente>();
        ArrayList<Juridica> ju = new ArrayList<Juridica>();
        boolean flag = true;
        System.out.println("Qual tipo da sua conta:");
        System.out.println("1 - Pessoa física");
        System.out.println("2 - Pessoa juridica");
        tipo = ler.nextInt();
        if (tipo == 1) {
            do {
                Cliente cliente = new Cliente();
                System.out.println("Digite seu nome: ");
                cliente.setNome(ler.next());
                System.out.println("Digite seu cpf: ");
                cliente.setCpf(ler.next());
                System.out.println("Digite seu numero da conta: ");
                cliente.getConta().setNumero(ler.next());
                clientes.add(cliente);
                System.out.println("Dseja adicionar mais um cliente? 1-Não / 2-Sim");
                if (ler.nextInt() == 1) {
                    flag = false;
                }
            } while (flag);

            do {
                System.out.println("Qual numero da conta que deseja acessar?");
                conta = ler.next();
                Cliente clienteAtual = Banco.getClienteByNumConta(clientes, conta);
                System.out.println("Qual operação vc deseja realizar:");
                System.out.println("1 - depositar");
                System.out.println("2 - sacar");
                System.out.println("3 - ver saldo");
                System.out.println("4 - Transferencia");
                System.out.println("5 - terminar operação");
                num = ler.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Digite o valor que vc deseja depositar: ");
                        x = ler.nextDouble();
                        double saldoAtual = clienteAtual.getConta().depositar(x);
                        System.out.println("Valor depositado: " + x);
                        System.out.println("Novo saldo: " + saldoAtual);
                        break;
                    case 2:
                        System.out.println("qual valor que você deseja sacar: ");
                        s = ler.nextDouble();
                        double saldoRestante = clienteAtual.getConta().sacar(s);
                        System.out.println("Valor sacado: " + s);
                        System.out.println("Saldo restante: " + saldoRestante);
                        break;
                    case 3:
                        System.out.println(
                                clienteAtual.getNome() + ", seu saldo é de: " + clienteAtual.getConta().getSaldo());
                        break;
                    case 4:
                        System.out.println("Conta para a tranferencia: ");
                        conta2 = ler.next();
                        Cliente clienteTransferencia = Banco.getClienteByNumConta(clientes, conta2);
                        System.out.println("Valor da tranferencia: ");
                        float vt = ler.nextFloat();
                        double saldoTransf = clienteAtual.getConta().transfere(clienteTransferencia.getConta(), vt);
                        System.out.println("Transferido o valor de " + vt);
                        System.out.println("Saldo atualizado: " + saldoTransf);
                        break;
                    default:
                        System.out.println("Operação finalizada");
                        break;
                }
            } while (num < 5);

        } else {
            do {
                Juridica juri = new Juridica();
                System.out.println("Digite o nome da empresa: ");
                juri.setNome(ler.next());
                System.out.println("Digite o CNPJ: ");
                juri.setCnpj(ler.next());
                System.out.println("Digite seu numero da conta: ");
                juri.getConta().setNumero(ler.next());
                ju.add(juri);
                System.out.println("Dseja adicionar mais uma empresa? 1-Não / 2-Sim");
                if (ler.nextInt() == 1) {
                    flag = false;
                }
            } while (flag);

            do {
                System.out.println("Qual numero da conta que deseja acessar?");
                conta = ler.next();
                Juridica juricoAtual = Banco.getJuridicaByNumConta(ju, conta);
                System.out.println("Qual operação vc deseja realizar:");
                System.out.println("1 - depositar");
                System.out.println("2 - sacar");
                System.out.println("3 - ver saldo");
                System.out.println("4 - Transferencia");
                System.out.println("5 - terminar operação");
                num = ler.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Digite o valor que vc deseja depositar: ");
                        x = ler.nextDouble();
                        double saldoAtual = juricoAtual.getConta().depositar(x);
                        System.out.println("Valor depositado: " + x);
                        System.out.println("Novo saldo: " + saldoAtual);
                        break;
                    case 2:
                        System.out.println("qual valor que você deseja sacar: ");
                        s = ler.nextDouble();
                        double saldoRestante = juricoAtual.getConta().sacar(s);
                        System.out.println("Valor sacado: " + s);
                        System.out.println("Saldo restante: " + saldoRestante);
                        break;
                    case 3:
                        System.out.println(
                                juricoAtual.getNome() + ", seu saldo é de: " + juricoAtual.getConta().getSaldo());
                        break;
                    case 4:
                        System.out.println("Conta para a tranferencia: ");
                        conta2 = ler.next();
                        Juridica juriTransferencia = Banco.getJuridicaByNumConta(ju, conta2);
                        System.out.println("Valor da tranferencia: ");
                        float vt = ler.nextFloat();
                        double saldoTransf = juricoAtual.getConta().transfere(juriTransferencia.getConta(), vt);
                        System.out.println("Transferido o valor de " + vt);
                        System.out.println("Saldo atualizado: " + saldoTransf);
                        break;
                    default:
                        System.out.println("Operação finalizada");
                        break;
                }
            } while (num < 5);
        }

    }

    private static Juridica getJuridicaByNumConta(ArrayList<Juridica> ju, String numConta) {
        for (int i = 0; i < ju.size(); i++) {
            if (ju.get(i).getConta().getNumero().equals(numConta)) {
                return ju.get(i);
            }
        }
        return new Juridica();
    }

    private static Cliente getClienteByNumConta(ArrayList<Cliente> clientes, String numConta) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getConta().getNumero().equals(numConta)) {
                return clientes.get(i);
            }
        }
        return new Cliente();
    }
}
