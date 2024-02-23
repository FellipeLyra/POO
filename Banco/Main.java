package Banco;

import java.util.Scanner;

public class Main {
    private static Conta nConta;


    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
   

        Conta conta1 = new Conta();


        Cliente c = new Cliente(null, null,  0, null);


        boolean sair = false;


        
        while(!sair){
            System.out.println("Você já tem uma conta? (1)Sim  (2)Não");
            int x  = ler.nextInt();
            boolean numexiste = false;

            


            while (!numexiste){
                if(x==2){
                    c.RandomConta();
                    ler.nextLine();
                    System.out.println("Digite seu nome: ");
                    c.setNome(ler.nextLine());
                    System.out.println("Digite seu cpf: ");
                    c.setCpf(ler.nextLine());
                    System.out.println("Digite seu telefone: ");
                    c.setTel(ler.nextLine());
                    System.out.println("Sua conta foi criada "+ c.getNome() +" o número da sua conta é " +c.getNconta());
                    numexiste = true;
                    c.criarBanco();
                } else{ 
                        System.out.println("Qual o número da sua conta         Aperte (-1) para voltar ");
                        int num = ler.nextInt();
                        if(num == c.getNconta()){
                            numexiste = true;
                            System.out.println("Login bem sucedido");
                            int n = 0;
                            while(n != -1){
                                System.out.println("Qual operação deseja realizar?        Digite (-1) para finalizar");
                                System.out.println("1 - depositar");
                                System.out.println("2 - sacar");
                                System.out.println("3 - ver saldo");
                                System.out.println("4 - Transferencia");
                                System.out.println("5 - terminar operação");
                                n = ler.nextInt();
                                

                                switch (n) {
                                    case 1:
                                        System.out.println("Digite o valor que deseja depositar: ");
                                        double valor = ler.nextDouble();
                                            conta1.depositar(valor);
                                        break;

                                    case 2:
                                        System.out.println("Conta para transferência: ");
                                        c.setNconta(ler.nextInt());

                                        System.out.println("Qual o valor para transferência: ");
                                        double vl = ler.nextDouble();

                                        conta1.transfere(nConta, vl);
                                        break;
                                        
                                    case 3:
                                        System.out.println("Seu saldo é de: " + conta1.saldo);
                                        break;
                                    
                                        case 4:
                                        System.out.println("Qual o valor que você deseja sacar: ");
                                        double s = ler.nextDouble();
                                        conta1.sacar(s);
                                        break;

                                    default:
                                        System.out.println("Operação finalizada");
                                        break;
                                }
                            }

                        }else if(num == -1){
                            break;
                        }
                        else{
                            System.out.println("Conta inexistente, tente novamente");
                        }
                    }
                }
                System.out.println("Deseja sair? (1)Sim  (2)Não");
                int opcaoSair = ler.nextInt();
                if (opcaoSair == 1) {
                    sair = true;
                }
            }
        }
}
