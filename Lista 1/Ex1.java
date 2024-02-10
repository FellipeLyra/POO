import java.util.Scanner;

public class Ex1 {
    public static void main(String []args){
        int v[] = new int [2];
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a primeira cor: ");
        String cor1 = ler.nextLine();
        
        System.out.println("Digite a segunda cor: ");
        String cor2 = ler.nextLine();

        switch (cor1) {
            case "preto":
                v[0] = 0;
                break;

            case "marrom":
                v[0] = 1;
                break;

            case "vermelho":
                v[0] = 2;
                break;

            case "laranja":
                v[0] = 3;
                break;

            case "amarelo":
                v[0] = 4;
                break;

            case "verde":
                v[0] = 5;
                break;

            case "azul":
                v[1] = 6;
                break;

            case "violeta":
                v[0] = 7;
                break;

            case "cinza":
                v[0] = 8;
                break;

            case "branco":
                v[0] = 9;
                break;

            default:
                System.out.println("Verifique se digitou corretamente e tudo minúsculo");
                break;
        }
        switch (cor2) {
            case "preto":
                v[1] = 0;
                break;

            case "marrom":
                v[1] = 1;
                break;

            case "vermelho":
                v[1] = 2;
                break;

            case "laranja":
                v[1] = 3;
                break;

            case "amarelo":
                v[1] = 4;
                break;

            case "verde":
                v[1] = 5;
                break;

            case "azul":
                v[1] = 6;
                break;

            case "violeta":
                v[1] = 7;
                break;

            case "cinza":
                v[1] = 8;
                break;

            case "branco":
                v[1] = 9;
                break;

            default:
                System.out.println("Verifique se digitou corretamente e tudo minúsculo");
                break;
        }

        System.out.println(v[0] *10 + v[1]);
        ler.close();
    }
}
