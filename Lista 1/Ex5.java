import java.util.Scanner;

public class Ex5{
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a primeira fita de DNA utilizando 'C' 'A' 'G' 'T': ");
        String fita = ler.nextLine();

        System.out.println("Digite a segunda fita de DNA utilizando 'C' 'A' 'G' 'T': ");
        String fita2 = ler.nextLine();

        for(int i=0; i < fita.length(); i++){
            if(fita.charAt(i) != fita2.charAt(i)){
                System.out.println("Diferença na posição "+i);
                System.out.println(fita2.charAt(i));
            }
        }
        ler.close();
    }
}
