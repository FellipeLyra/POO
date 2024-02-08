import java.util.Scanner;

public class Ex3 {
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        
        int qnum = 0;
        int maiornum = Integer.MIN_VALUE;
        int menornum = Integer.MAX_VALUE;
        int num;
        double média;
        int somanum = 0;

        while (true) {
            System.out.println("Digite alguns numeros e para finalizar digite -1");
            num = ler.nextInt();

            if(num == -1){
                break;
            }

            qnum ++;
            somanum += num;
            
            if (num > maiornum){
                maiornum = num;
            }

            if(num < menornum){
                menornum = num;
            }
            
        }
        média = somanum / qnum;

        System.out.println("A quantidade de numeros digitados pelo usuário foi de: " + qnum);
        System.out.println("O maior número digitado foi: " + maiornum);
        System.out.println("O menor número digitado foi: " + menornum);
        System.out.println("A média dos números digitados foi de: " + média);

        ler.close();

    }
}
