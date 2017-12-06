import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] imiona = new String[5];
        imiona[1]= "x";

        for(int i = 0; i<imiona.length; i++){
            System.out.printf("Podaj "+ (i+1) + " Imię :");
            imiona[i] = scanner.nextLine();
        }

        for (int i = imiona.length-1; i>=0; i--){
            System.out.println("Cześć " + imiona[i]);
        }
    }
}
