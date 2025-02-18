package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Seu primeiro programa"
                + "versionando com git e hospedando no gitHub!");
        System.out.println("Digite o primeiro valor:");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        int num2 = scan.nextInt();
        System.out.println("A soma é:" + (num1+num2));
        
    }
    
}
